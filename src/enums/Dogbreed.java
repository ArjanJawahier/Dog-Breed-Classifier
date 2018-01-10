package enums;

public enum Dogbreed {

    //Name                 //("", Size., Ears., Tail., Coat., Feet.),
    AKITA                  ("Akita",                  Size.LARGE,    Ears.ERECT,        Tail.RING,          Coat.DENSE,       Feet.CAT),
    AUSTRALIAN_SHEPHERD    ("Australian Shepherd",    Size.MEDIUM,   Ears.FOLDED,       Tail.SICKLE,        Coat.LONG,        Feet.CAT),
    BEAGLE                 ("Beagle",                 Size.MEDIUM,   Ears.FOLDED,       Tail.WHIP,          Coat.SHORT,       Feet.CAT),
    BOXER                  ("Boxer",                  Size.LARGE,    Ears.FOLDED,       Tail.DOCKED,        Coat.SHORT,       Feet.HARE),
    BULLDOG                ("Bull Dog",               Size.MEDIUM,   Ears.ROSE,         Tail.SCREW,         Coat.SHORT,       Feet.CAT),
    CHIHUAHUA              ("Chihuahua",              Size.SMALL     Ears.ERECT         Tail.SICKLE         Coat.SHORT        Feet.CAT),
    DACHSHUND              ("Dachshund",              Size.SMALL,    Ears.FOLDED,       Tail.WHIP,          Coat.SHORT,       Feet.CAT),
    FRENCH_BULLDOG         ("French Bulldog",         Size.SMALL,    Ears.BAT,          Tail.SCREW,         Coat.FLAT,        Feet.CAT),
    GOLDEN_RETRIEVER       ("Golden Retriever",       Size.LARGE,    Ears.FOLDED,       Tail.OTTER_SABER,   Coat.SHORT_LONG,  Feet.WEBBED),
    GERMAN_SHEPHERD        ("German Shepher",         Size.LARGE,    Ears.ERECT,        Tail.OTTER_SABER,   Coat.SHORT_LONG,  Feet.CAT),
    LABRADOR               ("Labrador",               Size.LARGE,    Ears.FOLDED,       Tail.OTTER_SABER,   Coat.SHORT,       Feet.WEBBED),
    MINIATURE_SCHNAUZER    ("Miniature Schnauzer",    Size.SMALL,    Ears.SEMI_PRICKED, Tail.DOCKED,        Coat.WIRE,        Feet.CAT),
    PEMBROKE_WELSH_CORGI   ("Pembroke Welsh Corgi",   Size.SMALL,    Ears.ERECT,        Tail.BOBBED,        Coat.SHORT,       Feet.CAT),
    POMERANIAN             ("Pomeranian",             Size.SMALL,    Ears.ERECT,        Tail.SICKLE,        Coat.DENSE,       Feet.CAT),
    POODLE                 ("Poodle",                 Size.SMALL,    Ears.FLOPPY,       Tail.DOCKED,        Coat.CURLY,       Feet.HARE),
    PUG                    ("Pug",                    Size.SMALL,    Ears.BUTTON,       Tail.SCREW,         Coat.SHORT,       Feet.CAT),
    ROTTWEILER             ("Rottweiler",             Size.LARGE,    Ears.FOLDED,       Tail.SICKLE,        Coat.SHORT,       Feet.CAT),
    SAMOYED                ("Samoyed",                Size.LARGE,    Ears.ERECT,        Tail.RING,          Coat.DENSE,       Feet.CAT),
    SHETLAND_SHEEPDOG      ("Shetland Sheepdog",      Size.MEDIUM,   Ears.SEMI_PRICKED, Tail.OTTER_SABER ,  Coat.LONG,        Feet.CAT),
    SHIBA                  ("Shiba",                  Size.MEDIUM,   Ears.ERECT,        Tail.RING,          Coat.DENSE,       Feet.CAT),
    SHIH_TZU               ("Shih Tzu",               Size.SMALL,    Ears.FOLDED,       Tail.SICKLE,        Coat.LONG,        Feet.CAT),
    SIBERIAN_HUSKY         ("Siberian Husky",         Size.LARGE,    Ears.ERECT,        Tail.SICKLE,        Coat.DENSE,       Feet.CAT),
    YORKSHIRE_TERRIER      ("Yorkshire Terrier",      Size.SMALL,    Ears.ERECT,        Tail.STRAIGHT,      Coat.LONG,        Feet.CAT);

    private final String name;
    private final Size size;
    private final Ears ears;
    private final Tail tail;
    private final Coat coat;
    private final Feet feet;

    Dogbreed(String name, Size size, Ears ears, Tail tail, Coat coat, Feet feet) {
        this.name = name;
        this.size = size;
        this.ears = ears;
        this.tail = tail;
        this.coat = coat;
        this.feet = feet;
    }


    public String getName() {
        return name;
    }

    public Size size(){
        return size;
    }

    public Ears ears(){
        return ears;
    }

    public Tail tail() {
        return tail;
    }

    public Coat coat() {
        return coat;
    }

    public Feet feet() {
        return feet;
    }
}
