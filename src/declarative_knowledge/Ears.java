package declarative_knowledge;

public enum Ears {
    BAT             ("Bat"),
    BUTTON          ("Button"),
    ERECT           ("Erect"),
    FLOPPY          ("Floppy"),
    FOLDED          ("Folded"),
    ROSE            ("Rose"),
    SEMI_PRICKED    ("Semi-pricked"),
    IDK             ("I don't know");

    private final String string;

    Ears(String string){
        this.string = string;
    }

    public String getString(){
        return string;
    }
}
