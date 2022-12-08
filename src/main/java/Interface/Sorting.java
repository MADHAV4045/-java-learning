package Interface;

import java.util.Arrays;

public class Sorting implements Try2{
    int arr[]={7,10,50,40,30};
    @Override
    public void sort(int arr[]) {
            for (int a = 0; a < arr.length - 1; a++) {
                for (int b = a + 1; b < arr.length; b++) {
                    if (arr[a] > arr[b]) {
                        arr[a]=arr[a]+arr[b];
                        arr[b]=arr[a]-arr[b];
                        arr[a]=arr[a]-arr[b];
                    }

                }

            }
            //Arrays print funcation
        System.out.println(Arrays.toString(arr));
        }
}

