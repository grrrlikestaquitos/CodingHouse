package g.com.codinghousechallenges.ChallengeActivities;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import g.com.codinghousechallenges.R;
import g.com.codinghousechallenges.ChallengeClasses.CounterFunction;

public class CounterFunctionChallenge extends AppCompatActivity {

    private ImageButton mSubmitAnswer;
    private EditText mEditTextCF;
    private TextView mNumWordTextView;
    private TextView mNumLetterTextView;
    private TextView mNumSpaceTextView;
    private TextView mNumCharsTextView;
    private TextView mAveLengthTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter_function_challenge);


        mSubmitAnswer = (ImageButton) findViewById(R.id.imageButton);
        mEditTextCF = (EditText) findViewById(R.id.editTextCF);
        mNumWordTextView = (TextView) findViewById(R.id.numOfWTextView);
        mNumLetterTextView = (TextView) findViewById(R.id.numOfLTextView);
        mNumSpaceTextView = (TextView) findViewById(R.id.numOfSpTextView);
        mNumCharsTextView = (TextView) findViewById(R.id.numOfCharsTextView);
        mAveLengthTextView = (TextView) findViewById(R.id.WordLengthTextView);

        mSubmitAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CounterFunction cf = new CounterFunction(counterFunction(mEditTextCF));

                cf.play();
                mNumWordTextView.setText(cf.getNumW());
                mNumLetterTextView.setText(cf.getNumL());
                mNumSpaceTextView.setText(cf.getNumSpace());
                mNumCharsTextView.setText(cf.getNumChar());
                mAveLengthTextView.setText(cf.aveLen());
            }
        });

    }

    private String counterFunction(EditText x) {
        String g = x.getText().toString();
        return(g);
    }
}
