package superKey;

public class CheckingAccount extends Account{ // 若父类未提供空参构造器：

    private double overdraft; //可透支限额


    public CheckingAccount(int id, double balance, double annualInterestRate,double overdraft){
        super(id,balance,annualInterestRate); //父类未提供空参构造器，可以通过调用另一个调用了super()构造器的构造器。
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw(double amount){
        //余额足够消费：
       if(getBalance() >= amount){ //balance私有化不能直接调，省略了this., this.getBalance()
           // getBalance() -= amount 的写法是错误的，不能给getBalance()赋值
           // 第一种正确写法： setBalance(getBalance - amount);
           // 第二种正确写法：
           super.withdraw(amount); // 调用父类的withdraw方法，这个方法可以调用private属性的balance。
       }else if(overdraft >= amount - getBalance()){ //余额不够的情况，先从balance里取钱，不够的再从透支额里取
           overdraft -= (amount - getBalance()); // amount - getBalance 为需要透支的钱，amount是想花的钱
           setBalance(0); //将余额设置成0，从余额里扣光再透支。
           //或者写成super.withdraw(getBalance());
       }else{
           System.out.println("Exceed Overdraft!");
       }
    }
}
