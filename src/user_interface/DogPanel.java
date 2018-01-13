package user_interface;

import procedural_model.DogModel;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Observable;
import java.util.Observer;

public class DogPanel extends JPanel implements Observer {
    private DogModel dogModel;
    private JLabel questionLabel;
    private BufferedImage shownImage;

    public DogPanel(DogModel graphModel, JLabel questionLabel){
        super();
        this.dogModel = graphModel;
        this.dogModel.addObserver(this);
        this.questionLabel = questionLabel;
        setVisible(true);
    }

    public void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
        graphics.setFont(new Font("default", Font.BOLD, 12));
        paintQuestion(graphics);
        paintAnswerVertices(graphics);
        paintResetButton(graphics);
        paintPreviousQuestionButton(graphics);
        paintResults(graphics);
        paintInfoBlock(graphics);
        paintExitButton(graphics);
        paintShownImage(graphics);
    }

    private void paintQuestion(Graphics graphics){
        questionLabel.setText(dogModel.getQuestion().getString());
    }

    private void paintAnswerVertices(Graphics graphics){
        for(AnswerVertex vertex : dogModel.getAnswerVertices()){
            graphics.setColor(vertex.getBackgroundColor());
            graphics.fillRect(vertex.getX(), vertex.getY(), vertex.getWidth(), vertex.getHeight());
            graphics.setColor(Color.BLACK);
            graphics.drawRect(vertex.getX(), vertex.getY(), vertex.getWidth(), vertex.getHeight());
            drawCenteredName(vertex, graphics);
        }
    }

    private void drawCenteredName(Vertex vertex, Graphics graphics){
        int[] coordinates = computeStartPoint(vertex, graphics);
        graphics.drawString(vertex.getName(), coordinates[0], coordinates[1]);
    }

    private int[] computeStartPoint(Vertex vertex, Graphics graphics){
        int[] coordinates = new int[2];
        FontMetrics fm = graphics.getFontMetrics();
        //These coordinates define the starting point for the text in the vertex
        coordinates[0] = vertex.getX() + ((vertex.getWidth() - fm.stringWidth(vertex.getName())) / 2);  //The x-coordinate
        coordinates[1] = vertex.getY() + ((vertex.getHeight() - fm.getHeight()) / 2) + fm.getAscent();  //The y-coordinate
        return coordinates;
    }

    private void paintResetButton(Graphics graphics){
        if(dogModel.getResetButton() != null){
            ResetButton button = dogModel.getResetButton();
            graphics.setColor(button.getBackgroundColor());
            graphics.fillRect(button.getX(), button.getY(), button.getWidth(), button.getHeight());
            graphics.setColor(button.getTextColor());
            drawCenteredName(button, graphics);
            graphics.setColor(Color.BLACK);
            graphics.drawRect(button.getX(), button.getY(), button.getWidth(), button.getHeight());
        }
    }

    private void paintShownImage(Graphics graphics){
        if(shownImage != null){
            int x = 400 - shownImage.getWidth()/2;
            graphics.drawImage(shownImage, x, 630, shownImage.getWidth(), shownImage.getHeight(), null);
            graphics.setColor(Color.BLACK);
            graphics.drawRect(x, 630, shownImage.getWidth(), shownImage.getHeight());
        }
    }

    private void paintPreviousQuestionButton(Graphics graphics){
        if(dogModel.getPreviousQuestionButton() != null){
            PreviousQuestionButton button = dogModel.getPreviousQuestionButton();
            graphics.setColor(button.getBackgroundColor());
            graphics.fillRect(button.getX(), button.getY(), button.getWidth(), button.getHeight());
            graphics.setColor(button.getTextColor());
            drawCenteredName(button, graphics);
            graphics.setColor(Color.BLACK);
            graphics.drawRect(button.getX(), button.getY(), button.getWidth(), button.getHeight());
        }
    }

    private void paintResults(Graphics graphics){
        paintPossibleDogs(graphics);
        paintImpossibleDogs(graphics);
        paintResultBox(graphics);
    }

    private void paintPossibleDogs(Graphics graphics){
        for(ResultVertex vertex : dogModel.getPossible()){
            graphics.setColor(Color.GREEN);
            graphics.fillRect(vertex.getX(), vertex.getY(), vertex.getWidth(), vertex.getHeight());
            graphics.setColor(Color.BLACK);
            graphics.drawRect(vertex.getX(), vertex.getY(), vertex.getWidth(), vertex.getHeight());
            drawCenteredName(vertex, graphics);
        }
    }

    private void paintImpossibleDogs(Graphics graphics){
        for(ResultVertex vertex : dogModel.getImpossible()){
            graphics.setColor(Color.RED);
            graphics.fillRect(vertex.getX(), vertex.getY(), vertex.getWidth(), vertex.getHeight());
            graphics.setColor(Color.BLACK);
            graphics.drawRect(vertex.getX(), vertex.getY(), vertex.getWidth(), vertex.getHeight());
            drawCenteredName(vertex, graphics);
        }
    }

    private void paintResultBox(Graphics graphics){
        if(dogModel.getResultBox() != null){
            Vertex box = dogModel.getResultBox();
            graphics.setColor(box.getBackgroundColor());
            graphics.fillRect(box.getX(), box.getY(), box.getWidth(), box.getHeight());
            graphics.setColor(Color.BLACK);
            for(int i = 0; i < 5; i++){
                graphics.drawRect(box.getX() + i, box.getY() + i, box.getWidth() - 2*i, box.getHeight() - 2*i);
            }
            drawNewlineString(graphics, box.getName(), box.getX() + 10, box.getY() + 10);
        }
    }

    private void paintInfoBlock(Graphics graphics){
        if( dogModel.getInfoBlock() != null){
            InfoBlock ib = dogModel.getInfoBlock();
            graphics.setColor(Color.WHITE);
            graphics.fillRect(ib.getX(), ib.getY(), ib.getWidth(), ib.getHeight());
            graphics.setColor(Color.BLACK);
            for(int i = 0; i < 5; i++){
                graphics.drawRect(ib.getX() + i, ib.getY() + i, ib.getWidth() - 2*i, ib.getHeight() - 2*i);
            }
            String realValues = this.dogModel.getInfoBlock().getReasoningUnit().getRealValues();
            String description = this.dogModel.getInfoBlock().getReasoningUnit().getDescription();
            String verdict = this.dogModel.getInfoBlock().getReasoningUnit().getVerdict();
            drawNewlineString(graphics, realValues, ib.getX() + 20, ib.getY() + 15);
            drawNewlineString(graphics, description, ib.getX() + ib.getWidth()/2, ib.getY() + 15);
            drawNewlineString(graphics, verdict, ib.getX() + 20, ib.getY() + graphics.getFontMetrics().getHeight()*10);
        }
    }

    private void drawNewlineString(Graphics graphics, String text, int x, int y) {
        for (String line : text.split("\n"))
            graphics.drawString(line, x, y += graphics.getFontMetrics().getHeight());
    }

    private void paintExitButton(Graphics graphics){
        if(dogModel.getExitButton() != null){
            ExitButton eb = dogModel.getExitButton();
            graphics.setColor(Color.MAGENTA);
            graphics.fillRect(eb.getX(), eb.getY(), eb.getWidth(), eb.getHeight());
            graphics.setColor(Color.ORANGE);
            graphics.fillRect(eb.getX() + 10, eb.getY() + 10, eb.getWidth() - 20, eb.getHeight() - 20);
            graphics.setColor(Color.BLACK);
            graphics.drawRect(eb.getX(), eb.getY(), eb.getWidth(), eb.getHeight());
        }
    }

    public void update(Observable observed, Object message) {
        repaint();
    }

    public void setShownImage(String fileLocation){
        BufferedImage buffImg = new BufferedImage(240, 240, BufferedImage.TYPE_INT_ARGB);
        try {
            buffImg = ImageIO.read(DogPanel.class.getResource(fileLocation));
        }
        catch (Exception e) {
            try{
                buffImg = ImageIO.read(DogPanel.class.getResource("/src" + fileLocation));
            }
            catch (Exception f){
                System.out.println("Image fetching failed twice: Apparently there are no images with this URL: " + fileLocation);
            }
        }
        this.shownImage = buffImg;
    }

    public void deleteShownImage(){
        this.shownImage = null;
    }
}
