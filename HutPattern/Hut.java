package com.Ashu;

public class Hut {


    public static void main(String[] args) {
        patternPyramidOutline(9);
        System.out.println();
        patternRectangleOutline(15);
    }

    public static void patternPyramidOutline(int lines) {
        //upper body for the hut

        int spaces = lines - 1;
        int l = 0;
        for (int i = 0; i < lines; i++) {
            for (int j = spaces; j > 0; j--) {
                System.out.print(" ");
            }
            spaces--;
            if (i == lines - 1) {
                for (int j = 0; j <= i; j++) {
                    if (j == lines - 1) {
                        System.out.print("*");
                        return;
                    }
                    System.out.print("**");
                }
            }

            for (int j = 0; j <= l; j++) {
                if (j == 0 || j == l) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }

            l += 2;
            System.out.println();
        }
    }

    public static void patternRectangleOutline(int lines) {
        //lower body for the hut
        for (int i = 0; i < 4; i++) {
            System.out.print(" ");
            for (int j = 0; j < lines; j++) {
                if ((i == 1 || i == 2) && j > 3 && j < 11) {
                    //do check this OR || condition to be put here in brackets
                    //because it lets you know different styles for hut
                    //must try really good if you remove the brackets see what
                    // happens to future ashu. never forget
                    //making inner door
                    System.out.print("*");
                } else if (i == 3) {
                    System.out.print("*");
                } else if (j == 0 || j == lines - 1) {
                    //This conditions makes the outer boundary for the shape
                    System.out.print("*");
                } else {
                    //where when it gets here it adds space inside the inner door
                    System.out.print(" ");
                }

            }
            System.out.println();

        }


    }

}
