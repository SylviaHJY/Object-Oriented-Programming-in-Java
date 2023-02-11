package OOPText;

/**
 * 递归方法：一个方法体内调用它自身。
 * 方法的递归包含了一种隐性循环，会重复执行某段代码。递归一定要向已知方向递归。
 * 静态变量前要加static关键字，而实例变量前则不加。
 * （1）实例变量属于某个对象的属性，必须创建了实例对象，其中的实例变量才会被分配空间，才能使用这个实例变量。
 *
 * （2）静态变量不属于某个实例对象，而是属于类，所以也称为类变量，只要程序加载了类的字节码，不用创建任何实例对象，静态变量就会被分配空间，静态变量就可以被使用了。
 *
 * （3）总之，实例变量必须创建对象后才可以通过这个对象来使用，静态变量则可以直接使用类名来引用。
 *
 * 静态变量均有默认值，数字默认为0，布尔值默认为false，对象默认为null
 *
 */

public class Recursion {
    public static void main(String[] args) {
        Recursion test = new Recursion();
        System.out.println( test.f(10));
        System.out.println();
        for(int i = 1; i <= 12; i++){
            System.out.print(Fibonacci(i) + "\t");
        }

    }

    public int getSum(int n ){
        if(n == 1){
            return 1;
        }else{
            return n + getSum(n - 1);
        }
    }

    // 已知有一个数列：f(0) = 1, f(1) = 4, f(n+2) = 2*f(n+1) + f(n), 其中n是大于0的整数，求f(10)的值

    public int f( int n){
        if(n == 0){
            return 1;
        }else if(n == 1){
            return 4;
        }else{
            return 2 * f(n -1) + f(n - 2); // 不能直接return f(n+2) - 2*f(n+1);
            // 比如f(10) = f(12) + 2 * f(11), f(12) =f(14) - 2 * f(13), stack overflow;
            // 将n-2代入，得：f(n) = 2 * f(n -1) + f(n - 2) , 向已知方向　f(0),f(1)求解。
        }
    }

    // 斐波那契数列 Fibonacci的第n个值：1 1 2 3 5 8 13 21 34 55
    // 规律：一个数等于前两个数之和
    // 定义F（n）=F(n-1)+F(n-2)（n≥2，n∈N*），那么我们可以从头到尾进行计算，先计算前面的值，然后逐步算出第n个值。
    public static int Fibonacci(int n){
        if( n == 1 || n == 2){
            return 1;
        }else{
            return Fibonacci(n-1) + Fibonacci(n-2);
        }
    }

    // 快排

}
