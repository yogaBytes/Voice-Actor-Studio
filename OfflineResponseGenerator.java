package com.voiceactorstudio;

public class OfflineResponseGenerator {

    private final CharacterPromptBuilder promptBuilder;

    public OfflineResponseGenerator() {
        promptBuilder = new CharacterPromptBuilder();
    }

    public ChatResponse generate(
            CharacterPrompt prompt,
            String userMessage) {

        if (prompt == null || userMessage == null
                || userMessage.trim().isEmpty()) {
            return new ChatResponse("");
        }

        String characterInfo = promptBuilder.build(prompt);

        String response = "Hello! I am "
                + prompt.getCharacterName()
                + ". You said: "
                + userMessage.trim();

        return new ChatResponse(response);
    }
}
