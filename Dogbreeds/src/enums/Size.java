package enums;

public enum Size {
    SMALL   ("small"),
    MEDIUM  ("medium"),
    LARGE   ("large"),
    IDK     ("I don't know");

    private final String string;

    Size(String string){
        this.string = string;
    }

    public String getString(){
        return string;
    }
}
