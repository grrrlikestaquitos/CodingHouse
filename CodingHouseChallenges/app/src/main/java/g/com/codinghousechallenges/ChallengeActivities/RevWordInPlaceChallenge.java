package g.com.codinghousechallenges.ChallengeActivities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import g.com.codinghousechallenges.R;
import g.com.codinghousechallenges.ChallengeClasses.ReverseWordInPlace;

public class RevWordInPlaceChallenge extends AppCompatActivity {

    private Button mReverseButton;
    private EditText mReverseEditText;
    private TextView mShowCaseTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rev_word_in_place_challenge);

        mReverseButton = (Button) findViewById(R.id.GButton);
        mReverseEditText = (EditText) findViewById(R.id.editText);
        mShowCaseTextView = (TextView) findViewById(R.id.ArlsLong);

        mReverseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ReverseWordInPlace rwip = new ReverseWordInPlace();
                mShowCaseTextView.setText(rwip.reverseString(reverseEditText(mReverseEditText)));
            }
        });
    }

    private String reverseEditText(EditText x) {
        String e = x.getText().toString();
        return(e);
    }
}
