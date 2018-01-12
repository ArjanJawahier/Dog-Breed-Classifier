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
        for(Vertex vertex : model.getAnswerVertices()) {
            if (cursorOnVertex(event, vertex)) {
                panel.setShownImage("/images/" +  vertex.getName() + ".png");
                break;
            }
            if(model.getAnswerVertices().size() != 0){
                panel.deleteShownImage();
            }
        }

        if(model.getInfoBlock() == null) {
            for (Vertex vertex : model.getPossible()) {
                if (cursorOnVertex(event, vertex)) {
                    panel.setShownImage("/images/" + vertex.getName() + ".png" );
                    break;
                }
                if(event.getX() < 400){
                    panel.deleteShownImage();
                }
            }

            for (Vertex vertex : model.getImpossible()) {
                if (cursorOnVertex(event, vertex)) {
                    panel.setShownImage("/images/" + vertex.getName() + ".png" );
                    break;
                }
                if(event.getX() > 400){
                    panel.deleteShownImage();
                }
            }

        }

        panel.update(model, null);

    }

    public void mouseDragged(MouseEvent event) {

    }

    public void mouseReleased(MouseEvent event){
        if(model.getInfoBlock() == null){

            panel.deleteShownImage();

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
                    panel.setShownImage("/images/" + resultVertex.getName() + ".png" );
                    break;
                }
            }

            for(ResultVertex resultVertex : model.getImpossible()){
                if(cursorOnVertex(event, resultVertex)){
                    model.addInfo(resultVertex);
                    panel.setShownImage("/images/" + resultVertex.getName() + ".png" );
                    break;
                }
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
                model.setResultBox(null);
            }
        }

        panel.update(model, null);
    }
}
