package Newprogram;
import java.util.Scanner;
import java.util.Arrays;

public class MaxAndMinFinding {
    int max;

    int findingBiggest(int arr[]) {
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }
            return max;
        }


        public static void main(String[]args) {
            int sum = 0;
            Scanner s = new Scanner(System.in);
            System.out.print("Eneter the size of array: ");
            int size = s.nextInt();
            int arr[] = new int[size];
            for (int i = 0; i < size; i++) {


                System.out.print("Enter the value of index " + i + " :");
                arr[i] = s.nextInt();

            }
            MaxAndMinFinding f =new MaxAndMinFinding();
            int result =f.findingBiggest(arr);
            System.out.println("sum of array is : "+result);
            int big=f.findingBiggest(arr);
            System.out.println("Biggest element of array is : "+big);
            System.out.println(Arrays.toString(arr));
            }
        }

