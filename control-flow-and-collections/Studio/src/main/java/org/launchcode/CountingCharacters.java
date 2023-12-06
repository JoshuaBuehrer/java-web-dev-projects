package org.launchcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {

        public static void main(String[] args) {
            // Prompt the user to enter the string
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String inputString = input.nextLine();
            input.close();

            // Create a map to store character counts
            Map<Character, Integer> charCountMap = new HashMap<>();

            // Loop through the string
            for (char ch : inputString.toCharArray()) {
                // Exclude numbers
                if (Character.isLetter(ch)) {
                    // Make the character lower case
                    char lowerCaseChar = Character.toLowerCase(ch);

                    // Update the count for the character in the map
                    charCountMap.put(lowerCaseChar, charCountMap.getOrDefault(lowerCaseChar, 0) + 1);
                }
            }

            // Loop through the map to print the results
            for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }


}
