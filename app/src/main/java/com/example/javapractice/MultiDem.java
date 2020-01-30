package com.example.javapractice;

public class MultiDem {

    public static int[][] multi = new int[10][10];


    public static void printTable(){

        System.out.println("MY MULTIPLICATION TABLE");
        for(int i = 1;i<11;i++){
            for (int j = 1; j < 11; j++) {

                multi[i-1][j-1] = i*j;

                System.out.print(multi[i-1][j-1] + "\t");

            }

            System.out.println("\n");
        }

    }





}
