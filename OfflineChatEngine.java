package com.voiceactorstudio;

public class OfflineChatEngine {

    public String generateResponse(Character character, String userMessage) {

        if (userMessage == null || userMessage.trim().isEmpty()) {
            return character.getGreeting();
        }

          return character.getName() + " heard you say: " + userMessage;
    }
}
