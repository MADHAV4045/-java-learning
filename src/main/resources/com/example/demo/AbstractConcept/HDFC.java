package AbstractConcept;

public class HDFC extends Rbi{
    public HDFC(int balance){
        super(balance);
    }
    @Override
    public int withdrawl(int amount) {
        this.balance-=amount;
        return this.balance;
    }

    @Override
    public void deposite(int amount) {
        this.balance+=amount;
    }

    @Override
    public String toString() {
        return "HDFC{" +
                "balance=" + balance +
                '}';
    }
}
