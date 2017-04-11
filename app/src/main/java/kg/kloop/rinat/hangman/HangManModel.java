package kg.kloop.rinat.hangman;

/**
 * Created by kloop on 4/11/17.
 */

class HangManModel {
    private String word;
    private int gallowPart;
    private String riddle;
    private String letters;

    public void setWord(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public int getGallowPart() {
        return gallowPart;
    }

    public void setGallowPart(int gallowPart) {
        this.gallowPart = gallowPart;
    }

    public String getRiddle() {
        return riddle;
    }

    public void setRiddle(String riddle) {
        this.riddle = riddle;
    }

    public String getLetters() {
        return letters;
    }

    public void setLetters(String letters) {
        this.letters = letters;
    }
}
