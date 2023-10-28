package com.myapp;

public class W02_PrintingPatterns {

    public static void trianglePattern1(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                count++;
                System.out.print(count + " ");
            }
            System.out.println();
        }
    }

    public static void pascalTriangle(int n) {
        for (int line = 1; line <= n; line++) {

            for (int k = 0; k <= n - line; k++) {
                System.out.print(" ");
            }

            int currentValue = 1;
            for (int col = 1; col <= line; col++) {
                System.out.print(currentValue + " ");
                currentValue = currentValue * (line - col) / col;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        trianglePattern1(5);
        pascalTriangle(5);
    }
}
