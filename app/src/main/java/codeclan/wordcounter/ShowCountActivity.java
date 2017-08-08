package codeclan.wordcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowCountActivity extends AppCompatActivity {

    TextView outputTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_count);
        outputTextView = (TextView) findViewById( R.id.output_text );
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String result = extras.getString( "result" );
        outputTextView.setText( result );
    }
}
