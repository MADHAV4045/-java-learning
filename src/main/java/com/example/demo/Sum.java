package com.example.demo;

import java.util.Scanner;

public class Sum {
    static int Sum(int a,int b)
    {
        int c=a+b;
        return c;
    }
    static int Sub(int a,int b)
    {
        int c=a-b;
        return c;
    }

    public static void main(String[] args) {
        int a,b;
        System.out.println("\033[0;33m"+"Choose One Option"+"  A = Sum"+"  B =Subtraction"+"  C =Multiplication");
        Scanner s=new Scanner(System.in);
        System.out.println("enter a");
        a =s.nextInt();
        System.out.println("enter b");
        b =s.nextInt();

    }
}
