package org.launchcode;

import java.util.Scanner;
public class Wonderland {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do:" +
                " once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it," +
                " ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?";

        System.out.println("search for a word!!: ");
        String word = input.nextLine();

        Boolean search = alice.toLowerCase().contains(word.toLowerCase());

        if (search){
            System.out.println("know it all, '" + word + "' is in the book");

            Integer index = alice.indexOf(word);
            Integer length = word.length();
            System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
            String modifiedSentence = alice.replace(word, "");
            System.out.println(modifiedSentence);
        } else {
            System.out.println("did you even read the book??? '" + word + "' is 100% not in the book");
            input.close();
        }
    }
}
