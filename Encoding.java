package Basics;

import java.util.*;
public class Encoding{
	
	
    public static void countCharacters(String str) {
        int[] charCounts = new int[26]; 

        for (int i = 0; i < str.length(); i++) {
            int currentChar = (int)str.charAt(i)-97;
            charCounts[currentChar]++;
        }

        for (int i = 0; i < charCounts.length; i++) {
            if (charCounts[i] > 0) {
                System.out.println((char) (i+97) + ": " + charCounts[i]);
            }
        }
    }
    
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        countCharacters(str);
    }

}

