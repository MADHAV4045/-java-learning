package Newprogram;
import java.util.Arrays;

public class Sorting {
        void swap(int []arr,int a,int b)
        {
            arr[a]=arr[a]+arr[b];
            arr[b]=arr[a]-arr[b];
            arr[a]=arr[a]-arr[b];
        }
        public void Sort ( int arr[]) {
            for (int a = 0; a < arr.length - 1; a++) {
                for (int b = a + 1; b < arr.length; b++) {
                    if (arr[a] > arr[b]) {
                        swap(arr,a,b);
                    }

                }

            }
        }


        public static void main (String[]args){
            Sorting s = new Sorting();
            int[]arr=new int[]{7,4,1,5,50,70};
            s.Sort(arr);
            System.out.println(Arrays.toString(arr));

        }
    }





