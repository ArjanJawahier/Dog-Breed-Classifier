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

    private boolean cursorOnVertex(MouseEvent event, Vertex vertex) {
        return event.getX() >= vertex.getX()
                && event.getX() <= vertex.getX() + vertex.getWidth()
                && event.getY() >= vertex.getY()
                && event.getY() <= vertex.getY() + vertex.getHeight();
    }


    public void mouseMoved(MouseEvent event){
        for(AnswerVertex answerVertex : model.getAnswerVertices()) {
            if (cursorOnVertex(event, answerVertex)) {
                panel.setShownImage("/images/" +  answerVertex.getName() + ".png");
                break;
            }
            panel.deleteShownImage();
        }
        panel.update(model, null);

    }

    public void mouseDragged(MouseEvent event) {

    }

    public void mouseReleased(MouseEvent event){
        for(AnswerVertex answerVertex : model.getAnswerVertices()){
            if(cursorOnVertex(event, answerVertex)){
                model.addAnswer(answerVertex.getName());
                model.nextQuestion();
                break;
            }
        }

        for(ResultVertex resultVertex : model.getPossible()){
            if(cursorOnVertex(event, resultVertex)){
                model.addInfo(resultVertex);
                break;
            }
        }

        for(ResultVertex resultVertex : model.getImpossible()){
            if(cursorOnVertex(event, resultVertex)){
                model.addInfo(resultVertex);
                break;
            }
        }

        if(model.getExitButton() != null){
            if(cursorOnVertex(event, model.getExitButton())){
                model.setInfoBlock(null);
                model.setExitButton(null);
            }
        }

        if(model.getPreviousQuestionButton() != null){
            if(cursorOnVertex(event, model.getPreviousQuestionButton())){
                model.previousQuestion();
            }
        }

        if(model.getResetButton() != null){
            if(cursorOnVertex(event, model.getResetButton())){
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
