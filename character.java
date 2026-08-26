package com.voiceactorstudio;

public class Character {

    private String name;
    private String personality;
    private String greeting;

    public Character(String name, String personality, String greeting) {
        this.name = name;
        this.personality = personality;
        this.greeting = greeting;
    }

    public String getName() {
        return name;
    }

    public String getPersonality() {
        return personality;
    }

    public String getGreeting() {
        return greeting;
            }
}
