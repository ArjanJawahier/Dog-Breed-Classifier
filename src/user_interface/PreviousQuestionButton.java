package user_interface;

import java.awt.*;

public class PreviousQuestionButton extends Vertex {
    private final static int DEFAULT_X = 80;
    private final static int DEFAULT_Y = 400;
    private final static int DEFAULT_WIDTH = 160;
    private final static int DEFAULT_HEIGHT = 30;
    private final static Color DEFAULT_COLOR = Color.DARK_GRAY;
    private final static Color DEFAULT_TEXT_COLOR = Color.WHITE;

    private Color textColor;

    public PreviousQuestionButton() {
        super(DEFAULT_X, DEFAULT_Y, "Previous Question" );
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
