package com.voiceactorstudio;

import android.content.Context;

import java.util.List;

public class CharacterRepository {

    private final CharacterManager characterManager;
    private final CharacterStorage characterStorage;

    public CharacterRepository(Context context) {
        characterManager = new CharacterManager();
        characterStorage = new CharacterStorage(context);
        loadCharacters();
    }

    public void addCharacter(Character character) {
        characterManager.addCharacter(character);
        saveCharacters();
    }

    public List<Character> getCharacters() {
        return characterManager.getCharacters();
    }

    public Character findCharacter(String name) {
        return characterManager.findCharacter(name);
    }

    public void removeCharacter(String name) {
        characterManager.removeCharacter(name);
        saveCharacters();
    }

    public void clearCharacters() {
        characterManager.clearCharacters();
        characterStorage.clearCharacters();
    }

    public void saveCharacters() {
        characterStorage.saveCharacters(
                characterManager.getCharacters()
        );
    }

    public void loadCharacters() {
        List<Character> savedCharacters =
                characterStorage.loadCharacters();

        characterManager.clearCharacters();

        for (Character character : savedCharacters) {
            characterManager.addCharacter(character);
        }
    }
}
