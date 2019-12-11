package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int w1=scn.nextInt();
        int h1=scn.nextInt();
        fun(w1,h1);
        }
    public static void fun(int w,int h) {
        int data[][] = new int[h][w];
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= w; j++) {
                data[h - 1][w - 1] = j * i;
                System.out.print(data[h - 1][w - 1] + "\t");
            }
            System.out.println();
        }
    }
}
