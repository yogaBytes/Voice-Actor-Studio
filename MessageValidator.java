package com.voiceactorstudio;

public class MessageValidator {

    public boolean isValid(String message) {
        return message != null && !message.trim().isEmpty();
    }

    public String clean(String message) {
        if (message == null) {
            return "";
        }

        return message.trim();
    }
}
