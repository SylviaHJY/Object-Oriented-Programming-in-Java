package StaticKey;

/**
 * Math.pow(a,b) 求a的b次方。
 */

public class AccountTest {
    public static void main(String[] args) {
        Account acct1 = new Account();
        System.out.println("acct1 ID: " + acct1.getId() + " acct1 balance: " + acct1.getBalance());
        Account acct2 = new Account("666888",60000);
        System.out.println("acct2 ID: " + acct2.getId() + " acct2 balance: " + acct2.getBalance());
        System.out.println(acct2);

        //通过"类.方法"设置属性的setter;
        Account.setInterestRate(0.045);
        Account.setMinBalance(600);

        System.out.println();
        acct2.FinalAmount(5);
        System.out.println(acct2.getFinalAmount());
    }
}

class Account{
    private String id = "4417123" + String.valueOf((int) (Math.random() * (100000-9999))); // 自动生成ID；
    private String password = "000000"; //初始密码
    private double balance;
    private static double interestRate;
    private static double minBalance = 1.0;
    private double finalAmount;


    // private static int init = (int) (Math.random() * 100000000); // 自动生成ID；

    public Account(){
        this.id = id;
    }

    public Account(String password,double balance){
        this();
        this.password = password;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public double getFinalAmount() {
        return finalAmount;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        Account.interestRate = interestRate;
    }

    public static double getMinBalance() {
        return minBalance;
    }

    public static void setMinBalance(double minBalance) {
        Account.minBalance = minBalance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                '}';
    }

    public double FinalAmount(int year){
        return finalAmount = this.balance * Math.pow((1 + interestRate), year); //求复利；
    }
}
