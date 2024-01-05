package org.launchcode;

public abstract class BaseDisc {

    private double storageCapacity;

    private double length;

    public BaseDisc( double aStorageCapacity, double aLength){

        storageCapacity = aStorageCapacity;
        length = aLength;
    }

    public double getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(double storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
