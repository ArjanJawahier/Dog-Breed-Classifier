import javax.swing.*;

public class DogFrame extends JFrame{
    private static final int DEFAULT_FRAME_WIDTH = 800, DEFAULT_FRAME_HEIGHT = 1000;

    public DogFrame(String name){
        super(name);
        setSize(DEFAULT_FRAME_WIDTH, DEFAULT_FRAME_HEIGHT);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
