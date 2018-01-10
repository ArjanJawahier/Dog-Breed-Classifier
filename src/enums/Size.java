package enums;

public enum Size {
    SMALL   ("Small (Example: Pug)"),
    MEDIUM  ("Medium (Example: Beagle)"),
    LARGE   ("Large (Example: German Shepherd)"),
    IDK     ("I don't know");

    private final String string;

    Size(String string){
        this.string = string;
    }

    public String getString(){
        return string;
    }
}
