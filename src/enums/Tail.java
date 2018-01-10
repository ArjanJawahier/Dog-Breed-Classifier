package enums;

public enum Tail {
    BOBBED          ("bobbed"),
    DOCKED          ("docked"),
    RING            ("ring"),
    SICKLE          ("sickle"),
    OTTER           ("otter"),
    SCREW           ("screw"),
    WHIP            ("whip"),
    IDK             ("I don't know");

    private final String string;

    Tail(String string){
        this.string = string;
    }

    public String getString(){
        return string;
    }
}
