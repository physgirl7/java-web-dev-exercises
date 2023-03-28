package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        double radius;
        double area;

        Scanner input = new Scanner(System.in);
        System.out.println("Let's calculate the area of a circle. Enter the radius of your circle:");
        radius = input.nextDouble();
        input.close();
        area = Circle.getArea(radius);
//        area = Math.PI * radius * radius;
        System.out.println("The area of a circle of radius " + radius + " is: " + area);


    }
}
