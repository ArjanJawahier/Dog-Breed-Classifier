import enums.Question;

import java.util.Map;

public class InfoBlock extends Vertex {

    private ResultVertex vertex;
    private ReasoningUnit reasoningUnit;

    private final static int DEFAULT_X = 30;
    private final static int DEFAULT_Y = 30;
    private final static int DEFAULT_WIDTH = 650;
    private final static int DEFAULT_HEIGHT = 850;

    public InfoBlock(Map<Question, String> questionAnswerPairs, ResultVertex vertex){
        super();
        setX(DEFAULT_X);
        setY(DEFAULT_Y);
        setWidth(DEFAULT_WIDTH);
        setHeight(DEFAULT_HEIGHT);
        this.vertex = vertex;
        this.reasoningUnit = new ReasoningUnit(questionAnswerPairs, vertex);
        reasoningUnit.reason();
    }

    public ReasoningUnit getReasoningUnit() {
        return reasoningUnit;
    }
}
