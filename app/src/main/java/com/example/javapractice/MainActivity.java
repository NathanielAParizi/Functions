package com.example.javapractice;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Duplicates
        Duplicates.findDuplicates();


        // Palindrome
        if(Palindrome.findPalindrome("racecar")){

            Log.v("Palindrome", "true");

        }

        // Fizzbuzz
        Fizzbuzz.fizzBuzzTester();

        // Anagrams
        Anagrams.checkAnagrams("Silent","Listen");

        // Multiplication Tables
        MultiDem.printTable();



    }
}
