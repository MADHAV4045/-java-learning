package com.example.demo;

public class PatternA {
    public static void main(String[] args) {
        int n=11;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                if ((j==1)||(j==n)||(i==j&&j<=(n/2))||(i+j==n+1&&j>(n/2) )){

                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }

            }
            for (int j = 1; j <= n; j++) {

                if ((i==10||i==j&&j>=(n/2))||(i+j==n+1&&j<(n/2) )){

                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }

            }
            for (int j = 1; j <= n; j++) {
                if (j==1 && i<=n||i==1 && j<=8|| i==11 && j<=8|| j==11 && i>=2 && i<=9){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }

            }
            for (int j = 1; j <= n; j++) {
                if (j==1 || j==5|| (i==5 && j<=(n/2))) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }

            }
            for (int j = 1; j <= n; j++) {

                if ((i==10||i==j&&j>=(n/2))||(i+j==n+1&&j<(n/2) )){

                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }

            }
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

