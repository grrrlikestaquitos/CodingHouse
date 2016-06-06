package g.com.codinghousechallenges.ChallengeActivities;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import g.com.codinghousechallenges.R;
import g.com.codinghousechallenges.ChallengeClasses.ArgumentAnalyzer;

public class ArgumentChallenge extends AppCompatActivity {

    private ImageButton mSubmitAnswerButton;
    private TextView mOddText;
    private TextView mNegText;
    private TextView mAveText;
    private TextView mMedText;
    private EditText mInput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_argument_challenge);


        mOddText = (TextView) findViewById(R.id.OddTextView);
        mNegText = (TextView) findViewById(R.id.negNumTextView);
        mAveText = (TextView) findViewById(R.id.AveNumTextView);
        mMedText = (TextView) findViewById(R.id.MedNumTextView);

        mSubmitAnswerButton = (ImageButton) findViewById(R.id.submitButton);
        mSubmitAnswerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArgumentAnalyzer  argAns =  new ArgumentAnalyzer();

                argAns.arrayAnalyzer(ArrayEditText(mInput));
                mOddText.setText(argAns.getOddNum());
                mNegText.setText(argAns.getNegNum());
                mAveText.setText(argAns.getAveNum());
                mMedText.setText(argAns.getMedNum());

            }
        });
        mInput = (EditText) findViewById(R.id.ArgInput);


    }



    private void checkForInvChars(String x) {
        for (int z = 0; z < x.length(); z++) {
            if(Character.isLetter(x.charAt(z))) {
                Toast toast = Toast.makeText(this, "Numbers Only Please!", Toast.LENGTH_SHORT);
                toast.show();
            }

        }

    }


    private List<Integer> ArrayEditText(EditText x) {
        List<Integer> listInteger = new ArrayList<>();
        String inputText = x.getText().toString();
        String[] ints = inputText.split(" ");
        for (String o: ints) {
            int num = Integer.parseInt(o);
            listInteger.add(num);
        }


        return(listInteger);
    }
}
