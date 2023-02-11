package Constructor;

/**
 * 一、构造器的作用：1.创建对象
 *                2. 初始化对象的属性。如：Person p = new Person("Peter",15)
 *                比如我们规定每个"人"一出生就必须洗澡，我们就可以在"人"的构造器里加入完成"洗澡"的代码，于是每个人一出生就会"洗澡"，
 *                程序就不必再在每个人刚出生时一个个地告诉他们要"洗澡"了。而不是通过 p.shower来让"人"洗澡。
 * 二、1. 如果没有显式的定义类的构造器的话，则系统默认提供一个空参的构造器。如：Person（）
 *    2. 定义构造器的格式：权限修饰符 类名（形参列表）{};
 *    3. 一个类中定义的多个构造器，彼此构成重载。
 *    4. 一旦我们显式的定义了类的构造器后，系统就不再提供默认的空参构造器。
 *    5. 一个类中，至少有一个构造器。
 *
 * 三、属性赋值的先后顺序：
 *     1. 默认初始化值
 *     2. 显式初始化
 *     3. 构造器赋值
 *     4. 通过"对象.方法" 或"对象.属性"的方式赋值。
 */

public class constructor {
    public static void main(String[] args) {
        //创建类的对象：new + 构造器
        Person p1 = new Person(); // Person() 就是构造器。
        // 下面在Person类中将构造器写了出来，当new对象的时候，Person()会被执行。
        p1.eat();
        Person p2= new Person("Tom",18); // p2的name是Tom
        System.out.println(p2.name);


    }
}

class Person{
    String name;
    int age;

    // 构造器
    public Person(){// 与类同名，不要误认为是方法的一种。与方法的格式、功能也不同。

        System.out.println("person().......");
    }

    // 一个类里可以有多个构造器，形参不同，也构成构造器的重载，如：
    public Person(String n,int m){
        name = n; //  构造类的同时赋值name，age
        age = m;
    }

    public void eat(){
        System.out.println(" People eat");
    }

    public void cry(){
        System.out.println("People cry");
    }

    public void study(){
        System.out.println("People study");
    }
}