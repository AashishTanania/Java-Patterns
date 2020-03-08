package com.Ashu;


public class Alphabets {

    public static void main(String[] args) {
      

        alphabetPyramid(9);
    }

    private static void alphabetPyramid(int lines) {
        int spaces = lines - 1;
        int l = 0;
        int value = 64;
        int newValue = 0;
        for (int i = 0; i < lines; i++) {
            for (int j = spaces; j > 0; j--) {
                System.out.print("    ");
            }
            spaces--;
            int mid = l / 2;
            for (int j = 0; j <= l; j++) {
                if (j < (mid + 1)) {
                    if (value == 90) {
                        value = 64;
                    }
                    value++;
                    newValue = value;
                } else {
                    if (value == 65) {
                        value = 91;
                    }
                    value--;
                }
                System.out.print((value > 90 ? "   " + (char) value : "   " + (char) value));
            }
            value = newValue;
            l += 2;
            System.out.println();
        }
    }
}
