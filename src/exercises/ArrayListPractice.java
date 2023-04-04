package exercises;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;


public class ArrayListPractice {
    public static void main(String[] args){
        int sumOfEven;
        int length;
        Scanner input = new Scanner(System.in);
        String seuss = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        //Numbers for Number List
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(5);
        nums.add(3);
        nums.add(24);
        nums.add(10);
        nums.add(100);
        nums.add(101);
        nums.add(15);
        nums.add(21);
        nums.add(32);

        //Find Sum of Even Numbers in Number List
        sumOfEven = SumEven(nums);
        System.out.println("The sum of your even numbers is " + sumOfEven);

        //Words for Word Search
        ArrayList<String> words = new ArrayList<>();
        words.add("Hello");
        words.add("Hi");
        words.add("World");
        words.add("Yo");
        words.add("Great");
        words.add("Mine");

        //Five Letter Word Search
        FiveLetterWords(words);

        //User Chosen Word Length
        System.out.println("What word length would you like to search for? ");
        length = input.nextInt();
        input.close();
        UserChoiceLetterWords(words,length);

        //Word Search in Seuss Lymeric
        String newSeuss = seuss.replace(",","").replace(".","");
        System.out.println(newSeuss);
        String[] arraySeuss = newSeuss.split(" ");
        ArrayList<String> strListSeuss = new ArrayList<String>(
                Arrays.asList(arraySeuss));
        FiveLetterWords(strListSeuss);

    }

    public static int SumEven(ArrayList<Integer> list){
        int sum = 0;
        boolean evenNumber;
        for (int i: list){
            evenNumber = i%2 ==0;
            if(evenNumber) {
                sum += i;
            }
        }
        return sum;

    }

    public static void FiveLetterWords (ArrayList<String> arr){
        for(String word: arr){
            if (word.length() == 5){
                System.out.println(word);
            }
        }
    }

    public static void UserChoiceLetterWords (ArrayList<String> arr, Integer userLength){
        for(String word: arr){
            if (word.length() == userLength){
                System.out.println(word);
            }
        }
    }
}
