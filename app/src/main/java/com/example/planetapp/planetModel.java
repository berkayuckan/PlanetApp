package com.example.planetapp;

import java.io.Serializable;

public class planetModel implements Serializable {
    private String planetTitle;
    private String planetBrief;
    private int planetImage;

    private String planetDistance;

    private String planetDescription;
    private String planetFields;

    public planetModel(String planetTitle, String planetBrief, int planetImage, String planetDistance, String planetDescription, String planetFields) {
        this.planetTitle = planetTitle;
        this.planetBrief = planetBrief;
        this.planetImage = planetImage;
        this.planetDistance = planetDistance;
        this.planetDescription=planetDescription;
        this.planetFields=planetFields;
    }

    public String getPlanetTitle() {
        return planetTitle;
    }

    public void setPlanetTitle(String planetTitle) {
        this.planetTitle = planetTitle;
    }

    public String getPlanetBrief() {
        return planetBrief;
    }

    public void setPlanetBrief(String planetBrief) {
        this.planetBrief = planetBrief;
    }

    public int getPlanetImage() {
        return planetImage;
    }

    public void setPlanetImage(int planetImage) {
        this.planetImage = planetImage;
    }

    public String getPlanetDistance() {
        return planetDistance;
    }

    public void setPlanetDistance(String planetDistance) {
        this.planetDistance = planetDistance;
    }

    public String getPlanetDescription() {
        return planetDescription;
    }

    public void setPlanetDescription(String planetDescription) {
        this.planetDescription = planetDescription;
    }

    public String getPlanetFields() {
        return planetFields;
    }

    public void setPlanetFields(String planetFields) {
        this.planetFields = planetFields;
    }
}
