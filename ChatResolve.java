package com.voiceactorstudio;

public class ChatResult {

    private final boolean successful;
    private final ChatResponse response;
    private final String errorMessage;

    private ChatResult(
            boolean successful,
            ChatResponse response,
            String errorMessage) {

        this.successful = successful;
        this.response = response;
        this.errorMessage = errorMessage;
    }

    public static ChatResult success(ChatResponse response) {
        return new ChatResult(true, response, "");
    }

    public static ChatResult failure(String errorMessage) {
        return new ChatResult(false, null, errorMessage);
    }

    public boolean isSuccessful() {
        return successful;
    }

    public ChatResponse getResponse() {
        return response;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
