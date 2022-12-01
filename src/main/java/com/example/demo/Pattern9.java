package com.example.demo;

public class Pattern9 {
    public static void main(String[] args) {
        int n=11;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                if ((i==j&&j<=(n/2))||(i+j==n+1&&j>(n/2) )){

                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }

            }
            System.out.println();


        }
    }
}
