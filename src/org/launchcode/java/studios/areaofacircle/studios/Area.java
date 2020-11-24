package org.launchcode.java.studios.areaofacircle.studios;
import java.util.Scanner;
public class Area {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the radius: ");
            double radius = input.nextDouble();
            input.skip("\n");
            double area  = Circle.getArea(radius);
            input.close();
        System.out.println("The area of a circle of radius " + radius +" is: " + (3.14 * radius *radius));
        }
}



