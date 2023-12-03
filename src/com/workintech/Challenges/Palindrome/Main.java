package com.workintech.Challenges.Palindrome;

import java.util.Locale;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        System.out.println(checkForPalindrome("abccba"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Don't node"));

    }

    public static boolean checkForPalindrome(String text) {
        System.out.println("Initial text = " + text);
        text = text.replaceAll("[.,?!\\-\\s]","").toLowerCase(Locale.ENGLISH);
        Stack<Character> originalStack = new Stack<>();
        Stack<Character> tempStack = new Stack<>();
        Stack<Character> reversedStack = new Stack<>();

        char[] chars = text.toCharArray();
        for(char c: chars){
            originalStack.push(c);
            tempStack.push(c);
        }
        for(char c: chars){
            Character charTemp = tempStack.pop();
            reversedStack.push(charTemp);
        }
        if(reversedStack.equals(originalStack)){
            return true;
        } else {
            return false;
        }
    }
}