package com.Ashu;

public class Main {

    public static void main(String[] args) {
        //reversePyramid(10);
        //patternPyramid(11);
        //reverseCombinedPyramid(12);
        patternPyramidOutline(10);

      







         


    }

    private static void patternPyramid(int lines) {
        int spaces = lines - 1;
        int l = 1;

        //the for loop is used to append space to make the pyramid pattern
        for (int i = 1; i <= lines; i++) {
            for (int j = spaces; j > 0; j--) {
                System.out.print("   ");
            }
            spaces--;
            //is here used to print star in the pattern area
            for (int j = 1; j < l * 2; j++) {
                System.out.print(" * ");
            }
            l++;
            //is here for nextLine to print pattern again
            System.out.println();
        }
    }

    public static void reversePyramid(int lines) {
        reversePyramid(lines, -1);
    }

    private static void reversePyramid(int lines, int spaces) {

        int l = lines;

        for (int i = 0; i < lines; i++) {

            for (int j = 0; j <= spaces; j++) {
                System.out.print("   ");
            }
            spaces++;
            for (int j = l * 2; j > 1; j--) {
                System.out.print(" * ");
            }
            l--;
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
        int l = 1;//defines the boundary here
        for (int i = 0; i < lines; i++) {
            for (int j = spaces; j > 0; j--) {
                System.out.print(" ");
            }

            if (i == lines - 1) //is used to print last line
            {
                for (int j = 0; j <= i * 2; j++) {
                    System.out.print("*");
                }
                break;
            }

            for (int j = 1; j < l * 2; j++)//is for boundary outline
            {
                if (j == 1 || j == (l * 2) - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            spaces--;
            l++;// is increment to outline count
            System.out.println();
        }
    }
}
