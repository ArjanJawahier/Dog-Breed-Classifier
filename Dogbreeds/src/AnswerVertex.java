import java.awt.*;

public class AnswerVertex extends Vertex {
    public AnswerVertex(int x, int y, int width, int height, String name, Color backgroundColor) {
        super(x, y, width, height, name, backgroundColor);
    }

    public AnswerVertex(){
        super();
    }

    public AnswerVertex(int x, int y, String name){
        super(x, y, name);
    }


}
