package org.launchcode;

import java.util.Scanner;
public class CalcRectangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("what is the length of the rectangle?: ");
        double length = input.nextDouble();

        System.out.println("what is the width of the rectangle?: ");
        double width = input.nextDouble();

        double area = length * width;

        System.out.println("your triangle area is " + area);
        input.close();
    }
}
