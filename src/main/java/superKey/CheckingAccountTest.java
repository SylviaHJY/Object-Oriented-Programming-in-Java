package superKey;

public class CheckingAccountTest {
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount(1122,6000,0.045,5000);
        account.withdraw(5000);
        System.out.println("balance: " + account.getBalance() + "\t" + "Overdraft: " + account.getOverdraft());
        account.deposit(5000);
        account.withdraw(7000);
        System.out.println("balance: " + account.getBalance() + "\t" + "Overdraft: " + account.getOverdraft());
        account.withdraw(5500);
        System.out.println("balance: " + account.getBalance() + "\t" + "Overdraft: " + account.getOverdraft());
    }
}
