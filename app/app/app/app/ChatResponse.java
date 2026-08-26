package com.voiceactorstudio;

public class ChatResponse {

    private final String text;

    public ChatResponse(String text) {
        this.text = text;
    }

    public String getText() {
          return text;
    }
}
