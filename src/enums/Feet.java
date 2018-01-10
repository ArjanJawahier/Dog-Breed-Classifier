package enums;

public enum Feet {
    CAT     ("Cat (Most Common)"),
    HARE    ("Hare"),
    WEBBED  ("Webbed"),
    IDK     ("I don't know");

    private final String string;

    Feet(String string){
        this.string = string;
    }

    public String getString(){
        return string;
    }
}
