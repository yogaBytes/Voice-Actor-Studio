package com.voiceactorstudio;

public class CharacterResponseStyle {

    private final String styleName;
    private final String description;

    public CharacterResponseStyle(String styleName, String description) {
        this.styleName = styleName;
        this.description = description;
    }

    public String getStyleName() {
        return styleName;
    }

    public String getDescription() {
        return description;
    }
}
