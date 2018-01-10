package procedural_model;

import declarative_knowledge.Dogbreed;
import declarative_knowledge.Question;
import user_interface.ResultVertex;

import java.util.ArrayList;
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
        description = "The description you entered:\nSize: " + questionAnswerPairs.get(Question.ONE) + "\nEars: " + questionAnswerPairs.get(Question.TWO)
                + "\nTail: " + questionAnswerPairs.get(Question.THREE) + "\nCoat: " + questionAnswerPairs.get(Question.FOUR) + "\nFeet: " + questionAnswerPairs.get(Question.FIVE);
        realValues = "The features of a " + dogbreed.getName() + ":\nSize: " + dogbreed.size().getString() + "\nEars: " + dogbreed.ears().getString()
                + "\nTail: " + dogbreed.tail().getString() + "\nCoat: " + dogbreed.coat().getString() + "\nFeet: " + dogbreed.feet().getString();
        if(vertex.isPossible()){
            verdict = "The description you entered fits the features of the " + dogbreed.getName();
        } else {
            ArrayList<String> arguments = new ArrayList<>();
            for(Map.Entry<Question, String> entry : questionAnswerPairs.entrySet()){
                switch(entry.getKey()){
                    case ONE:
                        if(!entry.getValue().equals("I don't know") && !entry.getValue().equals(dogbreed.size().getString())){
                            arguments.add("the size of the " + dogbreed.getName() + " is " + dogbreed.size().getString() + " instead of " + entry.getValue());
                        }
                        break;
                    case TWO:
                        if(!entry.getValue().equals("I don't know") && !entry.getValue().equals(dogbreed.ears().getString())){
                            arguments.add("the ears of the " + dogbreed.getName() + " are \"" + dogbreed.ears().getString() + "\" ears instead of \"" + entry.getValue() + "\" ears");
                        }
                        break;
                    case THREE:
                        if(!entry.getValue().equals("I don't know") && !entry.getValue().equals(dogbreed.tail().getString())){
                            arguments.add("the tail of the " + dogbreed.getName() + " is a \"" + dogbreed.tail().getString() + "\" tail instead of a \"" + entry.getValue() + "\" tail");
                        }
                        break;
                    case FOUR:
                        if(!entry.getValue().equals("I don't know") && !entry.getValue().equals(dogbreed.coat().getString())){
                            arguments.add("the coat of the " + dogbreed.getName() + " is a \"" + dogbreed.coat().getString() + "\" coat instead of a \"" + entry.getValue() + "\" coat");
                        }
                        break;
                    case FIVE:
                        if(!entry.getValue().equals("I don't know") && !entry.getValue().equals(dogbreed.feet().getString())){
                            arguments.add("the feet of the " + dogbreed.getName() + " are \"" + dogbreed.feet().getString() + "\" feet instead of \"" + entry.getValue() + "\" feet");
                        }
                        break;
                }
            }
            verdict = "The description you entered does not match the features of the " + dogbreed.getName();
            for(int i = 0; i < arguments.size(); i++){
                if(i == 0){
                    verdict = verdict + ", because:\n";
                }
                verdict = verdict + arguments.get(i);
                if(i < arguments.size()-2){
                    verdict = verdict + ",\n";
                } else if(i == arguments.size() - 2) {
                    verdict = verdict + " and\n";
                } else {
                    verdict = verdict + ".";
                }
            }

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
