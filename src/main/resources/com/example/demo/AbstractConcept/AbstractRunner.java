package AbstractConcept;

public class AbstractRunner {
    public static void main(String[] args) {
        Rbi i=new ICICI(50000);
        Rbi h=new HDFC(40000);
        i.deposite(5000);
        i.withdrawl(10000);
        System.out.println(i);
        System.out.println(h);
    }
}
