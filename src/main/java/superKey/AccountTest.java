package superKey;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(1234,50000,0.045);

        account.withdraw(3000);
        System.out.println("Balance: " + account.getBalance());
        account.deposit(10000);
        System.out.println("Balance: " + account.getBalance());

        System.out.println("monthlyRate: " + (account.getMonthlyInterest()) * 100 +"%");
    }
}
