package Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 异常处理的方式二： throws + 异常类型；
 * 举例：public void method() throws FileNotFoundException, IOException{方法体};
 *
 * 1、"throws + 异常类型"写在方法的声明处，致命在方法执行时，可能会抛出的异常类型；
 *    一旦方法体执行时，出现异常，仍会在异常代码处生成一个异常类的对象，此对象满足throws后异常类型时，就会被抛出。
 *    异常代码后续的代码，就不再执行！没有finally。
 *
 * 2、体会：try-catch-finally：真正的将异常处理了；
 *         throws方式只是将异常抛给了方法的调用者，并没有真正将异常处理掉。
 *
 * 3、开发中如何选择使用try-catch-finally还是throws？
 *    3.1 如果父类中被重写的方法没有throws方式处理异常，则子类重写的方法也不能用throws。意味着如果子类重写的方法中有异常，
 *        必须使用try-catch-finally方式处理。
 *    3.2 执行的方法中，先后又调用了另外的几个方法，这几个方法是递进关系执行的，建议这几个方法使用throws的方式进行处理，而执行的方法a可以考虑
 *        用try-catch-finally方式进行处理。
 *
 * 4、throw 和 throws的区别：
 *    throw 表示抛出一个异常类的对象，生成异常对象的过程，声明在方法体内；
 *    throws 属于异常处理的一种方式，声明在方法的声明处。
 *
 *
 */
public class throwsTest {

    public static void main(String[] args) { //抛到main方法的时候需要解决一下，不然再抛到处理机JVM，JVM容易崩；
         try{
             method2();   //method1, method2写了两个异常类型，catch也要写两个，且子类在前父类在后；
         }catch (FileNotFoundException e){
             e.getStackTrace();
         }catch (IOException e){
             e.getStackTrace();
         }
    }

    public static void method2() throws FileNotFoundException,IOException{
        method1(); //method2觉得还是搞不定method1的异常，还是往上抛出异常；
    }

    public static void method1() throws FileNotFoundException, IOException{ //向上抛出异常；
        File file = new File("hello.txt");
        FileInputStream fis = new FileInputStream(file);

        int data = fis.read();
        while(data != -1){
            System.out.println((char)data);
            data = fis.read();
        }
        fis.close(); //IO流需要手动关闭。
    }

}
