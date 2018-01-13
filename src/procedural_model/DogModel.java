package procedural_model;

import declarative_knowledge.*;
import user_interface.*;

import java.awt.*;
import java.util.*;

public class DogModel extends Observable {

    private Question question;

    private ArrayList<AnswerVertex> answerVertices = new ArrayList<>();
    private Map<Question, String> questionAnswerPairs = new HashMap<Question, String>();

    private ArrayList<ResultVertex> possible = new ArrayList<>();
    private ArrayList<ResultVertex> impossible = new ArrayList<>();

    private ResetButton resetButton;
    private PreviousQuestionButton previousQuestionButton;
    private InfoBlock infoBlock;
    private ExitButton exitButton;
    private Vertex resultBox;

    public DogModel() {
        setResetButton(new ResetButton());
        setQuestion(Question.ONE);
        replaceAnswerVertices();
    }

    public void inferByExclusion(){
        int xPossible = 20;
        int xImpossible = 530;
        int yPossible = 10;
        int yImpossible = 10;
        int ySpacing = 17;
        for(Dogbreed dogbreed : Dogbreed.values()){
            if(!questionAnswerPairs.get(Question.ONE).equals(Size.IDK.getString()) && !dogbreed.size().getString().equals(questionAnswerPairs.get(Question.ONE))){
                impossible.add(new ResultVertex(xImpossible, yImpossible, dogbreed.getName(), false));
                yImpossible += ySpacing;
            } else if(!questionAnswerPairs.get(Question.TWO).equals(Ears.IDK.getString()) && !dogbreed.ears().getString().equals(questionAnswerPairs.get(Question.TWO))){
                impossible.add(new ResultVertex(xImpossible, yImpossible, dogbreed.getName(), false));
                yImpossible += ySpacing;
            } else if(!questionAnswerPairs.get(Question.THREE).equals(Tail.IDK.getString()) && !dogbreed.tail().getString().equals(questionAnswerPairs.get(Question.THREE))){
                impossible.add(new ResultVertex(xImpossible, yImpossible, dogbreed.getName(), false));
                yImpossible += ySpacing;
            } else if(!questionAnswerPairs.get(Question.FOUR).equals(Coat.IDK.getString()) && !dogbreed.coat().getString().equals(questionAnswerPairs.get(Question.FOUR))){
                impossible.add(new ResultVertex(xImpossible, yImpossible, dogbreed.getName(), false));
                yImpossible += ySpacing;
            } else if(!questionAnswerPairs.get(Question.FIVE).equals(Feet.IDK.getString()) && !dogbreed.feet().getString().equals(questionAnswerPairs.get(Question.FIVE))){
                impossible.add(new ResultVertex(xImpossible, yImpossible, dogbreed.getName(), false));
                yImpossible += ySpacing;
            } else {
                possible.add(new ResultVertex(xPossible, yPossible, dogbreed.getName(), true));
                yPossible += ySpacing;
            }
        }
        String resultText = makeResultText();
        setResultBox(new Vertex(300, 150, 200, 400, resultText, Color.YELLOW));
    }

    private String makeResultText(){
        String text;
        if (possible.size() == 0) {
            text = "It looks like there is no dog in\n" +
                    "our database that fits your\n" +
                    "description. We're sorry!\n" +
                    "Press the \"Start over\"\n" +
                    "button at the bottom of the page\n" +
                    "to try again. You can click on any \n" +
                    "of the dog breeds to the right to\n" +
                    "find out why they do not \n" +
                    "fit your description.";
        } else if (possible.size() == 1) {
            text = "It looks like there is 1 dog in\n" +
                    "our database that fits your\n" +
                    "description. You can check out\n" +
                    "the dog by clicking its name\n" +
                    "to the left. Press the\n" +
                    "\"Start over\" button at the\n" +
                    " bottom of the page to try again.\n" +
                    "You can click on any of the dog\n" +
                    " breeds to the right to find out\n" +
                    " why they do not fit your\n" +
                    "description.";
        } else {
            text = "It looks like there are multiple\n" +
                    " dogs in our database that fit\n" +
                    " your description. You can check\n" +
                    " out the dogs by clicking on\n" +
                    " their names to the left.\n" +
                    "Press the \"Start over\" button\n" +
                    " at the bottom of the page to\n" +
                    " try again. You can click on any\n" +
                    " of the dog breeds to the right\n" +
                    " to find out why they do not \n" +
                    "fit your description.";
        }
        return text;
    }

    public Question getQuestion() {
        return question;
    }

    public void previousQuestion(){
        int i=0 ;
        for(Question testQuestion : Question.values()){
            if(testQuestion == getQuestion()){
                break;
            }
            i++;
        }
        if(i > 1){
            System.out.println(i);
            setQuestion(Question.values()[--i]);
            replaceAnswerVertices();
            if(i == 1) {
                setPreviousQuestionButton(null);
            } else {
                setPreviousQuestionButton(new PreviousQuestionButton());
            }
        }
        setChanged();
        notifyObservers();
    }

    public void nextQuestion(){
        int i=0 ;
        for(Question testQuestion : Question.values()){
            if(testQuestion == getQuestion()){
                break;
            }
            i++;
        }
        if(i == Question.values().length - 1){
            answerVertices.clear();
            setQuestion(Question.EMPTY);
            setPreviousQuestionButton(null);
            inferByExclusion();
        } else {
            setQuestion(Question.values()[++i]);
            setPreviousQuestionButton(new PreviousQuestionButton());
            replaceAnswerVertices();
        }
        setChanged();
        notifyObservers();
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public void replaceAnswerVertices(){
        answerVertices.clear();
        int x = 272;
        int y = 100;
        int ySpacing = 40;
        switch(question){
            case ONE:
                for(Size size : Size.values()){
                    addAnswerVertex(new AnswerVertex(x, y, size.getString()));
                    y += ySpacing;
                }
                break;
            case TWO:
                for(Ears ears : Ears.values()){
                    addAnswerVertex(new AnswerVertex(x, y, ears.getString()));
                    y += ySpacing;
                }
                break;
            case THREE:
                for(Tail tail : Tail.values()){
                    addAnswerVertex(new AnswerVertex(x, y, tail.getString()));
                    y += ySpacing;
                }
                break;
            case FOUR:
                for(Coat coat : Coat.values()){
                    addAnswerVertex(new AnswerVertex(x, y, coat.getString()));
                    y += ySpacing;
                }
                break;
            case FIVE:
                for(Feet feet : Feet.values()){
                    addAnswerVertex(new AnswerVertex(x, y, feet.getString()));
                    y += ySpacing;
                }
                break;
        }
    }

    public void addAnswerVertex(AnswerVertex answerVertex) {
        answerVertices.add(answerVertex);
    }

    public void addAnswer(String answer){
        questionAnswerPairs.put(question, answer);
    }

    public ArrayList<AnswerVertex> getAnswerVertices() {
        return answerVertices;
    }

    public ArrayList<ResultVertex> getPossible() {
        return possible;
    }

    public ArrayList<ResultVertex> getImpossible() {
        return impossible;
    }

    public void addInfo(ResultVertex vertex){
        InfoBlock infoBlock = new InfoBlock(questionAnswerPairs, vertex);
        ExitButton exitButton = new ExitButton(infoBlock);
        setExitButton(exitButton);
        setInfoBlock(infoBlock);
    }

    public InfoBlock getInfoBlock() {
        return infoBlock;
    }

    public void setInfoBlock(InfoBlock infoBlock) {
        this.infoBlock = infoBlock;
        setChanged();
        notifyObservers();
    }

    public void setExitButton(ExitButton exitButton) {
        this.exitButton = exitButton;
    }

    public ExitButton getExitButton() {
        return exitButton;
    }

    public PreviousQuestionButton getPreviousQuestionButton() {
        return previousQuestionButton;
    }

    public void setPreviousQuestionButton(PreviousQuestionButton previousQuestionButton) {
        this.previousQuestionButton = previousQuestionButton;
    }

    public ResetButton getResetButton() {
        return resetButton;
    }

    public void setResetButton(ResetButton resetButton) {
        this.resetButton = resetButton;
    }

    public Vertex getResultBox() {
        return resultBox;
    }

    public void setResultBox(Vertex resultBox) {
        this.resultBox = resultBox;
    }
}
