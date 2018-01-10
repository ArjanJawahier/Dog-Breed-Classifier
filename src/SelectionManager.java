import declarative_knowledge.Question;
import procedural_model.DogModel;
import user_interface.*;

import javax.swing.event.MouseInputAdapter;
import java.awt.event.MouseEvent;

public class SelectionManager extends MouseInputAdapter {
    private DogModel model;
    private DogPanel panel;

    public SelectionManager(DogModel model, DogPanel panel){
        this.model = model;
        this.panel = panel;
        panel.addMouseListener(this);
        panel.addMouseMotionListener(this);
    }

    private boolean clickedOnVertex(MouseEvent event, Vertex vertex) {
        return event.getX() >= vertex.getX()
                && event.getX() <= vertex.getX() + vertex.getWidth()
                && event.getY() >= vertex.getY()
                && event.getY() <= vertex.getY() + vertex.getHeight();
    }

    public void mouseMoved(MouseEvent event){

    }

    public void mouseDragged(MouseEvent event) {

    }

    public void mouseReleased(MouseEvent event){
        for(AnswerVertex answerVertex : model.getAnswerVertices()){
            if(clickedOnVertex(event, answerVertex)){
                model.addAnswer(answerVertex.getName());
                model.nextQuestion();
                break;
            }
        }

        for(ResultVertex resultVertex : model.getPossible()){
            if(clickedOnVertex(event, resultVertex)){
                model.addInfo(resultVertex);
                break;
            }
        }

        for(ResultVertex resultVertex : model.getImpossible()){
            if(clickedOnVertex(event, resultVertex)){
                model.addInfo(resultVertex);
                break;
            }
        }

        if(model.getExitButton() != null){
            if(clickedOnVertex(event, model.getExitButton())){
                model.setInfoBlock(null);
                model.setExitButton(null);
            }
        }

        if(model.getPreviousQuestionButton() != null){
            if(clickedOnVertex(event, model.getPreviousQuestionButton())){
                model.previousQuestion();
            }
        }

        if(model.getResetButton() != null){
            if(clickedOnVertex(event, model.getResetButton())){
                model.setQuestion(Question.ONE);
                model.setPreviousQuestionButton(null);
                model.replaceAnswerVertices();
                model.getPossible().clear();
                model.getImpossible().clear();
                model.setExitButton(null);
                model.setInfoBlock(null);
                panel.update(model, null);
            }
        }
    }
}
