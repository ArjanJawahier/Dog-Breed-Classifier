import enums.Question;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args){
        JLabel questionLabel = new JLabel(Question.ONE.getString(), SwingConstants.CENTER);
        questionLabel.setVerticalAlignment(SwingConstants.TOP);
        questionLabel.setBorder(BorderFactory.createLineBorder(Color.black));

        DogModel model = new DogModel();

        DogPanel panel = new DogPanel(model, questionLabel);
        panel.setLayout(new BorderLayout());
        panel.add(questionLabel);
        SelectionManager selectionManager = new SelectionManager(model, panel);

        DogFrame frame = new DogFrame("Dog Breeds");
        frame.add(panel);
        frame.setContentPane(panel);
    }
}
