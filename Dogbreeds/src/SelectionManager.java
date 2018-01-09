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
    }
}
