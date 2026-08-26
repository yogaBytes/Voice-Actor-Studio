package com.voiceactorstudio;

public class OfflineChatEngine implements ChatEngine {

    private final OfflineResponseGenerator responseGenerator;

    public OfflineChatEngine() {
        responseGenerator = new OfflineResponseGenerator();
    }

    @Override
    public ChatResponse generateResponse(
            Character character,
            String userMessage) {

        if (character == null) {
            return new ChatResponse("");
        }

        CharacterPrompt prompt = new CharacterPrompt(
                character.getName(),
                character.getPersonality(),
                character.getBackground()
        );

        return responseGenerator.generate(prompt, userMessage);
    }
}
