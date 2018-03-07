package nikhilkumar.alien;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t1;
    Button b1,b2;
    int mStoryIndex=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        t1= findViewById(R.id.storyTextView);
        b1= findViewById(R.id.buttonTop);
        b2= findViewById(R.id.buttonBottom);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mStoryIndex==1)
                {
                    t1.setText(R.string.T3_Story);
                    b1.setText(R.string.T3_Ans1);
                    b2.setText(R.string.T3_Ans2);
                }
                else if(mStoryIndex==3)
                {
                    t1.setText(R.string.T4_End);
                    b1.setVisibility(View.GONE);
                    b2.setVisibility(View.GONE);
                }

                updateQuestion();

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mStoryIndex==1)
                {
                    t1.setText(R.string.T2_Story);
                    b1.setText(R.string.T2_Ans1);
                    b2.setText(R.string.T2_Ans2);
                }
                else if(mStoryIndex==4)
                {
                    t1.setText(R.string.T5_End);
                    b1.setVisibility(View.GONE);
                    b2.setVisibility(View.GONE);
                }

               updateQuestion();
            }
        });





    }
    private void updateQuestion()
    {
        mStoryIndex=mStoryIndex+1;

    }
}
