package org.example;


import java.util.LinkedList;
import java.util.Locale;
import java.util.Stack;

public class Main {
    public static boolean checkForPalindrome(String text) {
        String cleanedStr = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        LinkedList<Character> charList = new LinkedList<>();
        for (char c : cleanedStr.toCharArray()) {
            charList.add(c);
        }
        while (charList.size() > 1) {
            if (!charList.pollFirst().equals(charList.pollLast())) {
                return false;
            }
        }
        return true;
    }

    public static String convertDecimalToBinary(int decimal) {
        //kalanı saklama ve sırası önemli => linkedlist
        LinkedList<Integer> binaryList = new LinkedList<>();
        while (decimal > 0) {
            int reminder = decimal % 2;
            binaryList.addFirst(reminder);
            decimal = decimal / 2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int digit : binaryList) {
            stringBuilder.append(digit);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(checkForPalindrome("I did, did I?"));


    }
}