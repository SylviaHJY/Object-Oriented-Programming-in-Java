package StaticKey;

/**
 * 类的成员四：代码块（或初始块）；一个大括号{};
 *
 * 总结：由父及子，静态先行。
 *
 * 1.代码块的作用：用来初始化类、对象
 * 2.代码块如果有修饰的话，只能使用 static.
 * 3.分类：静态代码块 VS 非静态代码块
 *        静态代码块： 内部可以写输出语句、随着类的加载而自动执行，并且只在类的加载的时候只执行一次，没有重写加载就不会执行。
 *                   作用：初始化类的信息。在类中可以定义多个静态代码块。
 *                   如果一个类中定义了多个静态代码块，则按照声明的先后顺序执行。
 *                   静态代码块的执行优先于非静态代码块的执行。
 *                   静态代码块内只能调用静态的属性和方法，不能调用非静态结构。
 *
 *        非静态代码块：内部可以写输出语句、随着对象的创建而自动执行，每创建一个对象就执行一次非静态代码块。
 *                    作用：在创建对象时 对 对象 的属性等进行初始化。
 *                    如果一个类中定义了多个非静态代码块，则按照声明的先后顺序执行。
 *                    非静态代码块内可以调用静态的属性、静态的方法、或非静态的属性，非静态的方法。
 *
 * 属性可以赋值的位置及顺序；1、默认初始化 2、显式初始化/5、在代码块中赋值 3、构造器初始化 4、"对象.属性"或"对象.方法"的方式赋值
 *                      （2、5）顺序在1之后在3之前，2和5谁后写就后执行谁。
 */

public class BlockTest {
    public static void main(String[] args) {
        System.out.println("*************");
        System.out.println("111111111");
        Person p = new Person();
        Person p1 = new Person(); // 每创建一个新的对象，非静态代码块就自动执行一次。
        System.out.println();
        Son s = new Son();
    }
}

class Person{
    String name;
    int age;
    static String desc = "I am a person.";

    public Person(){

    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    //static的代码块
    static{
        System.out.println("Hello, static block!");
        desc = "I like study.";
        info();
    }

    static{
        System.out.println("Hello, static block2!");
    }

    //非static的代码块
    {
        System.out.println("Hello block!");
        info();  //非静态代码块可以调用静态方法和非静态方法。
        eat();
    }

    public void eat(){
        System.out.println("I like Chiness Cuisine.");
    }

    public static void info(){
        System.out.println("I am a happy person!");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}

class Son extends Person{
    static{
        System.out.println("12345678");
    }

    {
        System.out.println("0000");
    }

    {
        System.out.println("1 + 1 = 2");
    }
}
