package Exception;

/**
 * try-catch-finally中finally的使用：
 * 1、finally可选的；
 *
 * 2、finally中声明的是一定会被声明的代码，即使catch中又出现异常，或try中有return语句，或catch中有return语句。
 *
 * 3、像数据库连接、输入输出流、网络编程Socket等资源，JVM是不能自动回收的，需要程序员手动的进行资源的释放。此时的资源释放，就声明在finally中。
 *
 * 4、try-catch-finally结构可以相互嵌套；
 *
 * 5、对于运行时异常，一般不用try-catch-finally，针对编译时异常，我们说一定要考虑异常的处理。
 */

public class FinallyTest {
    public void test1(){
        try{
            int a = 10;
            int b = 0;
            System.out.println(a / b);
        }catch(ArithmeticException e){
           // e.printStackTrace();
            //假若在catch语句中输入了有异常的代码，程序退出，如写了finally语句，执行finally：
             int[] arr = new int[10];
            System.out.println(arr[10]);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Divided cannot be 0");
        }

    }

    public int method() { //方法有返回值，除了在try里要写return语句，catch里也要写，没有异常返回try里的return值，有异常返回catch里的。
        try {
            int[] arr = new int[10];
            System.out.println(arr[10]);
            return 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            return 2;
        } finally { //先执行finally里的语句，再执行try或者catch里的。
            System.out.println("Finally");
        }

    }
}
