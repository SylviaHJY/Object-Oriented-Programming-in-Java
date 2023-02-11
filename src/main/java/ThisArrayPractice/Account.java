package ThisArrayPractice;

public class Account {
    private double balance;

    public Account(double init_balance){
        this.balance = init_balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amt){
        if(amt > 0){
            this.balance += amt;
            System.out.println("Cash in : " + amt + " Available Balance : " + this.balance);
        }
    }

    public void withdraw(double amt){
        if(this.balance >= amt){
            this.balance -= amt;
            System.out.println("Cash out : " + amt + " Available Balance : " + this.balance);
        }else{
            System.out.println("Below balance");
        }
    }

}
