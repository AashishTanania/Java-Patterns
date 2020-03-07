package com.Ashu;

public class Main {

    public static void main(String[] args) {
        reversePyramid(4);
/*
        //new line \n
        System.out.println("12345\n6789");
        //for space
        System.out.println("12345\t6789");
        //remove
        System.out.println("12345\r6789");
        //  remove one word
        System.out.println("12345\b6789");
        //special character
        System.out.println("12345\f6789");
        //unicode
        System.out.println("dsf\uabcdfg");
        //for no.s \1-9
        //System.out.println("qwer\12yu");







         //combinedPyramid(8);
         /*this pyramid pattern contains reverse value spaces to print the
         * reverse array as the print lines are even the spaces must be removed to print pattern
         * but in odd line values the space must be introduced to create a sequence
         *
         *
         * *****************************************************************
         * the same can be applied for the pattern with opposite combined array as the major pattern sync
         * can be introduced with the addition or reduction of spaces
         * so the value check can be as follows*/
        //reverseCombinedPyramid(12);

        /* but the bug here introduced as int the values must be sequenced as the pattern increases
         * must be one side long to print the odd lines as the appropriate
         * line can be chosen as upper or can be lower also but we'll choose lower pattern in the increase
         * of the lower case line*/


    }

    private static void patternPyramid(int lines) {
        int spaces = lines - 1;
        int l = 0;

        //the for loop is used to append space to make the pyramid pattern
        for (int i = 0; i < lines; i++) {
            for (int j = spaces; j > 0; j--) {
                System.out.print(" ");
            }
            spaces--;
            //is here used to print star in the pattern area
            for (int j = 0; j <= l; j++) {
                System.out.print("*");
            }
            l += 2;
            //is here for nextLine to print pattern again
            System.out.println();
        }
    }

    public static void reversePyramid(int lines) {
        reversePyramid(lines, -1);
    }

    private static void reversePyramid(int lines, int spaces) {

        int l = (lines * 2) - 2;

        for (int i = 0; i < lines; i++) {

            for (int j = 0; j <= spaces; j++) {
                System.out.print(" ");
            }
            spaces++;
            for (int j = l; j >= 0; j--) {
                System.out.print("*");
            }
            l -= 2;
            System.out.println();
        }
    }

    public static void combinedPyramid(int newlines) {
        if (newlines % 2 == 0) {
            patternPyramid(newlines / 2);
            reversePyramid(newlines / 2, -1);
        } else {
            patternPyramid((newlines / 2) + 1);

            reversePyramid((newlines / 2), 0);
        }
    }

    public static void reverseCombinedPyramid(int newlines) {
        if (newlines % 2 == 0) {
            reversePyramid(newlines / 2, -1);
            patternPyramid(newlines / 2);

        } else {

            reversePyramid((newlines / 2), 0);
            patternPyramid((newlines / 2) + 1);
        }

    }

    public static void patternPyramidOutline(int lines) {
        int spaces = lines - 1;//spaces to add in the pyramid
        int l = 0;//defines the boundary here
        for (int i = 0; i < lines; i++) {
            for (int j = spaces; j > 0; j--) {
                System.out.print(" ");
            }
            spaces--;
            if (i == lines - 1) //is used to print last line
            {
                for (int j = 0; j <= i; j++) {
                    if (j == lines - 1) {
                        System.out.print("*");
                        return;
                    }
                    System.out.print("**");

                }
            }

            for (int j = 0; j <= l; j++)//is for boundary outline
            {
                if (j == 0 || j == l) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            l += 2;// is increment to outline count
            System.out.println();
        }
    }
}
