package g.com.codinghousechallenges;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import g.com.codinghousechallenges.ChallengeActivities.ArgumentChallenge;
import g.com.codinghousechallenges.ChallengeActivities.CaseSwapChallenge;
import g.com.codinghousechallenges.ChallengeActivities.CounterFunctionChallenge;
import g.com.codinghousechallenges.ChallengeActivities.RevWordInPlaceChallenge;
import g.com.codinghousechallenges.ChallengeClasses.ArgumentAnalyzer;
import g.com.codinghousechallenges.ChallengeClasses.CaseSwap;
import g.com.codinghousechallenges.ChallengeClasses.CounterFunction;
import g.com.codinghousechallenges.ChallengeClasses.ReverseWordInPlace;

public class MainActivity extends AppCompatActivity {

    //The logic of these will have to be implemented in their own Activities/classes
    private ArgumentAnalyzer argAn = new ArgumentAnalyzer();
    private CaseSwap caseSwap = new CaseSwap("");
    private CounterFunction counterFunction = new CounterFunction("");
    private ReverseWordInPlace reverseWordInPlace = new ReverseWordInPlace();


    private Button mButton1;
    private Button mButton2;
    private Button mButton3;
    private Button mButton4;

    private TextView mUserTextView;

    private final String mUserName = "Andrei";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] listCodingHouseChallenges = {
                "Argument Analyzer",
                "Case Swap", // Reverse on treehouse
                "Counter Function", // Word Challenge Redux on treehouse
                "Reverse Words In Place" // Reverse Word Place on treehouse

        };

        //String declarations
        mUserTextView = (TextView) findViewById(R.id.userTextView);
        mUserTextView.setText(mUserName);

        //Button Declarations
        mButton1 = (Button) findViewById(R.id.argAnalyze);
        mButton1.setText(listCodingHouseChallenges[0]);
        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(startArgChallenge());
            }
        });


        mButton2 = (Button) findViewById(R.id.casSwap);
        mButton2.setText(listCodingHouseChallenges[1]);
        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(startCasSwapChallenge());
            }
        });

        mButton3 =(Button) findViewById(R.id.counfunct);
        mButton3.setText(listCodingHouseChallenges[2]);
        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(startCountFunctChallenge());
            }
        });

        mButton4 = (Button) findViewById(R.id.revWordPlace);
        mButton4.setText(listCodingHouseChallenges[3]);
        mButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(startRevWIPChallenge());
            }
        });




    }

    //Declaring Methods, Intents for the Challenge Activities, based on Order
    private Intent startArgChallenge() {
        Intent intent =  new Intent(this, ArgumentChallenge.class);
        return(intent);

    }

    private Intent startCasSwapChallenge() {
        Intent intent = new Intent(this, CaseSwapChallenge.class);
        return(intent);

    }

    private Intent startCountFunctChallenge() {
        Intent intent = new Intent(this, CounterFunctionChallenge.class );
        return(intent);
    }

    private Intent startRevWIPChallenge() {
        Intent intent = new Intent(this, RevWordInPlaceChallenge.class);
        return(intent);
    }
}
