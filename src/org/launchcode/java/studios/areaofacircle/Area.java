package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        double radius;
        double area;

        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Let's calculate the area of a circle. Enter the radius of your circle:");
            while (!input.hasNextDouble() || !input.hasNext("")) {
                System.out.println("That's not a positive number!");
                input.next();
                System.out.println("Enter the radius as a positive number: ");
            }
            radius = input.nextDouble();
        } while(radius<=0);

        input.close();
        area = Circle.getArea(radius);
//        area = Math.PI * radius * radius;
        System.out.println("The area of a circle of radius " + radius + " is: " + area);


    }
}
