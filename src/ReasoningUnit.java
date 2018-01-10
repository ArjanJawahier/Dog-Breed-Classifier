import enums.Dogbreed;
import enums.Question;

import java.util.Map;

public class ReasoningUnit{

    private Dogbreed dogbreed;
    private Map<Question, String> questionAnswerPairs;
    private ResultVertex vertex;

    private String description;
    private String realValues;
    private String verdict;

    public ReasoningUnit(Map<Question, String> questionAnswerPairs, ResultVertex vertex) {
        this.questionAnswerPairs = questionAnswerPairs;
        this.vertex = vertex;
        findDogbreed();
        System.out.println(dogbreed);
    }

    public void findDogbreed(){
        for(Dogbreed dogbreed : Dogbreed.values()){
            if(dogbreed.getName().equals(vertex.getName())){
                this.dogbreed = dogbreed;
                break;
            }
        }
    }

    public void reason(){
        if(vertex.isPossible()){
            description = "The description you entered:\nSize: " + questionAnswerPairs.get(Question.ONE) + "\nEars: " + questionAnswerPairs.get(Question.TWO)
                    + "\nTail: " + questionAnswerPairs.get(Question.THREE) + "\nCoat: " + questionAnswerPairs.get(Question.FOUR) + "\nFeet: " + questionAnswerPairs.get(Question.FIVE);
            realValues = "The features of a " + dogbreed.getName() + ":\nSize: " + dogbreed.size().getString() + "\nEars: " + dogbreed.ears().getString()
                    + "\nTail: " + dogbreed.tail().getString() + "\nCoat: " + dogbreed.coat().getString() + "\nFeet: " + dogbreed.feet().getString();
            verdict = "The description you entered fits the features of the " + dogbreed.getName();
        } else {
            description = "";
            realValues = "";
            verdict = "";
        }
    }

    public String getDescription() {
        return description;
    }

    public String getRealValues() {
        return realValues;
    }

    public String getVerdict() {
        return verdict;
    }
}
