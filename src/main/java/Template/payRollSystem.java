package Template;

import java.util.Calendar;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 */

public class payRollSystem {
    public static void main(String[] args) {
        //第一种写法：
//        Employee[] employees = new Employee[100]; // 创建对象类型是Employee的数组；
//        employees[0] = new MonthlyEmployee("Tom",29,new MyDate(1992,2,28),5000); // 多态性；

        //第二种写法：
        Scanner scanner = new Scanner(System.in);
        Vector v = new Vector();
        // for(;;)或while(true)方式，给 Vector中添加对象：
        for(;;){
            System.out.println("Please select employee type(1.MonthlyEmployee 2. HourlyEmployee 3.Exit):");
            int num = scanner.nextInt();
            if(num == 3){
                break;
            }
            if(num != 1 && num != 2){
                throw new RuntimeException("Illegal input!");
            }

            System.out.println("Please input employee information: ");
            System.out.print("Name: ");
            String name = scanner.next();

            System.out.print("NumberID: ");
            int numberID = scanner.nextInt();

            System.out.println("Birthday :");
            System.out.print("Year: ");
            int year = scanner.nextInt();
            System.out.print("Month: ");
            int month = scanner.nextInt();
            System.out.print("Day: ");
            int day = scanner.nextInt();
            //将输入的生日信息封装到MyDate;
            MyDate date = new MyDate(year,month,day);

            System.out.println("Please enter current date: ");
            System.out.print("CurrentYear: ");
            int currentYear = scanner.nextInt();
            System.out.print("CurrentMonth: ");
            int currentMonth = scanner.nextInt();
            System.out.print("CurrentDay: ");
            int currentDay = scanner.nextInt();

//            Calendar calendar = Calendar.getInstance();
//            int year1 = calendar.get(Calendar.YEAR);
//            int month1 = calendar.get(Calendar.MONTH);  // 获取的month一月份是：0；代码中要写：month+1;
//            int day1 = calendar.get(Calendar.DAY_OF_MONTH);

            switch(num){
                case 1 :
                    System.out.println("MonthlySalary: ");
                    double monthlySalary = scanner.nextDouble();
                    //将输入的信息封装起来并创建MonthlyEmployee的多态对象:
                    Employee employee = new MonthlyEmployee(name,numberID, date,monthlySalary);
                    v.addElement(employee);
                    if(currentDay == day && currentMonth == month){
                        System.out.print("Happy birthday! You are " + (currentYear - year) + " years old!");
                        System.out.println("You get  $" + employee.bonus() + " bonus today! ");
                    }
                    break;


                case 2:
                    System.out.println("Wage: ");
                    int wage = scanner.nextInt();
                    System.out.println("Hour: ");
                    int hour = scanner.nextInt();
                    //将输入的信息封装起来并创建HourlyEmployee的多态对象:
                     Employee employee1 = new HourlyEmployee(name,numberID,date,wage,hour);
                     v.addElement(employee1);
                    if(currentDay == day && currentMonth == month){
                        System.out.print("Happy birthday! You are " + (currentYear - year) + " years old!");
                        System.out.println("You get  $" + employee1.bonus() + " bonus today! ");
                    }
                    break;

            }

        }

        for(int i = 0; i < v.size(); i++){
            Object obj = v.elementAt(i); //取出来的元素是object类型的;
            //向下转型：
            if(obj instanceof MonthlyEmployee){
                MonthlyEmployee M1 = (MonthlyEmployee) obj;
                System.out.println(M1.toString() + "salary: " + M1.earnings());
            }
            if(obj instanceof HourlyEmployee){
                HourlyEmployee H1 = (HourlyEmployee) obj;
                System.out.println(H1.toString() + "salary: " + H1.earnings());
            }
        }

    }
}
