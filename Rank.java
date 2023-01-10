package boaFinalProject;

import java.util.Collection;
import java.util.Collections;
import java.util.Random;

/**
 * ENUM CONTAINING THE RANKS OF CARDS, NAMES, AND VALUES
 */
public enum Rank{
    ACE("Ace", 11),
    TWO("Two", 2),
    THREE("Three", 3),
    FOUR("Four", 4),
    FIVE("Five", 5),
    SIX("Six", 6),
    SEVEN("Seven", 7),
    EIGHT("Eight", 8),
    NINE("Nine", 9),
    TEN("Ten", 10),
    JACK("Jack", 10),
    QUEEN("Queen", 10),
    KING("King", 10);

    String rankName;
    int rankValue;
    /**
     * CONSTRUCTOR THAT GIVES EACH RANK A NAME, AND ADD AN INT TO STORE THE VALUE
     */
    Rank(String rankName, int rankValue){
        this.rankName = rankName;
        this.rankValue = rankValue;
    }
    /**
     * A toString METHOD THAT RETURNS THE NAME
     */
    public String toString() {
        return rankName;
    }


}




