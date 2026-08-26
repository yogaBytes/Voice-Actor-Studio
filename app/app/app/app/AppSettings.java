package com.voiceactorstudio;

public class AppSettings {

    private boolean kidsModeEnabled;

    public AppSettings() {
        kidsModeEnabled = false;
    }

    public boolean isKidsModeEnabled() {
        return kidsModeEnabled;
    }

    public void setKidsModeEnabled(boolean enabled) {
        kidsModeEnabled = enabled;
    }
}
