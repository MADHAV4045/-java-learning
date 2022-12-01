package Newprogram;
import java.util.Scanner;

public class SumofArray {
    public static void main(String[] args) {
        int sum=0;
        Scanner s=new Scanner(System.in);
        System.out.print("Eneter the size of array: ");
        int size=s.nextInt();
        int arr[]=new int[size];
        for (int i = 0; i < size; i++) {


            System.out.print("Enter the value of index "+i+" :");
            arr[i]=s.nextInt();
            sum+=arr[i];
            System.out.println("Sum of Arreys is:-"+"\033[1;34m"+(sum));
        }

        for (int i = 0; i <size ; i++) {

            System.out.println("Value of arr["+i+"]="+"\033[0;101m"+arr[i]);

        }


    }
}
