package codeclan.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashMap;

public class WordCount extends AppCompatActivity {

    EditText inputEditText;
    Button button;
    TextView outputTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_count);

        inputEditText = (EditText) findViewById( R.id.input_text );
        button = (Button) findViewById( R.id.count_text );
        outputTextView = (TextView) findViewById( R.id.output_text );

    }

    public void onButtonClicked( View button ){
        String text = inputEditText.getText().toString();
        HashMap< String, Integer > hash = WordCounter.textToHash( text );
        String result = WordCounter.hashToString( hash );
        outputTextView.setText( result );
    }
}
