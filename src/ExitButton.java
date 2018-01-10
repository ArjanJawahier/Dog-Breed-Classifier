
public class ExitButton extends Vertex {

    private final static int DEFAULT_WIDTH = 30;
    private final static int DEFAULT_HEIGHT = 30;


    private InfoBlock ib;

    public ExitButton(InfoBlock infoBlock) {
        this.ib = infoBlock;
        setX(ib.getX() + ib.getWidth() - DEFAULT_WIDTH);
        setY(ib.getY());
        setWidth(DEFAULT_WIDTH);
        setHeight(DEFAULT_HEIGHT);
    }
}
