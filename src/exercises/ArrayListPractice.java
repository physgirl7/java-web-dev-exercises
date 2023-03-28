package exercises;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args){
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

        System.out.println(SumEven(nums));
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

//    public static String FiveLetterWords (ArrayList<String> arr){
//        for(String word: arr){
//            if (word.length() == 5){
//                System.out.println(word);
//            }
//        }
//    }
}
