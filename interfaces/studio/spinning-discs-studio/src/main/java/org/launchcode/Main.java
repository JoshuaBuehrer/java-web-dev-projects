package org.launchcode;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        DVD myDVD = new DVD(42069, 90, "Frozen");
        CD myCD = new CD(5,45,"whezzer");
        // TODO: Declare and initialize a CD and a DVD object.

        myDVD.spinDisc();

        myCD.spinDisc();

        myDVD.laserRead();

        myCD.laserRead();
        // TODO: Call each CD and DVD method to verify that they work as expected.
    }
}