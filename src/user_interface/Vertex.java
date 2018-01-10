package user_interface;

import java.awt.*;

public class Vertex {
    private int x, y;
    private int width, height;
    private String name;
    private Color backgroundColor;

    private static final int DEFAULT_X = 350;
    private static final int DEFAULT_Y = 90;
    private static final int DEFAULT_WIDTH = 256;
    private static final int DEFAULT_HEIGHT = 32;
    private static final String DEFAULT_NAME = "New vertex";
    private static final Color DEFAULT_COLOR = Color.WHITE;

    public Vertex(int x, int y, int width, int height, String name, Color backgroundColor) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.name = name;
        this.backgroundColor = backgroundColor;
    }

    public Vertex(){
        this(DEFAULT_X, DEFAULT_Y, DEFAULT_WIDTH, DEFAULT_HEIGHT, DEFAULT_NAME, DEFAULT_COLOR);
    }

    public Vertex(int x, int y, String name){
        this(x, y, DEFAULT_WIDTH, DEFAULT_HEIGHT, name, DEFAULT_COLOR);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }
}
