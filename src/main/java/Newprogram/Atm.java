package Newprogram;
import java.util.Scanner;

public class Atm {



    public static void main(String[] args) {

        int option=0;
        int A;
        int Amount;


        System.out.println("Well come your Bank");
        System.out.println("Choose any one Service");
        System.out.println("1 cash withdrawal"+'\n'+"2 Amount Transfer"+'\n'+"3 Balance Enquiry"+'\n'+"Otp Generate");
        Scanner s = new Scanner (System.in);
        A=s.nextInt();
        System.out.println ("Enter Amount ");
        Amount=s.nextInt();
        System.out.println ("Amount" +Amount);

        switch (option){
            case 1 : System.out.println ("Enter Amount ");
                //Scanner Amount = new Scanner (System.in);
                Amount=s.nextInt();


                System.out.println ("Amount" +Amount);
                break;



        }

   }

}






