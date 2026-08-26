package com.voiceactorstudio;

import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class mainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setPadding(32, 32, 32, 32);
        layout.setBackgroundColor(Color.WHITE);

        TextView title = new TextView(this);
        title.setText("Voice Actor Studio");
        title.setTextSize(28);
        title.setTextColor(Color.BLACK);

        TextView subtitle = new TextView(this);
        subtitle.setText("Your offline character studio");
        subtitle.setTextSize(18);
        subtitle.setTextColor(Color.DKGRAY);

        EditText characterName = new EditText(this);
        characterName.setHint("Character name");
        characterName.setContentDescription("Character name");

        EditText messageInput = new EditText(this);
        messageInput.setHint("Type a message");
        messageInput.setContentDescription("Message to character");

        Button sendButton = new Button(this);
        sendButton.setText("Send");

        TextView responseText = new TextView(this);
        responseText.setTextSize(18);
        responseText.setTextColor(Color.BLACK);

        layout.addView(
                title,
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT
                )
        );

        layout.addView(subtitle);

        layout.addView(characterName);

        layout.addView(messageInput);

        layout.addView(sendButton);

        layout.addView(responseText);

        sendButton.setOnClickListener(view -> {
            String message = messageInput.getText().toString().trim();

            if (!message.isEmpty()) {
                responseText.setText(
                        "You said: " + message
                );
            }
        });

        setContentView(layout);
    }
}
