import java.awt.*;

public class ResultVertex extends Vertex{

    private boolean possible;

    private final static int RESULT_VERTEX_DEFAULT_HEIGHT = 35;

    public ResultVertex(int x, int y, int width, int height, String name, Color backgroundColor, Boolean possible) {
        super(x, y, width, height, name, backgroundColor);
        this.possible = possible;
        setHeight(RESULT_VERTEX_DEFAULT_HEIGHT);
    }

    public ResultVertex(){
        super();
        this.possible = false;
        setHeight(RESULT_VERTEX_DEFAULT_HEIGHT);
    }

    public ResultVertex(int x, int y, String name, Boolean possible){
        super(x, y, name);
        this.possible = possible;
        setHeight(RESULT_VERTEX_DEFAULT_HEIGHT);
    }

}
