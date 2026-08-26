package com.voiceactorstudio;

import android.content.Context;
import android.content.SharedPreferences;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class CharacterStorage {

    private static final String PREFS_NAME =
            "voice_actor_studio_characters";

    private static final String CHARACTERS_KEY =
            "characters";

    private final Context context;

    public CharacterStorage(Context context) {
        this.context = context.getApplicationContext();
    }

    public void saveCharacters(List<Character> characters) {

        JSONArray array = new JSONArray();

        try {
            for (Character character : characters) {

                JSONObject object = new JSONObject();

                object.put("name", character.getName());
                object.put("personality",
                        character.getPersonality());
                object.put("background",
                        character.getBackground());

                array.put(object);
            }

            getPreferences()
                    .edit()
                    .putString(
                            CHARACTERS_KEY,
                            array.toString()
                    )
                    .apply();

        } catch (Exception ignored) {
            // Storage errors will be handled more gracefully later.
        }
    }

    public List<Character> loadCharacters() {

        List<Character> characters = new ArrayList<>();

        String saved = getPreferences()
                .getString(CHARACTERS_KEY, "");

        if (saved.isEmpty()) {
            return characters;
        }

        try {
            JSONArray array = new JSONArray(saved);

            for (int i = 0; i < array.length(); i++) {

                JSONObject object = array.getJSONObject(i);

                characters.add(
                        new Character(
                                object.getString("name"),
                                object.getString("personality"),
                                object.getString("background")
                        )
                );
            }

        } catch (Exception ignored) {
            // Invalid saved data will be handled later.
        }

        return characters;
    }

    public void clearCharacters() {
        getPreferences()
                .edit()
                .clear()
                .apply();
    }

    private SharedPreferences getPreferences() {
        return context.getSharedPreferences(
                PREFS_NAME,
                Context.MODE_PRIVATE
        );
    }
}
