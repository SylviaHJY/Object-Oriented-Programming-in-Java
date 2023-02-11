package Exception;

/**
 * 一、手动抛出异常：throw
 *
 * 二、用户自定义异常类：
 *     1、如何自定义异常类：1、继承于现有的异常结构：RuntimeException、Exception
 *     2、提供全局常量：serialVersionUID
 *     3、提供重载的构造器。
 */

public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
        try { //然后在调用的时候加try-catch-finally处理异常；
            s.register(-1001);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}

class Student{
    private int id;

    public void register(int id) throws Exception { // throw new MyException()可以不用写throws Exception继承的父类不是它；
        if(id > 0){
            this.id = id;
        }else{
            //手动抛出异常new一个异常对象：
            // throw new RuntimeException("Illegal input!");

            //手动抛出异常另一种写法：
            //throw new Exception("Illegal input!"); //抛出的是Exception编译时异常，此时方法要加throws Exception;

            //手动抛出用户自定义异常：
            throw new MyException("ID cannot be negative number.");
        }
    }
}

class MyException extends RuntimeException{

    static final long serialVersionUID = -7034897190745766939L;

    public void MyException(){

    }

    public MyException(String msg){
        super(msg); //  调用父类的getMessage()方法；
    }


}