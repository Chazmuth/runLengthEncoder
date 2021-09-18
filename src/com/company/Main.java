package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        StringBuilder encodedOutput = new StringBuilder();

        System.out.println("Enter String");
        Scanner userString = new Scanner(System.in);
        String uncodedWord = userString.nextLine();

        //user enters word to encode

        char[] uncodedWordArray = uncodedWord.toCharArray();
        char current = uncodedWordArray[0];

        //creates a char array (array of the chars in
        // the uncodedWord string) and creates a char called
        // current to be the first letter of uncodedWord

        int index = 0;
        int count = 0;

        for (char c:uncodedWordArray){
            if (c == current){
                count++;
                index++;

                if (index == uncodedWordArray.length)
                    encodedOutput.append(current + Integer.toString(count));
            }

            else {
                encodedOutput.append(current + Integer.toString(count));
                count = 1;
                current = c;
                index++;
            }
        }
        System.out.println(encodedOutput);
        System.out.println("Input Length: " + uncodedWord.length());
        System.out.println("Output Length: "+ encodedOutput.length());
        System.out.println("Saved: " + (uncodedWord.length() - encodedOutput.length()));
    }
}
