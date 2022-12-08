package Newprogram;
import java.util.Scanner;

public class Atm2 {
    public static void main(String[] args) {



            {
                int B = 5000, takeout, takein ;
                Scanner s = new Scanner(System.in);
                while(true)
                {
                    System.out.println("\033[0;101m"+"    WELLCOME TO MY ATM ");
                    System.out.println(" Chose the option you want to continue on ");
                    System.out.println(" 1 for Withdraw");
                    System.out.println(" 2 for Deposit");
                    System.out.println(" 3 for Check Balance");
                    System.out.println(" 4 for EXIT");
                    System.out.print("Choose the operation you want to perform:");
                    int n = s.nextInt();
                    switch(n)
                    {
                        case 1:
                            System.out.println("       Enter money to be withdrawn:");
                            takeout = s.nextInt();
                            if(B >= takeout)
                            {
                                B = B - takeout;
                                System.out.println("         Please collect your money ' bro party :-) '");
                            }
                            else
                            {
                                System.out.println("     Insufficient Balance    :-[ ");
                            }
                            System.out.println("");
                            break;

                        case 2:
                            System.out.print("      Enter money to be deposited:");
                            takein = s.nextInt();
                            B = B+ takein;
                            System.out.println("        Your Money has been successfully depsited  'HURRyyyy  '   ");
                            System.out.println("");
                            break;

                        case 3:
                            System.out.println("      Balance : "+ B );
                            System.out.println("");
                            break;

                        case 4:
                            System.exit(0);

                        default:
                        {

                            System.out.println ("            ERROR WHILE SELECTING OPTION"  );
                        }
                    }
                }
            }
    }
}
