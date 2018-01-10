package declarative_knowledge;

public enum Coat {
    FLAT            ("flat"),
    SHORT           ("short"),
    COMBINATION     ("short and long (combination)"),
    DOUBLE          ("double"),
    HEAVY           ("heavy"),
    SILKY           ("silky"),
    CURLY           ("curly"),
    WIRE            ("wire"),
    LONG            ("long"),
    IDK             ("I don't know");

    private final String string;

    Coat(String string){
        this.string = string;
    }

    public String getString(){
        return string;
    }
}
