package AbstractConcept;

public abstract class Rbi {
    int balance;
    public Rbi(int balance)
    {
        this.balance=balance;
    }
    public abstract int withdrawl(int amount);
        public abstract  void deposite(int amount);
}
