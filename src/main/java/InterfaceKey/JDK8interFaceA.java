package InterfaceKey;

/**
 * JDK8: 除了定义全局常量和抽象方法之外，还可以定义静态方法，默认方法。
 * 静态方法：使用static关键字修饰，可以通过接口直接调用静态方法，并执行其方法体。
 * 默认方法：默认方法用default关键字修饰，可以通过实现类对象来调用。JAVA8 API中对Collection, List, Comparator等接口提供了丰富的默认方法；
 */

public interface JDK8interFaceA {
    //静态方法：
    public static void method1(){
        System.out.println("CompareA: BeiJing");
    }

    //默认方法：

    public default void method2(){
        System.out.println("CompareB: ShangHai");
    }

    default void method3(){  //省略了public, 但是权限还是public的；
        System.out.println("CompareC: ShenZhen");

    }
}
