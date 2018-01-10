package enums;

public enum Question {
    EMPTY   (""),
    ONE     ("What was the dog's size?"),
    TWO     ("What did the ears of the dog look like?"),
    THREE   ("What did the tail of the dog look like?"),
    FOUR    ("What did the coat of the dog look like?"),
    FIVE    ("What did the feet of the dog look like?");

    private final String string;

    Question(String string){
        this.string = string;
    }

    public String getString(){
        return string;
    }
}
