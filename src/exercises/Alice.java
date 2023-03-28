package exercises;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args){
        String str = "Alice was beginning to get very tired of " +
                "sitting by her sister on the bank, and of having nothing to do: " +
                "once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use " +
                "of a book,' thought Alice 'without pictures or conversation?'";
        String searchTerm;
        boolean termMatches;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a term to search for");
        searchTerm = input.nextLine();
        termMatches = str.toLowerCase().contains(searchTerm.toLowerCase());
        if(termMatches) {
            System.out.println("Your search term " + searchTerm + " was found");
        } else {
                System.out.println("Your search term " + searchTerm +" was not found");
            }

        if(termMatches){
            Integer index = str.indexOf(searchTerm);
            Integer length = searchTerm.length();
            System.out.println("Your search term first appears at index " + index + ". Your search term is "+ length + " characters long.");
            String editSearchTerm = str.replace(searchTerm, "");
            System.out.println(editSearchTerm);
        }
        }


    }

