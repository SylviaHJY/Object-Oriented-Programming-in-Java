package DesignProject.controllerService;

import DesignProject.ModelBean.Customer;

/**
 * CustomerList为customer对象的管理模块，内部数组管理一组Customer对象，并提供添加，修改，删除和遍历方法，
 * 供CustomerView调用。
 */

public class CustomerList {
    private Customer[] customers; // 用来保存客户对象的数组
    private int total = 0; // 记录保存客户对象的数量；

    public CustomerList(int totalCustomer){ //totalCustomer用来指定 Customers数组的最大空间, 数组长度
         customers = new Customer[totalCustomer];
    }

    public boolean addCustomer(Customer customer){ // 添加成功返回true, false: 添加失败
        if(total >= customers.length){
            return false;
        }
        customers[total] = customer;
        total ++;
        return true;
    }

    public boolean replaceCustomer(int index,Customer cust){ //true: 修改成功
        if (index < 0 || index >= total){
            return false;
        } customers[index] = cust;
        return true;
    }

    public boolean deleteCustomer(int index){
        if(index < 0 || index >= total){
            return false;
        }
        for(int i = index; i < total -1; i++){
            customers[i] = customers[i +1]; // 数组必须有连续的空间，后面的元素往前挪。
        }
        // 最后有数据的元素要置空!!!
        customers[total -1] = null;
        total--; // 不要忘记total--;
        return true;
    }

    public Customer[] getAllCustomers(){
        Customer[] custs = new Customer[total];
        for(int i = 0; i < total; i++){
            custs[i] = customers[i];
        }
        return custs;
    }

    public Customer getCustomer(int index){ // 如果找到了则返回，没找到返回null。
        if(index < 0 || index >= total){
            return null;
        }
        return customers[index];
    }

    public int getTotal(){
        return total;
    }

}
