package ThisArrayPractice;

public class Bank {
    private Customer[] customers; // 存放多个客户的数组；数组的属性是Customer。
    private int numberOfCustomers; // 记录客户的个数

    public Bank(int a){
        customers = new Customer[a]; // 不写Customer[] customers = new Customer[a]; 因为Bank属性里已经有默认customers数组。
    }

    public void addCustomer(String f, String l){
        Customer cust = new Customer(f,l); //每次调用方法都会自动创建一个新的customer类。
        customers[numberOfCustomers] = cust; //numberOfCustomers 是index
        numberOfCustomers ++;
        // 或合并成：
        // customers[numberOfCustomers++] =cust;
    }

    public int getNumberOfCustomers(){
        return numberOfCustomers;
    }

    //获取指定位置上的客户
    public Customer getCustomer(int index){ //返回值的类型是Customer
        if(index >= 0 && index < numberOfCustomers){ // 如果造了存10个客户的数组长度但只存了3个客户，输入4就不合适。
            return customers[index];
        }else{
            throw new RuntimeException("Illegal index");
        }
    }
}
