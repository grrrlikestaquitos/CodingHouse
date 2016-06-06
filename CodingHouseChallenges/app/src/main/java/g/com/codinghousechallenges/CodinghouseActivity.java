package g.com.codinghousechallenges;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CodinghouseActivity extends AppCompatActivity {

    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.codinghouse);

        mButton = (Button) findViewById(R.id.mainButton);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(startNewActivity());


            }
        };

        mButton.setOnClickListener(listener);


    }

    private Intent startNewActivity() {
        Intent intent = new Intent(this, MainActivity.class);

        return(intent);
    }
}
