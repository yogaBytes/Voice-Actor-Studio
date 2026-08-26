package com.voiceactorstudio;

import java.util.ArrayList;
import java.util.List;

public class ConversationManager {

    private final List<ChatMessage> messages = new ArrayList<>();

    public void addMessage(ChatMessage message) {
        if (message != null) {
            messages.add(message);
        }
    }

    public List<ChatMessage> getMessages() {
        return new ArrayList<>(messages);
    }

    public void clearConversation() {
        messages.clear();
    }

    public int getMessageCount() {
          return messages.size();
    }
}
