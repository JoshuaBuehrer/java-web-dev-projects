package org.launchcode;

public class Vinyl extends BaseDisc implements OpticalDisc {

    private String label;


    public Vinyl(double aStorageCapacity, double aLength, String aLabel) {
        super(aStorageCapacity, aLength);
        label = aLabel;
    }

    @Override
    public void spinDisc() {
        System.out.println("a vinyl spins at a rate 33/1 rpms baby");
    }

    @Override
    public void stylus() {
        System.out.println("crrrrrrrr ka crrrrrrr pop");
    }
}

