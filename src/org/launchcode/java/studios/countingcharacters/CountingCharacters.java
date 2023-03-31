package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class CountingCharacters {
    public static void main(String[] args) {
//        String str = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a string: ");
//        String strInput = input.nextLine();

        String data = null;
        try {
            File myFile = new File("src/org/launchcode/java/studios/countingcharacters/string.txt");
            Scanner myReader = new Scanner(myFile);

            while (myReader.hasNextLine()) {
                data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        String str = data.toLowerCase();

        HashMap<Character, Integer> characters = new HashMap<>();

        char[] charactersInString = str.toCharArray();

        for (char chars : charactersInString) {

            if (!characters.containsKey(chars) && Character.isLetter(chars)) {
                characters.put(chars, 1);
            } else if (Character.isLetter(chars)) {
                characters.put(chars, characters.get(chars) + 1);
            }

        }

        for (Map.Entry<Character, Integer> eachCharacter : characters.entrySet()) {
            System.out.println(eachCharacter.getKey() + ": " + eachCharacter.getValue());
        }

    }
}

