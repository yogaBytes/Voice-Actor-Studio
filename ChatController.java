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

    public ChatResult sendMessage(String message) {

        if (!messageValidator.isValid(message)) {
            return ChatResult.failure("Please enter a message.");
        }

        String cleanedMessage = messageValidator.clean(message);

        chatSession.addUserMessage(cleanedMessage);

        ChatResponse response = chatEngine.generateResponse(
                chatSession.getCharacter(),
                cleanedMessage
        );

        if (response == null || response.getText().isEmpty()) {
            return ChatResult.failure(
                    "The character could not generate a response."
            );
        }

        chatSession.addCharacterMessage(response.getText());

        return ChatResult.success(response);
    }
}
