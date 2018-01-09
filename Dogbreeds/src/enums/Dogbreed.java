package enums;

public enum Dogbreed {
    BEAGLE              ("Beagle", Size.MEDIUM, Ears.FOLDED, Tail.WHIP, Coat.SHORT, Feet.CAT),
    BULLDOG             ("Bull Dog", Size.MEDIUM, Ears.ROSE, Tail.SCREW, Coat.SHORT, Feet.CAT),
    GOLDEN_RETRIEVER    ("Golden Retriever", Size.LARGE, Ears.FOLDED, Tail.OTTER, Coat.COMBINATION, Feet.WEBBED);

    private final String name;
    private final Size size;
    private final Ears ears;
    private final Tail tail;
    private final Coat coat;
    private final Feet feet;

    Dogbreed(String name, Size size, Ears ears, Tail tail, Coat coat, Feet feet) {
        this.name = name;
        this.size = size;
        this.ears = ears;
        this.tail = tail;
        this.coat = coat;
        this.feet = feet;
    }


    public String getName() {
        return name;
    }

    public Size size(){
        return size;
    }

    public Ears ears(){
        return ears;
    }

    public Tail tail() {
        return tail;
    }

    public Coat coat() {
        return coat;
    }

    public Feet feet() {
        return feet;
    }
}
