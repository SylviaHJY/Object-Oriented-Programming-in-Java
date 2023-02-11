package ThisKeyword;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    public Account(int id, double balance, double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void withdraw(double amount){
        if(this.balance < amount){
            System.out.println("Below balance");
        }else{
            this.balance -= amount;
            System.out.println("Cash out : " + amount+ " Available balance : " + this.balance);
        }
    }

    public void deposit(double amount){
        if(amount > 0){
            this.balance += amount;
            System.out.println("Cash in : " + amount + " Available balance : " + this.balance) ;
        }
    }

}
