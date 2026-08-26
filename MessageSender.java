package com.voiceactorstudio;

public class MessageSender {

    private final ChatSession chatSession;

    public MessageSender(ChatSession chatSession) {
        this.chatSession = chatSession;
    }

    public void send(String message) {
        if (message == null || message.trim().isEmpty()) {
            return;
        }

        chatSession.addUserMessage(message.trim());
    }
}
