package com.voiceactorstudio;

public class ChatScreenState {

    private String characterName;
    private String statusMessage;
    private boolean sendingMessage;

    public ChatScreenState() {
        characterName = "";
        statusMessage = "";
        sendingMessage = false;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String name) {
        characterName = name;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String message) {
        statusMessage = message;
    }

    public boolean isSendingMessage() {
        return sendingMessage;
    }

    public void setSendingMessage(boolean sending) {
        sendingMessage = sending;
    }
}
