package ThisArrayPractice;

public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank(10);
        bank.addCustomer("James","Smith"); //银行新建一个客户
        bank.getCustomer(0).setAccount(new Account(2000)); // 获得新建客户的位置然后给客户新建账号。

        System.out.println( bank.getCustomer(0).getFirstName()+ "\t" + bank.getCustomer(0).getLastName());

        //连续操作
        bank.getCustomer(0).getAccount().deposit(5000);
        bank.getCustomer(0).getAccount().withdraw(500);
        System.out.println(bank.getCustomer(0).getAccount().getBalance());
        System.out.println();

        bank.addCustomer("Paul","Dua ");
        bank.getCustomer(1).setAccount(new Account(4000));

        System.out.println("Customer Numbers: " + bank.getNumberOfCustomers());


        bank.addCustomer("Crystal","Styer");
        bank.getCustomer(2).setAccount(new Account(1300));

        bank.addCustomer("Rachel","Anne");
        bank.getCustomer(3).setAccount(new Account(3500));

        bank.addCustomer("Addi","Hou ");
        bank.getCustomer(4).setAccount(new Account(4000));

        bank.addCustomer("Olivia","Obin");
        bank.getCustomer(5).setAccount(new Account(2300));

        bank.addCustomer("Justin","Wong");
        bank.getCustomer(6).setAccount(new Account(1500));

        bank.addCustomer("Jason","branch");
        bank.getCustomer(7).setAccount(new Account(2800));

        bank.addCustomer("Dylan","Edwards");
        bank.getCustomer(8).setAccount(new Account(6700));

        bank.addCustomer("Eric","Corriel");
        bank.getCustomer(9).setAccount(new Account(2100));

        System.out.println(bank.getNumberOfCustomers());
        System.out.println();

        System.out.println("First Name " + "\t\t\t" + "Last Name" + "\t\t" + "Available Balance");

        for(int i = 0; i < bank.getNumberOfCustomers(); i++){
            System.out.println(bank.getCustomer(i).getFirstName() + "\t\t\t\t" + bank.getCustomer(i).getLastName() +
                    "\t\t\t\t\t" + bank.getCustomer(i).getAccount().getBalance());
        }
    }
}
