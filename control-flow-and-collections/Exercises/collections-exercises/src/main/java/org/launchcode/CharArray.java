package org.launchcode;

import java.util.ArrayList;

public class CharArray {

    public static void main(String[] args) {
        String inputString = "I would not, could not, in a box. I would not," +
                " could not with a fox. I will not eat them in a house. I will" +
                " not eat them with a mouse.";

      ArrayList<Character> newArray =  ConvertStringToArray(inputString);
        System.out.println(newArray);
    }

    public static ArrayList<Character> ConvertStringToArray(String input){
        ArrayList<Character> charArray = new ArrayList<>();

        for (char c : input.toCharArray()){
            charArray.add(c);
        }
        return charArray;
    }
}
