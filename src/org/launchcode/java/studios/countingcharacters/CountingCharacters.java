package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {
    public static void main(String[] args) {
        String str = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        HashMap<Character,Integer> characters = new HashMap<>();

        char[] charactersInString = str.toCharArray();

        for (char chars: charactersInString){

            if(!characters.containsKey(chars)) {
                characters.put(chars, 1);
            } else {
                characters.put(chars, characters.get(chars)+1);
            }

        }

        for(Map.Entry<Character,Integer> eachCharacter: characters.entrySet()){
            System.out.println(eachCharacter.getKey() + ": " + eachCharacter.getValue());
        }

    }
}
