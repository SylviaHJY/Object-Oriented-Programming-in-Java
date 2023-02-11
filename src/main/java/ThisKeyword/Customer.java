package ThisKeyword;

public class Customer {

    private String firstName;
    private String lastName;
    private Account account; // 自定义的类


    public Customer(String f, String l){
        this.firstName = f;
        this.lastName = l;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAccount(Account account){
        this.account = account;
    }

    public Account getAccount(){
        return account;
    }


}
