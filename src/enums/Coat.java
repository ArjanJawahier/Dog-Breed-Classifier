package enums;

public enum Coat {
    CURLY           ("Curly"),
    DENSE           ("Dense"),
    DOUBLE          ("Double"),
    FLAT            ("Flat"), // Feels unnecessary
    LONG            ("Long"),
    SILKY           ("Silky"),
    SHORT           ("Short"),
    SHORT_SMOOTH    ("Short & Smooth"),
    SHORT_LONG      ("Double (Short and Long)"),
    WIRE            ("Wire"),
    IDK             ("I don't know");

    private final String string;

    Coat(String string){
        this.string = string;
    }

    public String getString(){
        return string;
    }
}
