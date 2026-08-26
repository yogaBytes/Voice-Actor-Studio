package com.voiceactorstudio;

public interface ChatEngine {

    ChatResponse generateResponse(
            Character character,
                  String userMessage
    );
}
