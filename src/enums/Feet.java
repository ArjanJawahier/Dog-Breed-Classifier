package enums;

public enum Feet {
    CAT     ("cat"),
    HARE    ("hare"),
    WEBBED  ("webbed"),
    IDK     ("I don't know");

    private final String string;

    Feet(String string){
        this.string = string;
    }

    public String getString(){
        return string;
    }
}
