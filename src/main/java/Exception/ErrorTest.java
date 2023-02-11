package Exception;

/**
 * 一、异常体系结构：
 * java.lang.Throwable
 *
 * Error: Java虚拟机无法解决的严重问题。如：JVM系统内部错误、资源耗尽等严重情况。如：StackOverflowError和OOM，
 *        一般不编写针对性的代码进行处理。
 *
 * Exception: 其他因编程错误或偶然的外在因素导致的一般性问题，可以使用针对性的代码进行处理。例如：
 *            空指针访问；
 *            试图读取不存在的文件；
 *            网络连接中断；
 *            数组角标越界；
 *
 * Exception异常：编译时异常（checked）：IOException, FileNotFoundException, ClassNotFoundException
 *               unchecked运行时异常(RunTImeException)：NullPointerException, ArrayIndexOutOfBoundsException,
 *               ClassCastException, NumberFormatException, InputMismatchException, ArithmeticException
 *
 */

public class ErrorTest {
    public static void main(String[] args) {
        main(args); // 递归容易出现栈溢出；java.lang.StackOverflowError

        Integer[] arr = new Integer[1024 * 1024 * 1024]; // OutOfMemoryError; OOM; 堆溢出；

        //出现以上错误需要自己更改代码。
    }
}
