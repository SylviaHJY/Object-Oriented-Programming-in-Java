package Exception;

/**
 * 异常处理机制一：
 *      方式一：try-catch-finally；
 *      try{
 *          // 可能出现异常的代码
 *      }catch(异常类型1 变量名1）{
 *          //处理异常的方式1
 *      }catch(异常类型2 变量名2）{
 *          //处理异常的方式2
 *      }
 *      ......可以写多个catch匹配不同的情况
 *      finally{  //可选的；可以写也可以不写，类似于default在switch中的作用；
 *          //一定会执行的代码
 *      }
 *
 *
 *      方式二：throws + 异常类型；
 *
 * "抓抛模型：：过程一："抛"：程序在正常执行过程中，一旦出现异常，就会在异常代码处生成一个对应异常类的对象，并将此对象抛出。
 *                   一旦抛出，其后的代码就不再执行。
 *
 *             关于异常对象的产生：1、系统自动生成的异常对象
 *                              2、手动的生成一个异常对象，并抛出（throw）。
 *
 *            过程二："抓"：理解为异常处理方式：try-catch-finally，throws + 异常类型
 *
 * 说明：1、使用try模型将可能出现异常代码包装起来，一旦出现异常，就会成一个对应异常类的对象，根据此对象的类型，去catch中进行匹配；
 *      一旦try中的异常对象匹配到一个catch时，就进入catch中进行异常的处理，一旦处理完成，就跳出当前的try-catch结构（无finally）；
 *      继续执行其后的代码。
 *
 *      2、在if-else中，范围小的写前面，范围大的写后面（否则按顺序执行完大的，小的范围进不去）；
 *         catch中的异常类型，如没有子父类关系，则声明顺序不影响；
 *                          如有子父关系，则要求子类一定声明在父类上面，否则报错unreachable。
 *
 *      3、常用的异常对象处理的方式：
 *         3.1 String getMessage();  System.out.println(e.getMessage());
 *         3.2 e.printStackTrace(); //常用
 *
 *      4、在try结构中声明的变量，在出了try结构以后，就不能在被调用，通常在try结构外面声明变量，可以先赋值为0；
 *
 *      5、体会：try-catch-finally处理编译异常时，使得程序编译时不再报错，但是运行时仍可能报错。
 *         相当于将一个编译时可能出现的异常延迟到运行时出现。
 *
 *      6、开发中，由于运行时异常比较常见，通常不针对运行时异常编写try-catch-finally了。
 *         针对编译时异常，我们说一定要考虑异常的处理。
 *
 *         编译时异常（checked）：IOException, FileNotFoundException, ClassNotFoundException
 *
 *  *               unchecked运行时异常(RunTImeException)：NullPointerException, ArrayIndexOutOfBoundsException,
 *  *               ClassCastException, NumberFormatException, InputMismatchException, ArithmeticException
 *
 *                 catch(运行时异常的以及其他上述类型 e){e.getStackTrace()};
 *
 *
 *       编译时异常：执行javac.exe命名时，可能出现的异常；
 *
 *       运行时异常：执行java.exe命名时，可能出现的异常；
 *
 *
 */

public class ExceptionTest {
    public void test1(){
        String str = "123";
        str = "abc";
        try{
            int num = Integer.parseInt(str);
            System.out.println("hello---------1");
        }catch (NumberFormatException e){
            // System.out.println("NumberFormatException");
            // 处理方法：String getMessage(); 打印出现异常的地方
           // System.out.println(e.getMessage()); //输出For input string: "abc"
            // printStackTrace():
            e.printStackTrace(); // 包含了For input string: "abc"

        }catch(NullPointerException e){
            System.out.println("NullPointerException");
        }
        System.out.println("hello---------2");
    }
}
