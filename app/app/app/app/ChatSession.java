package com.voiceactorstudio;

public class ChatSession {

    private final Character character;
    private final ConversationManager conversationManager;

    public ChatSession(Character character) {
        this.character = character;
        this.conversationManager = new ConversationManager();
    }

    public Character getCharacter() {
        return character;
    }

    public ConversationManager getConversationManager() {
        return conversationManager;
    }

    public void addUserMessage(String message) {
        conversationManager.addMessage(
                new ChatMessage("You", message)
        );
    }

    public void addCharacterMessage(String message) {
        conversationManager.addMessage(
                    new ChatMessage(character.getName(), message)
        );
    }
}
