package com.example.javapractice;

import android.util.Log;

public class Palindrome {


    public static boolean findPalindrome(String str) {


        for (int i = 0; i < str.length(); i++) {

            char startChar = str.charAt(i);
            char endChar = str.charAt(str.length() - i - 1);
            if (startChar == endChar) {



                return true;


            }


        }

        return false;
    }
}
