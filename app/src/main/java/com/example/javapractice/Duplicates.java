package com.example.javapractice;

import android.util.Log;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Duplicates {

    public static void findDuplicates() {

        List<String> str = new ArrayList<>();
        List<String> duplicateStr = new ArrayList<>();

        str.add("Apples");
        str.add("Oranges");
        str.add("Banana");
        str.add("Dragon Fruit");
        str.add("Lime");
        str.add("Lime");
        str.add("Melon");

        HashSet<String> cool = new HashSet<>();
        Log.v("Dups", "v");


        for (int i = 0; i < str.size(); i++) {


            if (cool.contains(str.get(i))) {

                //add duplicate value to separate array

                duplicateStr.add(str.get(i));

            } else {

                //add unique value to HashSet

                cool.add(str.get(i));

            }

        }


        for (String words : cool) {

            Log.v("Duplicates", words);

        }

        for (int i = 0; i < str.size(); i++) {


        }

    }

}
