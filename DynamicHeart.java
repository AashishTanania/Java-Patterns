package com.Ashu;

public class DynamicHeart {
    public static void main(String[] args) {
        printHeart(11);
    }

    public static void printHeart(int lines) {
        // Note the line must be greater than or equals to 6 for heart formation
        int space = 0;
        int startLineSpace = 1;
        int pos = ((lines - 2) / 2);
        for (int i = 0; i < ((lines - 2) / 2); i++) {
            startLine(lines, pos--);
        }
        joinLine(lines);
        for (int i = lines; i > 0; i--) {
            heartOutlinePattern(lines--, space++);
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