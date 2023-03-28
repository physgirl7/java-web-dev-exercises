package exercises;
import java.util.Scanner;
public class MilesPerGallon {
    public static void main(String[] args){
        double milesDriven;
        double gallonsOfGas;
        double milesPerGallon;

        Scanner input = new Scanner(System.in);
        System.out.println("How many miles did you drive on this trip?");
        milesDriven = input.nextDouble();
        System.out.println("How many gallons of gas did you consume on this trip?");
        gallonsOfGas = input.nextDouble();
        input.close();
        milesPerGallon = milesDriven/gallonsOfGas;
        System.out.println("Your miles per gallon is " + milesPerGallon + " mpg");

    }
}
