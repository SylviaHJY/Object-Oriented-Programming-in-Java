package AnonymousObject;

/**
 * 抽象类的匿名子类：
 *
 */

public class NiMingClass {
    public static void main(String[] args) {
        //创建一个匿名子类的对象；不是Person的子类，Person不能创建子类；名字是p：
        Person p = new Person() {
            @Override
            public void walk() {
                System.out.println("Person walk.");
            }  //重写父类的方法。

            @Override
            public void eat() {
                System.out.println("Person eat.");
            }
        };

        method(p); //在同一个类，静态方法(main方法体)里调用静态方法，不用创建对象，也不用"类.方法"，直接调用。
        //静态方法调用静态方法，方法里调用方法也不用创建对象。

        //创建匿名子类的匿名对象：
        method(new Person() {
            @Override
            public void walk() {
                System.out.println("I can walk.");
            }

            @Override
            public void eat() {
                System.out.println("I can eat.");
            }
        });

    }

    public static void method(Person p){
        p.eat();
        p.walk();
    }
}

abstract class Person{
    String name;
    int age;

    public Person() {

    }

    public abstract void walk();

    public abstract void eat();



}
