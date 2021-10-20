package com.example.u3cspappdesign;

/** This is a singleton class that stores the current selected computer component */
public class InfoManager implements InfoManagerBase{
    /** The current selected computer part */
    private ComputerParts currentPart;

    /** The single instance of this class */
    private static final InfoManager instance = new InfoManager();

    /** Constructor for this class (singleton)
     * currentPart defaults to CPU to avoid errors
     */
    private InfoManager () {
        currentPart = ComputerParts.CPU;
    }

    public static InfoManager getInstance() {
        return instance;
    }

    public void setCurrentPart(ComputerParts part) {
        currentPart = part;
    }

    public String getName() {
        return currentPart.name;
    }

    public String getImageSource() {
        return currentPart.imageSource;
    }

    public String getDescription() {
        return currentPart.description;
    }

    public String getPurchaseOptions() {
        return currentPart.purchaseOptions;
    }
}