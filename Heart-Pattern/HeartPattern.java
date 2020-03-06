package com.Ashu;

import java.util.Scanner;
//Developed , Designed and Implemented By @ Aashish Tanania

public class HeartPattern {
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        printHeartOutline();
       // printHeartOutlineOpposite();
        System.out.println("\n");



        printFilledHeart();
        printHeartOutlineOpposite();
        //printFilledHeartOpposite();


        //Combined heart pattern and different patterns can be made...

    }


    //by using these four methods different patterns can be made
    public static void printHeartOutline() {
        int lines = 5;
        lines1(lines);

        outLines3(lines);
        int value = 0;
        for (int i = lines; i > 0; i--) {
            heartOutlinePattern(i, value);
            value++;
        }
    }

    public static void printHeartOutlineOpposite() {
        //reversed on the basis of above program
        int lines = 5;
        int value = 4;
        for (int i = 1; i <= lines; i++) {
            heartOutlinePattern(i, value);
            value--;
        }
        outLines3(lines);
        lines1(lines);


    }



    public static void printFilledHeart() {
        int lines = 5;
        lines1(lines);
        pattern(lines, 0);
        int value = 0;
        for (int i = lines; i > 0; i--) {
            pattern(i, value);
            value++;
        }
    }

    public static void printFilledHeartOpposite() {
        //reversed on the basis of above program
        int lines = 5;
        int value = 4;
        for (int i = 1; i <= lines; i++) {
            pattern(i, value);
            value--;
        }
        pattern(lines, 0);
        lines1(lines);
    }


    //Below are the methods which used to call for printing the heart pattens as per need

    public static void lines1(int lines) {
        for (int i = 1; i < lines * 2; i++) {
            if ((i >= 2 && i <= lines - 1) || (i >= (lines + 1) && i <= (lines * 2) - 2)) {
                System.out.print(" * ");
            } else {
                System.out.print("   ");
            }
        }

        System.out.println();
    }

    public static void pattern(int lines, int spaces) {
        //For printing spaces to the lines of the Pattern
        for (int i = 1; i <= spaces; i++) {
            System.out.print("   ");
        }
        //For Printing Heart Tail
        for (int i = 1; i < lines * 2; i++) {
            System.out.print(" * ");
        }
        System.out.println();
    }

    public static void heartOutlinePattern(int lines, int spaces) {
        //For printing spaces to the lines of the Pattern
        for (int i = 1; i <= spaces; i++) {
            System.out.print("   ");
        }
        //For Printing Heart Tail
        for (int i = 1; i < lines * 2; i++) {
            if (i == 1 || i == (lines * 2) - 1) {
                System.out.print(" * ");
            } else {
                System.out.print("   ");
            }

        }
        System.out.println();
    }

    public static void outLines3(int lines) {


        //For Printing Heart Tail
        for (int i = 1; i < lines * 2; i++) {
            if (i == 1 || i == (lines * 2) - 1 || i == lines) {
                System.out.print(" * ");
            } else {
                System.out.print("   ");
            }
        }
        System.out.println();
    }

}
