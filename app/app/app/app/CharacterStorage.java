package com.voiceactorstudio;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class CharacterStorage {

    private static final String PREFS_NAME = "voice_actor_studio_characters";

    private final Context context;

    public CharacterStorage(Context context) {
        this.context = context.getApplicationContext();
    }

    public void saveCharacters(List<Character> characters) {
        // Local character storage will be implemented here.
    }

    public List<Character> loadCharacters() {
        // Return an empty list until persistent storage is implemented.
        return new ArrayList<>();
    }

    public void clearCharacters() {
        context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
                .edit()
                .clear()
                .apply();
    }
}
