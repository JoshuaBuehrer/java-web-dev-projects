package org.launchcode;

import java.util.Scanner;
public class Area {

    public static void main(String[] args){

        double radius;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("enter the radius:");
        radius = input.nextDouble();
        input.close();
        System.out.println("The area of a circle of radius " + radius + " is " + Circle.getArea(radius));
    }
}
