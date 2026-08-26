```java
package com.voiceactorstudio;

import android.os.Bundle;
import android.graphics.Color;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class mainActivity extends AppCompatActivity {

    private CharacterRepository characterRepository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        characterRepository = new CharacterRepository(this);

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

        EditText personality = new EditText(this);
        personality.setHint("Character personality");
        personality.setContentDescription("Character personality");

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
        layout.addView(personality);
        layout.addView(messageInput);
        layout.addView(sendButton);
        layout.addView(responseText);

        sendButton.setOnClickListener(view -> {

            String name =
                    characterName.getText().toString().trim();

            String personalityText =
                    personality.getText().toString().trim();

            String message =
                    messageInput.getText().toString().trim();

            if (name.isEmpty()) {
                responseText.setText(
                        "Please enter a character name."
                );
                return;
            }

            if (message.isEmpty()) {
                responseText.setText(
                        "Please enter a message."
                );
                return;
            }

            Character character = new Character(
                    name,
                    personalityText,
                    ""
            );

            characterRepository.addCharacter(character);

            ChatEngine engine = new OfflineChatEngine();

            ChatSession session =
                    new ChatSession(character);

            ChatController controller =
                    new ChatController(
                            engine,
                            session
                    );

            ChatResult result =
                    controller.sendMessage(message);

            if (result.isSuccessful()) {
                responseText.setText(
                        result.getResponse().getText()
                );
            } else {
                responseText.setText(
                        result.getErrorMessage()
                );
            }
        });

        setContentView(layout);
    }
}
```
