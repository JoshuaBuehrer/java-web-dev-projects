package org.launchcode;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
    }

    public static int Divide(int x, int y) {
        try {
            if (y == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }

            return x / y;
        } catch (ArithmeticException e) {

            System.out.println("Error in Divide(): " + e.getMessage());

            throw e;
        }
    }


    public static int CheckFileExtension(String fileName)
    {
        try {
            if (fileName.isEmpty()) {
                throw new RuntimeException("Files can't be empty! -1 to gryffindor");
            }
            if (fileName.endsWith(".java")){
                return 1;
            } else {
                return 0;
            }
        } catch (RuntimeException e){
            System.out.println("Error in Runtime Exception");
            throw e;
        }
    }

}