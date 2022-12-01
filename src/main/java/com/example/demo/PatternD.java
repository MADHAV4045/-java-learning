package com.example.demo;

public class PatternD {
    public static void main(String[] args) {
        int n=11;
        for (int i=1;i<=n;i++){

            for (int j = 1; j <= n; j++) {
                if (j==1 && i<=n||i==1 && j<=8|| i==11 && j<=8|| j==11 && i>=2 && i<=9){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }



}

