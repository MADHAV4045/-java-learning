package Newprogram;


import java.util.Arrays;
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        int sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Eneter the size of array: ");
        int size = s.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {


            System.out.print("Enter the value of index " + i + " :");
            arr[i] = s.nextInt();

        }
        ArrayClass f =new ArrayClass();
        int result =f.sumArray(arr);
        System.out.println("sum of array is : "+result);
        int big=f.Biggest(arr);
        System.out.println("\033[0;101m"+"Biggest element of array is : "+big);
        System.out.println(Arrays.toString(arr));
        int low=f.findingLowest(arr);
        System.out.println("\033[0;101m"+" Lowest element of array is : "+low);
        int sort=f.Text(arr);
        System.out.println("\033[0;101m"+" Lowest element of array is : "+ sort);
        int Se=f.Second(arr);
        System.out.println("\033[0;101m"+" Lowest element of array is : "+Se);
        System.out.println(Arrays.toString(arr));
    }
}

