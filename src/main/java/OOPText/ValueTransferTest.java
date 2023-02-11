package OOPText;

/** 方法的形参的传递机制，值传递
 *
 * 1.形参：方法定义时，声明的小括号内的参数
 *   实参：方法调用时，实际传递给形参的数据
 *
 *   2.值传递机制
 *   如果参数是基本数据类型，此时实参赋给形参的是实参真实存储的数据值。
 *   如：int m = 10; int n = 20; test.swap(); 此时传进去（）的就是10，20。
 *   如果参数是引用数据类型，此时实参赋给形参的是实参存储数据的地址值。// String s1 = "Hi" , String是引用数据类型。
 *
 *
 */

public class ValueTransferTest {
    public static void main(String[] args) {
        ValueTransferTest test = new ValueTransferTest();
        test.swap(8,10);

    }

    //交换数组中指定两个位置元素的值
    public void swap(int m, int n){
        int temp = m;
        m = n;
        n = temp;
        System.out.println(m + ","  + n);
    }

}
