package enums;

public enum Ears {
    BAT             ("Bat"),
    BUTTERFLY       ("Butterfly"), //Too niche
    BUTTON          ("Button"),
    CANDLE_FLAME    ("Candle-flame"), //Too niche
    ERECT           ("Erect"),
    FILBERT         ("Filbert"), //Too niche, only 1 dog breed has this
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
