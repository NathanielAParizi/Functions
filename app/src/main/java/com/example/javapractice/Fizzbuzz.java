package com.example.javapractice;

import android.util.Log;

public class Fizzbuzz {

    public static void fizzBuzzTester() {



        for (int i = 0; i < 100; i++) {


            if (i % 3 == 0 && i % 5 == 0) {
                Log.v("Fizzbuzz", "Fizzbuzz");

                if (i % 3 == 0) {

                    Log.v("Fizzbuzz", "Fizz");

                }
            }

            if (i % 5 == 0) {
                Log.v("Fizzbuzz", "Buzz");


            }

        }


    }
}
