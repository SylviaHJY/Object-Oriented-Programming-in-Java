package ThisKeyword;

/**
 * 1.this表示当前对象，可以调用类的属性、方法和构造器（当前正在创建的对象）。
 * 2.this可以用来修饰属性（当前对象）、方法、构造器。
 *
 * 3.在类的方法中，我们可以使用this.属性或者 this.方法的方式调用当前对象属性或方法。但是，通常情况下我们省略"this."。
 *   特殊情况下，如果方法的形参和类的属性同名时，必须显式的使用"this.变量"的方法声明此变量是属性而非形参。
 *
 * 4.在类的构造器中，我们可以使用"this.属性"或者 "this.方法"的方式调用当前正在创建对象的属性或方法。但是，通常情况下我们省略"this."。
 *  *   特殊情况下，如果构造器的形参和类的属性同名时，必须显式的使用"this.变量"的方法声明此变量是属性而非形参。
 *
 *  5.  this调用构造器（ 在构造器中调用另外一个构造器）
 *      1.我们在类的构造器中，可以显式的使用"this(形参列表)"方式，调用类中指定的其他构造器。
 *      2.构造器中不能通过"this(形参列表)"方式调用自己。
 *      3.如果一个类中有n个构造器，最多有n-1个构造器中使用了"this(形参列表)"。
 *      4.规定："this(形参列表)"必须声明在当前构造器的首行。
 *      5.构造器内部，最多只能声明一个"this(形参列表)"，用来调用其他的构造器。
 *
 * 什么时候使用this关键字：
 *    当在方法内需要使用调用该方法的对象时，就用this。
 *    具体的：我们可以用this来区分局部变量和属性。
 *    比如： this.name = name
 */

public class thisKey {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setAge(1);
        System.out.println(p1.getAge());
        System.out.println();

        Person p2 = new Person("Jason",25);
        System.out.println(p2.getAge());
    }
}

class Person{
    private String name;
    private int age;

    public Person(){
         this.eat(); // this表示当前正在创建的对象，调用当前正在创建的对象的eat()方法。一出生就具备eat()方法。
         String info = "Person初始化时，需要考虑如下1，2，3，4...（共40行代码）";
         System.out.println(info);
    }

    public Person(String name){
        this(); //调用空参构造器必须放在第一行，constructor call must be the first statement in a constructor.
        this.name = name; // 形参和属性重名，要加 this。理解为当前正在创建的对象。
    }

    public Person(int age){
        this(); // 调用空参构造器
        this.age = age;
    }

    public Person(String name, int age){
        this(age); // 调用的是public Person(int age)这个构造器。
        this.name = name;
        // this.age = age; 因为调用了this(age)构造器，里面代码定义了this.age = age; 所以这行代码可以注释掉。
    }

    public void setName(String name) {
        this.name = name; // 前面的是属性，后面的是形参。this.XXX,当前对象的XXX。
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void eat(){
        System.out.println("People can eat.");
        this.study();
    }

    public void study(){
        System.out.println("People can study.");
    }
}
