package kg.kloop.rinat.hangman;


/**
 * Created by kloop on 4/10/17.
 */

class HangManController {


    private HangManModel model;
    private String letters;

    public HangManController(HangManModel hangManModel) {
        model = hangManModel;
    }

    public void setWord(String word) {
        model.setWord(word);
    }

    public void setRiddle(String riddle) {
        model.setRiddle(riddle);
    }
    public void setLetters(String letters){
        model.setLetters(letters);
    }

    public void acceptGuess(char letter) {
        if (model.getWord().indexOf(letter) >= 0){
            showLetter(letter);
        } else {
            model.setGallowPart(model.getGallowPart() + 1);
            letters = String.valueOf(letter);
            setLetters(letters);

        }
    }

    private void showLetter(char letter) {
        model.setRiddle(findLetters(letter, model.getRiddle(),
                        model.getWord()));
    }

    private String findLetters (char letter, String riddle, String word){
        String updatedRiddle = "";
        char[] riddleArray = riddle.toCharArray();
        char[] wordArray = word.toCharArray();
        int i = 0;
        for (char symbol : wordArray) {
            if (symbol == letter) riddleArray[i] = letter;
            i++;
        }
        updatedRiddle = new String(riddleArray);
        return updatedRiddle;
    }


}
