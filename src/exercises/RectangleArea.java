package exercises;
import java.util.Scanner;
public class RectangleArea {
    public static void main(String[] args){
        double rectangleLength;
        double rectangleWidth;
        double rectangleArea;

        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of the rectangle in meters?");
        rectangleLength = input.nextDouble();
        System.out.println("What is the width of the rectangle in meters?");
        rectangleWidth = input.nextDouble();
        input.close();
        rectangleArea = rectangleLength * rectangleWidth;
        System.out.println("The area of the rectangle is " + rectangleArea + "m^2");

    }
}
