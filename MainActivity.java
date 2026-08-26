        package com.voiceactorstudio;
        
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class mainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setBackgroundColor(Color.WHITE);

        TextView title = new TextView(this);
        title.setText("Voice Actor Studio");
        title.setTextSize(28);
        title.setTextColor(Color.BLACK);

        TextView subtitle = new TextView(this);
        subtitle.setText("Your offline character studio");
        subtitle.setTextSize(18);
        subtitle.setTextColor(Color.DKGRAY);

        layout.addView(title);
        layout.addView(subtitle);

        setContentView(layout);
    }
}
