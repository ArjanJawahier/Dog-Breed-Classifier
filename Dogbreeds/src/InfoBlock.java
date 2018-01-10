public class InfoBlock extends Vertex {

    private ResultVertex vertex;

    private final static int DEFAULT_X = 30;
    private final static int DEFAULT_Y = 30;
    private final static int DEFAULT_WIDTH = 650;
    private final static int DEFAULT_HEIGHT = 850;

    public InfoBlock(ResultVertex vertex){
        super();
        setX(DEFAULT_X);
        setY(DEFAULT_Y);
        setWidth(DEFAULT_WIDTH);
        setHeight(DEFAULT_HEIGHT);
        this.vertex = vertex;
    }
}
