package InterfaceKey;

public class JDK8Test {
    public static void main(String[] args) {
        JDK j = new JDK();
        // j.method1; 调用不出来，实现类的对象拿不到接口的静态方法；
        // JDK.method1; 调不出来，实现类拿不到接口的静态方法；
        // 知识点1：接口中定义的静态方法，只能通过接口来调用。
        JDK8interFaceA.method1(); // 接口调用静态方法；

        //知识点2：通过实现类的对象，可以调用接口中的默认方法：
        //如果实现类重写了接口中的默认方法，调用时，仍然调用的是重写后的方法；
        j.method2();
        //知识点3：如果子类（实现类）继承的父类和接口中声明了同名同参的默认方法，子类在没有重写该方法的情况下，
        // 默认调用的是父类中同名同参的方法。
        //（方法）类优先原则：(多个接口中有同名同参的方法，但子类没有重写父类的同名同参方法，默认调用父类的)
        j.method3();

        //知识点4：如果实现类没有继承父类，实现类的多个接口中有同名同参的默认方法，
        // 在没有重写此方法的情况下，报错----接口冲突；重写就意味着多个同名同参的方法一起被重写。
        //重写后调用的就是重写后的方法。

        //知识点5：在子类（或实现类）的方法中调用父类、接口中重写的方法：
        // 调用父类：super.方法名();
        // 调用接口：接口.super.方法名();
        System.out.println("******************");
        j.method3();
    }
}

class JDK extends JDKSuperClass implements JDK8interFaceA,JDK8interFaceB {

    public void method2(){
        System.out.println("JDK");
    }

    @Override
    public void method3() {
        super.method3(); //调用父类声明的方法；
        JDK8interFaceA.super.method3(); // 调用接口中声明的默认方法；
        JDK8interFaceB.super.method3();
        JDK8interFaceA.super.method2();
    }
}