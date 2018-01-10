import declarative_knowledge.Question;
import user_interface.DogFrame;
import procedural_model.DogModel;
import user_interface.DogPanel;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args){
        JLabel questionLabel = new JLabel(Question.ONE.getString(), SwingConstants.CENTER);
        questionLabel.setFont(new Font("Serif", Font.PLAIN, 30));
        questionLabel.setVerticalAlignment(SwingConstants.TOP);
        questionLabel.setBorder(BorderFactory.createLineBorder(Color.black));

        DogModel model = new DogModel();

        DogPanel panel = new DogPanel(model, questionLabel);
        panel.setBackground(new Color(255,255,153));
        panel.setLayout(new BorderLayout());
        panel.add(questionLabel);
        SelectionManager selectionManager = new SelectionManager(model, panel);

        DogFrame frame = new DogFrame("Dog Breeds");
        frame.add(panel);
        frame.setContentPane(panel);
    }
}
