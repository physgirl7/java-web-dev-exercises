package exercises;

import java.util.Arrays;
public class ArrayPracticeString {
    public static void main(String[] args){
        String lymeric = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = lymeric.split(" ");
        String[] sentences = lymeric.split("\\.");

        System.out.println(Arrays.toString(words));
        System.out.println(Arrays.toString(sentences));

    }
}
