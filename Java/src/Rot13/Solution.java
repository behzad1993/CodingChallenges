package Rot13;

import java.util.Arrays;

class Solution {

    public static String rot13(String message) {
        char[] messageCharArray = message.toCharArray();
        char[] cipheredCharArray = new char[messageCharArray.length];

        for (int i = 0; i < messageCharArray.length; i++) {
            char toCipher = messageCharArray[i];
            char cipheredChar;

            if       (toCipher >= 'a' && toCipher <= 'm') cipheredChar = (char) (toCipher + 13);
            else if  (toCipher >= 'A' && toCipher <= 'M') cipheredChar = (char) (toCipher + 13);
            else if  (toCipher >= 'n' && toCipher <= 'z') cipheredChar = (char) (toCipher - 13);
            else if  (toCipher >= 'N' && toCipher <= 'Z') cipheredChar = (char) (toCipher - 13);
            else cipheredChar = toCipher;

            cipheredCharArray[i] = cipheredChar;
        }
        return String.copyValueOf(cipheredCharArray);
    }

    private static boolean isUmlaut(char c) {
        return c == 'ä' || c == 'ö' || c == 'ü';
    }
}