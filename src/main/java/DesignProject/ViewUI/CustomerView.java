package DesignProject.ViewUI;

import DesignProject.ModelBean.Customer;
import DesignProject.Util.CMUtility;
import DesignProject.controllerService.CustomerList;




/**
 * CustomerView为主模块，负责菜单的显示和处理用户操作。
 */

public class CustomerView{
    private CustomerList customerList = new CustomerList(10);
    public CustomerView(){
    }

    public void enterMainMenu(){
        boolean isFlag = true;
        while(isFlag){
            System.out.println("\n-----------------Customer Information System-------------------");
            System.out.println("                   1. Add Customer");
            System.out.println("                   2. Modify Customer");
            System.out.println("                   3. Delete Customer");
            System.out.println("                   4. Show CustomerList");
            System.out.println("                   5. Quit");
            System.out.println("                   Please Enter : ");

            char menu = CMUtility.readMenuSelection(); //是char, 加了''单引号
            switch(menu){
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomer();
                    break;
                case  '5':
                    System.out.println("Are you sure you want to exit (Y/N) : ");
                    char isExit = CMUtility.readConfirmSelection();
                    if(isExit == 'Y'){
                        isFlag = false;
                    } // 若输入N则自动跳回循环体，isFlag = true。
            }
        }
    }

    private void addNewCustomer(){
        System.out.println("------------------------Add Customer------------------------------");
        System.out.print("Name:");
        String name = CMUtility.readString(25);
        System.out.print("Gender:");
        char gender = CMUtility.readChar();
        System.out.print("Age:");
        int age = CMUtility.readInt();
        System.out.print("Phone:");
        String phone = CMUtility.readString(10);
        System.out.print("Email:");
        String email = CMUtility.readString(30);

        //将上述数据封装到对象中
        Customer customer = new Customer(name,phone,email,gender,age);

        boolean isSuccess = customerList.addCustomer(customer);
        if(isSuccess){ //如果返回值为true:
            System.out.println("-----------------------Added-----------------------------------");
        }else{
            System.out.println("-----------------------Could not Add---------------------------");
        }

    }

    private void modifyCustomer(){
        System.out.println("------------------------Modify Customer--------------------------");

        Customer cust; //声明一个cust变量，循环结束后仍需使用。
        int number; // 结束循环后还需要使用，声明在循环体外。

        // for(;;)
        //This is an infinite loop, no variables initialization,
        // no condition to check, no incremental step ...
        // only exits the loop when execute the "return" sentence inside conditions.
        //The only ways to terminate the cycle are the two return statements.
        //只有当执行到for循环内方法体的return语句时才退出。

        for(;;){
            System.out.println("Please select the number of customer( -1 exit): ");
             number = CMUtility.readInt();

            if(number == -1){
                return; //结束循环
            }
            cust = customerList.getCustomer(number -1); // 数组从0开始的。

            if(cust == null){
                System.out.println("No customer exit!");
            }else{ // 找到了相应编号的客户
                break; //结束循环。不把接下来的步骤写在这避免循环套循环代码冗长。另起一行，如能执行到这说明能找到客户，退出循环。
            }
        }
        // 修改客户信息
        System.out.println("Name(" + cust.getName() + "):" );
        String name = CMUtility.readString(25,cust.getName()); //修改姓名、电话、邮箱时，不输入信息直接回车返回默认值。

        System.out.println("Gender(" + cust.getGender() + "):" );
        char gender = CMUtility.readChar(cust.getGender());

        System.out.println("Age(" + cust.getAge() + "):" );
        int age = CMUtility.readInt(cust.getAge());

        System.out.println("Phone(" + cust.getPhone() + "):" );
        String phone = CMUtility.readString(10,cust.getPhone());

        System.out.println("Email(" + cust.getEmail() + "):" );
        String email = CMUtility.readString(30,cust.getEmail());

        // 把修改过的信息装在一个新的对象中
        Customer newCustomer = new Customer(name,phone,email,gender,age);
        customerList.replaceCustomer(number-1,newCustomer); //普通用户看到的列表是从1开始的，要-1。
        boolean isReplace = customerList.replaceCustomer(number-1,newCustomer);
        if(isReplace){ // 当返回值为true时：
            System.out.println("----------------------------Replaced-----------------------------");
        }else{
            System.out.println("----------------------------Could not replace---------------------");
        }

    }

    private void deleteCustomer(){
        System.out.println("----------------------------Delete Customer-------------------------");

        int number;
        Customer customer;
        for(;;){
            System.out.println("Please select the number of customer( -1 exit): ");
            number = CMUtility.readInt();
            if(number == -1){
                return;
            }
            customer = customerList.getCustomer(number -1);
            if(customer == null){
                System.out.println("No customer exit!");
            }else{
                break; //  找到客户，终止循环，开始执行删除客户代码。
            }
        }
        //删除操作：
        System.out.println("Are you sure you want to delate this customer(Y/N): ");
        char isDelete = CMUtility.readConfirmSelection(); //utility方法里已经将y,n小写转换成Y、N。
        if(isDelete == 'Y'){         // 客户端看到的数组是从1开始的，实际代码端是从0开始的。
            boolean deleteSuccess = customerList.deleteCustomer(number - 1);
            if(deleteSuccess){
                System.out.println("---------------------Deleted--------------------------");
            }else{
                System.out.println("---------------------Could not delete-----------------");
            }
        }else{
            return; //回到主界面。
        }
    }

    private void listAllCustomer(){
        System.out.println("-----------------------Customer List---------------------------\n");
        int total = customerList.getTotal();
        if(total == 0){
            System.out.println("No customers exist!");
        }else{
            System.out.println(" Index\t\tName\tGender\t\tAge\t\tPhone Number\t\t\tEmailAddress"); //制表符
            Customer[] cust = customerList.getAllCustomers();
            for(int i = 0; i < total; i++){
                System.out.println((i+1) + "\t\t" + customerList.getCustomer(i).getName()+ "\t\t" +
                        customerList.getCustomer(i).getGender() + "\t\t" + customerList.getCustomer(i).getAge() +
                        "\t\t\t" + customerList.getCustomer(i).getPhone() + "\t\t" + customerList.getCustomer(i).getEmail());
            }
        }
    }

    public static void main(String[] args) {
        CustomerView view = new CustomerView();
        view.enterMainMenu();
    }




}
