package ThisKeyword;

public class CustomerTest {
    public static void main(String[] args) {
        Customer c = new Customer("Jame","Smith");
        Account a = new Account(98033,61000,0.0123);
        c.setAccount(a); // 把设置的account和客户联系起来，这样设置的账户才隶属于客户名下。
        // 通过客户可以访问姓名，账号，账号的地址指向客户类里账户属性的地址，通过账户可以访问id卡号，余额，年利率，存取款。

        //首先获得客户的账号，再进行操作：
        c.getAccount().deposit(1000);
        c.getAccount().withdraw(600);
        c.getAccount().deposit(2000);
        System.out.println();

        System.out.println("First name" + "\t\t" + " Last name " + "\t\t" + "Card number" + "\t\t" +
                " AnnualInterest " + "\t\t" + "Balance");
        // 账户和客户关联，通过调用客户的账户再调用账户的属性。
        System.out.println(c.getFirstName() + "\t\t\t\t" + c.getLastName() + "\t\t\t" + c.getAccount().getId()
        +"\t\t\t" + c.getAccount().getAnnualInterestRate() * 100 + "%" + "\t\t\t\t" + c.getAccount().getBalance());
    }
}
