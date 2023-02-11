package TeamProject.Service;

import TeamProject.Util.Data;
import TeamProject.domain.*;

import static TeamProject.Util.Data.*;

/**
 * 将Data中的数据封装到Employee[]数组中：
 */

public class NameListService {
     private Employee[] employees; //声明一个数组变量；

     //给数组及数组元素进行初始化：
     public NameListService(){
         employees = new Employee[EMPLOYEES.length];

         for(int i = 0; i < employees.length; i++){
             //获取员工类型：
            int type = Integer.parseInt(EMPLOYEES[i][0]);

            //获取员工信息：
             int id = Integer.parseInt(EMPLOYEES[i][1]);
             String name = EMPLOYEES[i][2];
             int age = Integer.parseInt(EMPLOYEES[i][3]);
             Double salary = Double.parseDouble(EMPLOYEES[i][4]);
             Equipment equipment; // 声明员工的设备类型；
             double bonus; //声明奖金；
             int stock; // 声明股票；

             switch(type){
                case EMPLOYEE :
                    employees[i] = new Employee(id,name,age,salary);
                    break;

                case PROGRAMMER:
                    equipment = createEquipment(i); //写一个方法判断设备类型，然后接收；
                    employees[i] = new Programmer(id,name,age,salary,equipment);
                    break;

                case DESIGNER:
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    employees[i] = new Designer(id,name,age,salary,equipment,bonus);
                    break;


                case ARCHITECT:
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    stock = Integer.parseInt(EMPLOYEES[i][6]);
                    employees[i] = new Architect(id,name,age,salary,equipment,bonus,stock);
                    break;

            }
         }
     }

     // 获取指定index上的员工的设备：
    private Equipment createEquipment(int index) {
         int type  = Integer.parseInt(EQUIPMENTS[index][0]);
         String model = EQUIPMENTS[index][1];

         switch(type){
             case PC: //21; 不要用数字，可读性差，PC:21, model, display，用PC代替21；
                 String monitor = EQUIPMENTS[index][2];
                 return new PC(model,monitor);

             case NOTEBOOK: //22;
                 double price = Double.parseDouble(EQUIPMENTS[index][2]);
                 return new NoteBook(model,price);

             case PRINTER://23;

                 return new Printer(EQUIPMENTS[index][1],EQUIPMENTS[index][2]);

         }
         return null;
    }

    //获取当前所有员工：
    public Employee[] getAllEmployees(){
         return employees;
     }

     //获取指定ID的员工对象：
     public Employee getEmployee(int id){
         for(int i = 0; i < employees.length; i++){
             if(employees[i].getId() == id){
                 return employees[i];
             }
         }
         throw new TeamException("Employee doesn't exist!");

     }

}
