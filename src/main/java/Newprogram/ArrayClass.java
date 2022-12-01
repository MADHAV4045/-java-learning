package Newprogram;

import java.util.Arrays;

public class ArrayClass {


    int Biggest(int arr[]) {
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    int findingLowest(int arr[]) {
        int min =arr[0];
        for(int j =1;j<arr.length;j++){
            if(arr[j] < min){
                min = arr[j];
            }
        }
        return min;

    }
    int sumArray(int arr[]) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result = result + arr[i];
        }
        return result;
    }

    int Text(int arr[]){
        Arrays.sort(arr);
        System.out.println("\nThe sorted array is: ");
        for (int num : arr) {
            System.out.print(num + " ");

        }
        return 0;
    }
    int Second(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.println("\nThe second biggest  array is: "+arr[1]);
        }

        return 0;
    }

}
