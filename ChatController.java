package com.voiceactorstudio;

public class ChatController {

    private final ChatEngine chatEngine;
    private final ChatSession chatSession;
    private final MessageValidator messageValidator;

    public ChatController(
            ChatEngine chatEngine,
            ChatSession chatSession) {

        this.chatEngine = chatEngine;
        this.chatSession = chatSession;
        this.messageValidator = new MessageValidator();
    }

    public ChatResponse sendMessage(String message) {

        if (!messageValidator.isValid(message)) {
            return new ChatResponse("");
        }

        String cleanedMessage = messageValidator.clean(message);

        chatSession.addUserMessage(cleanedMessage);

        ChatResponse response = chatEngine.generateResponse(
                chatSession.getCharacter(),
                cleanedMessage
        );

        if (response != null && !response.getText().isEmpty()) {
            chatSession.addCharacterMessage(response.getText());
        }

        return response;
    }
}
