package StaticKey;

/**
 * 1. final可以用来修饰的结构；类、方法、变量
 *
 * 2. final用来修饰类：该类不能被其他类继承，不能有子类、是"最后一代"；
 *                   比如；String类、System类、StringBuffer类
 *
 * 3. final用来修饰方法：最终版，表明该方法不能被重写；
 *                    比如：Object类中的getClass();
 *
 * 4. final修饰变量：表示是一个常量；
 *                 4.1 final 修饰属性：可以考虑赋值的位置有：显式初始化、在代码块里赋值、在构造器中初始化
 *                                    不可以通过"对象.方法"给final赋值。final在new对象调用方法前就应该有值。
 *
 * 5. final修饰局部变量：一旦被赋值不能进行修改操作；尤其是用final修饰形参时，表明此形参是一个常量。
 *                     当我们调用final修饰的形参的方法时，给常量形参赋一个实参，一旦赋值后，就只能在方法体内使用此形参而不能重新赋值。
 *
 * static final：用来修饰属性(全局常量,尤其在接口中)、
 */
public class FinalTest {
     final int WIDTH = 0; //如果是常量，则字母习惯全部大写；
     final int LEFT; //可以在代码块中初始化；
     final int RIGHT; // 可以在构造器中初始化；

    {
        LEFT = 1;
    }

    public FinalTest(){
        RIGHT = 2;
    }

     public FinalTest(int n ){
        RIGHT = n;
     }


}

final class FinalA{

}
