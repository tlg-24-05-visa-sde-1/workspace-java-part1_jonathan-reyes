package net.flix;

public enum Genre {
    //each of these is calling the (private) ctor below
    ROMANCE("Romance"),
    COMEDY("Comedy"),
    HORROR("Horror"),
    ACTION("Action"),
    SCI_FI("Sci"),
    DRAMA("Drama"),
    SPORTS("Sports"),
    WESTERN("Western");

    //Everything under here is regular class definition stuff, i.e., fields, ctors or methods

    private String display;

    Genre (String display) {
        ///System.out.println("Genre constructor called");
        this.display = display;
    }

    //we provide a getter only - no setter
    public String getDisplay() {
        return display;
    }

    public String toString() {
        return getDisplay();
    }
}