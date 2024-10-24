package com.aks.flightInventory.utility;

public enum FlightType {
    DOMESTIC("DOMESTIC", "Domestic flight"),
    INTERNATIONAL("INTERNATIONAL", "International flight"),
    PRIVATE_JET("PRIVATE_JET", "Private jet or flight"),
    DEFENCE_FLIGHT("DEFENCE_FLIGHT", "Defence flight");

    private final String code;
    private final String description;

    // Constructor to initialize the enum values
    FlightType(String code, String description) {
        this.code = code;
        this.description = description;
    }

    // Getter for code
    public String getCode() {
        return code;
    }

    // Getter for description
    public String getDescription() {
        return description;
    }

    // You can also override toString() method to customize how the enum values are printed
    @Override
    public String toString() {
        return code + ": " + description;
    }
}
