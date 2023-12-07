package org.launchcode;

import java.util.ArrayList;
import java.util.Scanner;
public class PrintFiveLetterWord {

    public static void main(String[] args) {

        ArrayList<String> wordsList = new ArrayList<>();
        wordsList.add("apple");
        wordsList.add("banana");
        wordsList.add("orange");
        wordsList.add("grape");
        wordsList.add("melon");
        wordsList.add("kiwi");
        wordsList.add("peach");
        wordsList.add("plum");
        wordsList.add("mango");



        PrintFiveLetterWords(wordsList);
    }

    public static void PrintFiveLetterWords(ArrayList<String> wordsList){
        Scanner input = new Scanner(System.in);

        //System.out.println("words with exactly five letters: ");
        System.out.println("Enter a word length: ");
        int numChars = input.nextInt();
        System.out.println("words with " + numChars + " letters is:");

        for(String word : wordsList){
            if(word.length() == numChars){
                System.out.println(word);
            }
        }
    }
}
