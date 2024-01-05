package org.launchcode;

import java.util.ArrayList;

public class CD extends BaseDisc implements OpticalDisc {

    private String band;



    public CD(double aStorageCapacity, double aLength, String aBand) {
        super(aStorageCapacity, aLength);
        band = aBand;
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");

    }

    @Override
    public void laserRead() {
        System.out.println("wow you really like this band huh?");
    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
