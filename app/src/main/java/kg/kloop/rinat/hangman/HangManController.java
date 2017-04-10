package kg.kloop.rinat.hangman;

/**
 * Created by kloop on 4/10/17.
 */

class HangManController {


    private HangManModel model;

    public HangManController(HangManModel hangManModel) {
        model = hangManModel;
    }

    public void setWord(String word) {
        model.setWord(word);
    }

    public void acceptGuess(String letter) {
        if (model.getWord().contains(letter)){
            showLetter(letter);
        } else model.setGallowPart(model.getGallowPart() + 1);
    }

    private void showLetter(String letter) {

    }
}
