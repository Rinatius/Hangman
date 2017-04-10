package kg.kloop.rinat.hangman;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView gallowsView;
    private TextView wordView;
    private TextView lettersView;
    private EditText guessView;
    private Button submitButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        gallowsView = (TextView)findViewById(R.id.textViewGallows);
        wordView = (TextView)findViewById(R.id.textViewWord);
        lettersView = (TextView)findViewById(R.id.textViewLetters);
        guessView = (EditText)findViewById(R.id.editTextGuess);
        submitButton = (Button)findViewById(R.id.buttonSubmit);
    }
}
