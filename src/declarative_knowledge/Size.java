package declarative_knowledge;

public enum Size {
    SMALL   ("Small"),
    MEDIUM  ("Medium"),
    LARGE   ("Large"),
    IDK     ("I don't know");

    private final String string;

    Size(String string){
        this.string = string;
    }

    public String getString(){
        return string;
    }
}
