package declarative_knowledge;

public enum Ears {
    ERECT           ("erect"),
    FLOPPY          ("floppy"),
    BAT             ("bat"),
    ROSE            ("rose"),
    SEMI_PRICKED    ("semi-pricked"),
    BUTTON          ("button"),
    BUTTERFLY       ("butterfly"),
    CANDLE_FLAME    ("candle-flame"),
    FILBERT         ("filbert"),
    FOLDED          ("folded"),
    IDK             ("I don't know");

    private final String string;

    Ears(String string){
        this.string = string;
    }

    public String getString(){
        return string;
    }
}
