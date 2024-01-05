package org.launchcode;

public class DVD extends BaseDisc implements OpticalDisc {

    private String movieTitle;

    public DVD(double aStorageCapacity, double aLength, String aMovieTitle) {
        super(aStorageCapacity, aLength);
        movieTitle = aMovieTitle;
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");
    }


    @Override
    public void laserRead() {
        System.out.println("beep beep boop boop. reading disk boop boop");
    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
