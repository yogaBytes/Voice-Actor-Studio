package com.voiceactorstudio;

public class CharacterProfile {

    private final String name;
    private final String personality;
    private final String background;
    private final String greeting;

    public CharacterProfile(
            String name,
            String personality,
            String background,
            String greeting) {

        this.name = name;
        this.personality = personality;
        this.background = background;
        this.greeting = greeting;
    }

    public String getName() {
        return name;
    }

    public String getPersonality() {
        return personality;
    }

    public String getBackground() {
        return background;
    }

    public String getGreeting() {
        return greeting;
    }
}
