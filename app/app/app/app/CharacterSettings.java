package com.voiceactorstudio;

public class CharacterSettings {

    private boolean rememberConversation;
    private boolean useCharacterGreeting;

    public CharacterSettings() {
        rememberConversation = true;
        useCharacterGreeting = true;
    }

    public boolean isRememberConversation() {
        return rememberConversation;
    }

    public void setRememberConversation(boolean remember) {
        rememberConversation = remember;
    }

    public boolean isUseCharacterGreeting() {
        return useCharacterGreeting;
    }

    public void setUseCharacterGreeting(boolean useGreeting) {
        useCharacterGreeting = useGreeting;
    }
}
