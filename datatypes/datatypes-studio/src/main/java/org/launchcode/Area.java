package org.launchcode;
import studios.areaofacircle.Circle;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        System.out.println("Enter a radius: ");
        Scanner input = new Scanner(System.in);


        if (input.hasNextDouble()) {
            Double radius = input.nextDouble();
            if(radius > 0.0) {
                double area = Circle.getArea(radius);
                System.out.println("The area of a circle of the radius " + radius + " is " + area);
            } else {
                System.out.println("Only numbers over 0 are accepted values.");
            }

        } else {
            System.out.println("Only double are accepted values.");
        }

        input.close();
    }

}
