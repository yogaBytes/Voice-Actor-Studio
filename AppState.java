package com.voiceactorstudio;

public class AppState {

    private Character selectedCharacter;
    private ChatSession currentChatSession;

    public Character getSelectedCharacter() {
        return selectedCharacter;
    }

    public void setSelectedCharacter(Character character) {
        selectedCharacter = character;

        if (character != null) {
            currentChatSession = new ChatSession(character);
        } else {
            currentChatSession = null;
        }
    }

    public ChatSession getCurrentChatSession() {
        return currentChatSession;
    }

    public boolean hasSelectedCharacter() {
        return selectedCharacter != null;
    }
}
