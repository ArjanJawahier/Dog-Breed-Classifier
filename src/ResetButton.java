import java.awt.*;

public class ResetButton extends Vertex {
    private final static int DEFAULT_WIDTH = 160;
    private final static int DEFAULT_HEIGHT = 30;
    private final static int DEFAULT_X = 400 - DEFAULT_WIDTH/2;
    private final static int DEFAULT_Y = 930;


    private final static Color DEFAULT_COLOR = Color.BLUE;
    private final static Color DEFAULT_TEXT_COLOR = Color.WHITE;

    private Color textColor;

    public ResetButton() {
        super(DEFAULT_X, DEFAULT_Y, "Start over" );
        setBackgroundColor(DEFAULT_COLOR);
        this.textColor = DEFAULT_TEXT_COLOR;
        setWidth(DEFAULT_WIDTH);
        setHeight(DEFAULT_HEIGHT);
    }

    public Color getTextColor() {
        return textColor;
    }

    public void setTextColor(Color textColor) {
        this.textColor = textColor;
    }
}
