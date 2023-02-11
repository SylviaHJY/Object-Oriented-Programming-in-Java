package Abstract;

/**
 * abstract（抽象的）关键字的使用：
 * abstract可以用来修饰的结构：类、方法(方法体不确定，但是方法的功能是确定的，从方法名体现);
 *
 * 1、abstract修饰类：抽象类
 *                  此类不能实例化。但抽象类中一定有构造器。便于子类实例化可以调用。
 *                  开发中，都会提供抽象类的子类，让子类对象实例化，完成相关的操作。
 *
 * 2、abstract修饰方法：抽象方法：只定义了一种功能的标准，具体的执行需要子类重写实现。
 *                    抽象方法具有方法的声明，没有方法体。
 *                    包含抽象方法的类，一定是抽象类。而抽象类中可以没有抽象方法。
 *                    若子类重写了父类中的所以抽象方法后，此子类方可实例化。(间接父类的抽象方法也需要在子类中重写。)
 *                    若子类没有重写父类中所有抽象方法，此子类需要加abstract。（abstract类可以被继承。）
 *
 *
 * 3、abstract使用的注意点：
 *    3.1 abstract不能用来修饰：属性、构造器等结构。
 *    3.2 abstract不能用来修饰私有方法。子类不能重写父类中声明为private的方法。
 *    3.3 abstract不能用来修饰静态方法。子类和父类中的同名同参的方法要么都声明为非static（重写的必须是非static的）。
 *    3.4 abstract不能用来修饰final方法，以及final的类，子类不能重写final方法。
 *
 * 4、抽象类和接口：
 *      4.1 共同点：都不可以被实例化；都可以被继承，接口继承接口；
 *      4.2 不同点：abstract类有构造器，接口没有构造器。
 *                 抽象类单继承性，接口有多继承性。
 *                 抽象类有时没有抽象方法，但接口一般都是有抽象方法，通过实现类的重写实现不同的功能。
 *
 * 5、抽象类可以实现接口。抽象类可以继承非抽象的类。（没有明确指明父类那父类就是Object);
 */

public class AbstractTest {
}

abstract class Creature{
    //抽象方法：
    public abstract void breath();
}

abstract class Person extends Creature{ //abstract修饰类，该类不可实例化。
    String name;
    int age;

    public Person(){

    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    //抽象方法：
    public abstract void walk();


    public void eat(){
        System.out.println("Eat!");
    }

}

class Student extends Person{

    public Student(String name,int age){
        super(name,age);  // 虽然抽象类不能造对象，但是抽象类也有构造器，子类可以调用父类的构造器。
    }

    @Override
    public void walk() {
        System.out.println("Students need more protein food.");
    }

    //间接父类的抽象方法也需要在子类中重写。
    @Override
    public void breath() {
        System.out.println("Student need more fresh air.");
    }
}
