package declarative_knowledge;

public enum Dogbreed {
    //Name                 //("", Size., Ears., Tail., Coat., Feet.),
    AKITA                  ("Akita",                  Size.LARGE,      Ears.ERECT,        Tail.CURLED,        Coat.DENSE,         Feet.CAT),
    ALASKAN_MALAMUTE       ("Alaskan Malamute",       Size.LARGE,      Ears.ERECT,        Tail.CURLED,        Coat.DENSE,         Feet.CAT),
    AUSTRALIAN_SHEPHERD    ("Australian Shepherd",    Size.MEDIUM,     Ears.BUTTON,       Tail.SICKLE,        Coat.LONG,          Feet.CAT),
    AUSTRALIAN_TERRIER     ("Australian Terrier",     Size.SMALL,      Ears.ERECT,        Tail.DOCKED,        Coat.LONG,          Feet.CAT),
    BEAGLE                 ("Beagle",                 Size.MEDIUM,     Ears.FOLDED,       Tail.WHIP,          Coat.SHORT,         Feet.CAT),
    BEARDED_COLLIE         ("Bearded Collie",         Size.MEDIUM,     Ears.FLOPPY,       Tail.OTTER,         Coat.SILKY,         Feet.CAT),
    BELGIAN_SHEEPDOG       ("Belgian Sheepdog",       Size.LARGE,      Ears.ERECT,        Tail.OTTER,         Coat.LONG,          Feet.HARE),
    BLOODHOUND             ("Bloodhound",             Size.LARGE,      Ears.FLOPPY,       Tail.STRAIGHT,      Coat.SHORT,         Feet.HARE),
    BORDER_COLLIE          ("Border Collie",          Size.LARGE,      Ears.SEMI_PRICKED, Tail.OTTER,         Coat.LONG,          Feet.CAT),
    BORZOI                 ("Borzoi",                 Size.LARGE,      Ears.ROSE,         Tail.OTTER,         Coat.CURLY,         Feet.HARE),
    BOXER                  ("Boxer",                  Size.LARGE,      Ears.FOLDED,       Tail.DOCKED,        Coat.SHORT,         Feet.HARE),
    BOYKIN_SPANIEL         ("Boykin Spaniel",         Size.MEDIUM,     Ears.FLOPPY,       Tail.DOCKED,        Coat.LONG,          Feet.CAT),
    BULLDOG                ("Bull Dog",               Size.MEDIUM,     Ears.ROSE,         Tail.SCREW,         Coat.SHORT,         Feet.CAT),
    CHIHUAHUA              ("Chihuahua",              Size.SMALL,      Ears.ERECT,        Tail.SICKLE,        Coat.SHORT,         Feet.CAT),
    CHINESE_CRESTED        ("Chinese Crested",        Size.SMALL,      Ears.ERECT,        Tail.WHIP,          Coat.LONG,          Feet.HARE),
    CHINESE_SHAR_PEI       ("Chinese Shar Pei",       Size.LARGE,      Ears.BUTTON,       Tail.SICKLE,        Coat.SHORT,         Feet.CAT),
    CHOW_CHOW              ("Chow Chow",              Size.LARGE,      Ears.ERECT,        Tail.CURLED,        Coat.DENSE,         Feet.CAT),
    DACHSHUND              ("Dachshund",              Size.SMALL,      Ears.FOLDED,       Tail.WHIP,          Coat.SHORT,         Feet.CAT),
    DOBERMANN              ("Dobermann",              Size.LARGE,      Ears.BAT,          Tail.WHIP,          Coat.FLAT,          Feet.HARE),
    FINNISH_LAPPHUND       ("Finnish Lapphund",       Size.MEDIUM,     Ears.ERECT,        Tail.CURLED,        Coat.DENSE,         Feet.CAT),
    FLATCOATED_RETRIEVER   ("Flatcoated Retriever",   Size.LARGE,      Ears.FLOPPY,       Tail.OTTER,         Coat.LONG,          Feet.CAT),
    FRENCH_BULLDOG         ("French Bulldog",         Size.SMALL,      Ears.BAT,          Tail.SCREW,         Coat.SHORT,         Feet.CAT),
    GERMAN_SHEPHERD        ("German Shepherd",        Size.LARGE,      Ears.ERECT,        Tail.OTTER,         Coat.SHORT_LONG,    Feet.CAT),
    GOLDEN_RETRIEVER       ("Golden Retriever",       Size.LARGE,      Ears.FOLDED,       Tail.OTTER,         Coat.SHORT_LONG,    Feet.WEBBED),
    GREAT_PYRENEES         ("Great Pyrenees",         Size.LARGE,      Ears.FOLDED,       Tail.OTTER,         Coat.DENSE,         Feet.HARE),
    GREYHOUND              ("Greyhound",              Size.LARGE,      Ears.ROSE,         Tail.WHIP,          Coat.FLAT,          Feet.HARE),
    KEESHOND               ("Keeshond",               Size.MEDIUM,     Ears.ERECT,        Tail.CURLED,        Coat.DENSE,         Feet.CAT),
    LABRADOR               ("Labrador",               Size.LARGE,      Ears.FOLDED,       Tail.OTTER,         Coat.SHORT,         Feet.WEBBED),
    LEONBERGER             ("Leonberger",             Size.LARGE,      Ears.FLOPPY,       Tail.OTTER,         Coat.DENSE,         Feet.CAT),
    LHASA_APSO             ("Lhasa Apso",             Size.SMALL,      Ears.FOLDED,       Tail.CURLED,        Coat.LONG,          Feet.CAT),
    MALTESE                ("Maltese",                Size.SMALL,      Ears.FOLDED,       Tail.CURLED,        Coat.SILKY,         Feet.CAT),
    MINIATURE_SCHNAUZER    ("Miniature Schnauzer",    Size.SMALL,      Ears.SEMI_PRICKED, Tail.DOCKED,        Coat.WIRE,          Feet.CAT),
    NEWFOUNDLAND           ("Newfoundland",           Size.LARGE,      Ears.FOLDED,       Tail.OTTER,         Coat.DENSE,         Feet.WEBBED),
    NORWEGIAN_ELKHOUND     ("Norwegian Elkhound",     Size.LARGE,      Ears.ERECT,        Tail.CURLED,        Coat.DENSE,         Feet.CAT),
    OLD_ENGLISH_SHEEPDOG   ("Old English Sheepdog",   Size.LARGE,      Ears.FOLDED,       Tail.OTTER,         Coat.DENSE,         Feet.CAT),
    PEKINGESE              ("Pekingese",              Size.SMALL,      Ears.FOLDED,       Tail.CURLED,        Coat.SILKY,         Feet.CAT),
    PEMBROKE_WELSH_CORGI   ("Pembroke Welsh Corgi",   Size.SMALL,      Ears.BAT,          Tail.BOBBED,        Coat.SHORT,         Feet.CAT),
    PITBULL                ("Pitbull",                Size.MEDIUM,     Ears.BUTTON,       Tail.WHIP,          Coat.FLAT,          Feet.WEBBED),
    POMERANIAN             ("Pomeranian",             Size.SMALL,      Ears.ERECT,        Tail.SICKLE,        Coat.DENSE,         Feet.CAT),
    POODLE                 ("Poodle",                 Size.SMALL,      Ears.FLOPPY,       Tail.DOCKED,        Coat.CURLY,         Feet.HARE),
    PUG                    ("Pug",                    Size.SMALL,      Ears.BUTTON,       Tail.SCREW,         Coat.SHORT,         Feet.CAT),
    ROTTWEILER             ("Rottweiler",             Size.LARGE,      Ears.FOLDED,       Tail.SICKLE,        Coat.SHORT,         Feet.CAT),
    RUSSEL_TERRIER         ("Russel Terrier",         Size.SMALL,      Ears.FOLDED,       Tail.STRAIGHT,      Coat.SHORT,         Feet.CAT),
    SAINT_BERNARD          ("Saint Bernard",          Size.LARGE,      Ears.FLOPPY,       Tail.OTTER,         Coat.DENSE,         Feet.CAT),
    SAMOYED                ("Samoyed",                Size.LARGE,      Ears.ERECT,        Tail.CURLED,        Coat.DENSE,         Feet.HARE),
    SHETLAND_SHEEPDOG      ("Shetland Sheepdog",      Size.MEDIUM,     Ears.SEMI_PRICKED, Tail.OTTER,         Coat.LONG,          Feet.CAT),
    SHIBA                  ("Shiba",                  Size.MEDIUM,     Ears.ERECT,        Tail.CURLED,        Coat.DENSE,         Feet.CAT),
    SHIH_TZU               ("Shih Tzu",               Size.SMALL,      Ears.FOLDED,       Tail.SICKLE,        Coat.LONG,          Feet.CAT),
    SIBERIAN_HUSKY         ("Siberian Husky",         Size.LARGE,      Ears.ERECT,        Tail.SICKLE,        Coat.DENSE,         Feet.CAT),
    SWEDISH_VALLHUND       ("Swedish Vallhund",       Size.MEDIUM,     Ears.BAT,          Tail.CURLED,        Coat.SHORT,         Feet.CAT),
    YORKSHIRE_TERRIER      ("Yorkshire Terrier",      Size.SMALL,      Ears.ERECT,        Tail.STRAIGHT,      Coat.LONG,          Feet.CAT);

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
