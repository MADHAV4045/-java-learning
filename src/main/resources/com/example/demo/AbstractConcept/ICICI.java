package AbstractConcept;

public class ICICI extends Rbi{
    public ICICI(int balance){
        super(balance);
    }

    @Override
    public int withdrawl(int amount) {
        this.balance-=amount;
        return this.balance;
    }

    @Override
    public void deposite(int amount) {
        this.balance+=amount-2;

    }

    public int withdeaw(int amount){
        this.balance=balance;
        return this.balance;
    }

    @Override
    public String toString() {
        return "ICICI{" +
                "balance=" + balance +
                '}';
    }
}
