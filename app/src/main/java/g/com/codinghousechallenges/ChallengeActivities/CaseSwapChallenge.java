package g.com.codinghousechallenges.ChallengeActivities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import g.com.codinghousechallenges.R;
import g.com.codinghousechallenges.ChallengeClasses.CaseSwap;

public class CaseSwapChallenge extends AppCompatActivity {

    private ImageButton mSubmit;
    private EditText mSCEditText;
    private TextView mSubmittedResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_case_swap_challenge);


        mSubmittedResult = (TextView) findViewById(R.id.SwapCaseTextView);
        mSCEditText = (EditText) findViewById(R.id.caseEditText);
        mSubmit = (ImageButton) findViewById(R.id.submitButtSC);
        mSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CaseSwap cs = new CaseSwap(listString(mSCEditText));

                mSubmittedResult.setText(cs.reverseTest());


            }
        });
    }

    private String listString(EditText x) {
        String d = x.getText().toString();
        return(d);
    }
}
