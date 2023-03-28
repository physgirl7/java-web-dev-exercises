package exercises;

import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args){
        int[] integerArray = {1,1,2,3,5,8};
        boolean evenNumber;
        for(int i: integerArray){
            evenNumber = i%2==0;
//            System.out.println(evenNumber);
            if(!evenNumber) {
                System.out.println(i);
            }
        }
    }
}
