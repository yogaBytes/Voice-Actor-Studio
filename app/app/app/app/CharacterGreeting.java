package com.voiceactorstudio;

public class CharacterGreeting {

    private final String text;

    public CharacterGreeting(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

        public boolean isEmpty() {
        return text == null || text.trim().isEmpty();
    }
}
