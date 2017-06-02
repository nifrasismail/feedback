package feedbackapi.com.androidfeedbackapitemplate;

import android.renderscript.Double2;
import android.support.annotation.FloatRange;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RatingBar ratingBar,ratingBar2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ratingBar = new RatingBar(this);
        ratingBar.setRating(0);
        ratingBar.setStepSize(Float.parseFloat("0.5"));
        ratingBar.setNumStars(5);
        ratingBar.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        TextView textView = new TextView(this);
        textView.setText("Nutrition");
        textView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        LinearLayout linearLayout = (LinearLayout)findViewById(R.id.ratingLayout);
        linearLayout.addView(textView);
        linearLayout.addView(ratingBar);

        ratingBar2 = new RatingBar(this);
        ratingBar2.setRating(0);
        ratingBar2.setStepSize(Float.parseFloat("0.5"));
        ratingBar2.setNumStars(5);
        ratingBar2.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        TextView textView2 = new TextView(this);
        textView2.setText("Healthy Food");
        textView2.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        linearLayout.addView(textView2);
        linearLayout.addView(ratingBar2);


        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                calcualteRating();
            }
        });

        ratingBar2.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                calcualteRating();
            }
        });



    }

    private void calcualteRating() {
        final TextView overall = (TextView)findViewById(R.id.overallRatingText);
        double totalRating = ratingBar.getRating() + ratingBar2.getRating();
        overall.setText(totalRating/2.0 + "");
    }


}
