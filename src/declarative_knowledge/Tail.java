package declarative_knowledge;

public enum Tail {
    BOBBED          ("Bobbed"),
    CURLED          ("Curled"),
    DOCKED          ("Docked"),
    OTTER           ("Otter"),
    SCREW           ("Screw"),
    SICKLE          ("Sickle"),
    STRAIGHT        ("Straight"),
    WHIP            ("Whip"),
    IDK             ("I don't know");

    //Might need to add a type called "Over the back", (samoyeds, akita inu,SHIBA)
    //currently simplified as RING tails

    private final String string;

    Tail(String string){
        this.string = string;
    }

    public String getString(){
        return string;
    }
}
