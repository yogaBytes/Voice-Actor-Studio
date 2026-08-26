        package com.voiceactorstudio;

import java.util.ArrayList;
import java.util.List;

public class CharacterManager {

    private final List<Character> characters = new ArrayList<>();

    public void addCharacter(Character character) {
        if (character != null) {
            characters.add(character);
        }
    }

    public List<Character> getCharacters() {
        return new ArrayList<>(characters);
    }

    public Character findCharacter(String name) {
        if (name == null) {
            return null;
        }

        for (Character character : characters) {
            if (character.getName().equalsIgnoreCase(name)) {
                return character;
            }
        }

        return null;
    }

    public void removeCharacter(String name) {
        Character character = findCharacter(name);

        if (character != null) {
            characters.remove(character);
        }
    }

    public void clearCharacters() {
            characters.clear();
    }
}
