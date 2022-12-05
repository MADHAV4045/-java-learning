package Newprogram;

import java.util.Scanner;
import java.util.Arrays;

public class ArraySort {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Eneter the size of array: ");
        int size = s.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {


            System.out.print("Enter the value of index " + i + " :");
            arr[i] = s.nextInt();
            ArraySort a=new ArraySort();

        }
    }
}

