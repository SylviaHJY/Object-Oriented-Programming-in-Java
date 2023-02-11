package OOPText;

/** 方法的重载（overload) loading...
 * 1. 定义：在同一个类中， 允许存在一个以上的同名方法，只要它们的参数个数或者参数类型不同即可。
 *    " 两同一不同"：同一个类、相同方法名
 *                 参数列表不同、参数个数不同、参数类型不同
 *2. 举例：Arrays类中重载的sort()/binarySearch() 同名的方法，但是形参不同。（形参一样但前后顺序不同也算重载）
 *
 * 3. 判断是否是重载：
 *      跟方法的权限修饰符（public、private)、返回值类型、形参变量名、方法体都没有关系！
 *
 * 4. 再通过对象调方法时，如何指定某一个指定的方法：
 *        方法名----> 参数列表
 *
 * 5. 方法的重载和重写：重写(Override)与重载(Overload)
 * 重写是子类对父类的允许访问的方法的实现过程进行重新编写！返回值和形参都不能改变。即外壳不变，核心重写！
 *
 * 重写的好处在于子类可以根据需要，定义特定于自己的行为。
 *
 * 也就是说子类能够根据需要实现父类的方法。
 *
 * 在面向对象原则里，重写意味着可以重写任何现有方法。
 */
public class OverLoad {
    public  void getSum(int i, int j){

        System.out.println(i + j);
    }

    public  void getSum(double i, double j){

        System.out.println(i + j);
    }

    public  void getSum(String i, int j){

        System.out.println(i + j);
    }
    // 这两个同名方法的形参都是String i, int j, 但是前后顺序不同。也构成overload.
    public  void getSum(int j, String i){

        System.out.println(i + j);
    }

    // 如下三个方法构成重载
    public int max(int i , int j){
        return (i > j)? i : j;
    }

    public double max(double i , double j){
        return (i > j)? i : j;
    }

    public double max(double i , double j, double r){
        double max = (i > j)? i : j;
        return (max > r)? max : r;
    }

}

