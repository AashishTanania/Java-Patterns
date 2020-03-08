package com.Ashu;

public class PyramidFun {
    public static void main(String[] args) {
        //A note here the input parameter takes no of lines to print the parameter
        //and output on the console...
        numberPyramidOutline(5);
        System.out.println();
        patternPyramid(5);
    }

    private static void patternPyramid(int lines) {
        int spaces = lines - 1;
        int l = 0;
        int value = 0;
        int newValue = 0;
        for (int i = 0; i < lines; i++) {
            for (int j = spaces; j > 0; j--) {
                System.out.print("      ");
            }
            spaces--;
            int mid = l / 2;
            for (int j = 0; j <= l; j++) {
                if (j < (mid + 1)) {
                    value++;
                    newValue = value;
                } else {
                    value--;
                }
                System.out.print((value > 9 ? (value > 99 ? "   " + value : "    " + value) : "     " + value));
            }
            value = newValue;
            l += 2;
            System.out.println();
        }
    }

    public static void numberPyramidOutline(int lines) {
         /* 1
           2 2
          3   3
         4     4
        555555555 prints pattern*/
        int spaces = lines - 1;//spaces to add in the pyramid
        int l = 0;//defines the boundary here
        int value = 1;
        for (int i = 0; i < lines; i++) {
            for (int j = spaces; j > 0; j--) {
                System.out.print(" ");
            }
            spaces--;
            if (i == lines - 1) //is used to print last line
            {
                for (int j = 0; j <= i; j++) {
                    if (j == lines - 1) {
                        System.out.print(value);
                        return;
                    }
                    System.out.print(value + "" + value);

                }
            }

            for (int j = 0; j <= l; j++)//is for boundary outline
            {
                if (j == 0 || j == l) {
                    System.out.print(value);
                } else {
                    System.out.print(" ");
                }
            }
            value++;
            l += 2;// is increment to outline count
            System.out.println();
        }
    }
}
