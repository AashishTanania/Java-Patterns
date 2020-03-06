package com.Ashu;
//Developed By @ Aashish Tanania
public class DynamicHeart {
    public static void main(String[] args) {
        printHeart(18);
    }

    public static void printHeart(int lines) {
        // Note the line must be greater than or equals to 6 for heart formation
        boolean even = lines % 2 == 0;
        int space = 0;
        int newLine = (lines / 2);
        int loop = (lines - (newLine));
        int pos = even ? (loop / 2) : (loop / 2) - 1;

        for (int i = 0; i < loop / 2; i++) {
            startLine(newLine, pos--);
            if (!even && pos == 0) {
                break;
            }
        }

        joinLine(newLine);
        for (int i = lines; i > 1; i--) {
            heartOutlinePattern(newLine--, space++);
        }


    }

    public static void startLine(int lines, int pos) {


        for (int i = 1; i < lines * 2; i++) {
            if (i == pos || i == (lines - pos) || i == (lines + pos) || i == (lines * 2) - pos) {
                System.out.print(" * ");
            } else {
                System.out.print("   ");
            }
        }
        System.out.println();
    }

    public static void joinLine(int lines) {

        //For joining Heart Tail portion to head
        for (int i = 1; i < lines * 2; i++) {
            if (i == 1 || i == (lines * 2) - 1 || i == lines) {
                System.out.print(" * ");
            } else {
                System.out.print("   ");
            }
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
}