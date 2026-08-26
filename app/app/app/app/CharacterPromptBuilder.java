package com.voiceactorstudio;

public class CharacterPromptBuilder {

    public String build(CharacterPrompt prompt) {
        if (prompt == null) {
            return "";
        }

        StringBuilder result = new StringBuilder();

        result.append("Character: ")
                .append(prompt.getCharacterName())
                .append("\n");

        result.append("Personality: ")
                .append(prompt.getPersonality())
                .append("\n");

        result.append("Background: ")
                .append(prompt.getBackground())
                .append("\n");

        return result.toString();
    }
}
