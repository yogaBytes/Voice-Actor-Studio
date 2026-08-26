package com.voiceactorstudio;

public class CharacterPrompt {

    private final String characterName;
    private final String personality;
    private final String background;

    public CharacterPrompt(
            String characterName,
            String personality,
            String background) {

        this.characterName = characterName;
        this.personality = personality;
        this.background = background;
    }

    public String getCharacterName() {
        return characterName;
    }

    public String getPersonality() {
        return personality;
    }

    public String getBackground() {
        return background;
    }
}
