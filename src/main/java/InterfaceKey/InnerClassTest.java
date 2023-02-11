package InterfaceKey;

/**
 * 1. 类的内部成员五：内部类inner class;
 *   Java中允许将一个类A声明在另一个类B中，则A就是内部类，类B称为外部类；
 *
 * 2. 内部类的分类：成员内部类(静态、非静态） VS 局部内部类（方法内、代码块内、构造器内）；
 *
 * 3. 成员内部类：
 *        作为类的内部成员：
 *             1.调用外部类的结构；
 *             2.可以被static修饰；
 *             3.外部类的权限修饰符是public或者默认，内部类可以被四种不同的权限修饰符修饰。
 *
 *        作为一个类：
 *           1.类内可以定义属性、方法、构造器等；
 *           2.可以被final修饰，表示此类不能被继承；不用final就可以被继承；
 *           3.可以被abstract修饰；
 *
 * 4. 关注如下3个问题：
 *    4.1 如何实例化成员内部类的对象；
 *    4.2 如何在成员内部类中区分调用外部类的结构；
 *    4.3 开发中局部内部类的使用；
 *    4.4 在局部内部类的方法中，如果调用局部内部类所声明的方法中的局部变量，要求此局部变量声明为final(省略final）。比如number。
 *
 * 总结：成员内部类和局部内部类，在编译后，都会生成字节码文件。
 *      格式：成员内部类：外部类$内部类名.class;
 *           局部内部类：外部类$数字 内部类名.class;
 *
 */
public class InnerClassTest {
    public static void main(String[] args) {

        //创建内部类大脑（静态的成员内部类）的实例：
        Person.Brain brain = new Person.Brain();
        brain.Thinking();

        //创建非静态的成员内部类（abc)的实例,非静态的内部类需要先创建外部类的实例，再通过外部类实例的调用创建内部类的实例：
        Person p = new Person();
        Person.abc abc1 = p.new abc();
        abc1.sing();
        System.out.println();

        abc1.display("display");


    }
}

class Person{
    String name = "Alicia";
    int age;

    public void eat(){
        System.out.println("EAT");
    }

    //构造器内部类：
    public Person(){
        class CC{

        }
    }

    public void method(){
        //方法体局部内部类：
        class AA{
            String name;
            int number;
        }
    }

    //代码块的局部内部类：
    {
        class BB{

        }
    }

    //静态成员内部类：
    abstract static class ABC{
        String name = "ABC";
        int age;

        public void show(){
            System.out.println("Learn ABC.");
        }
    }

    static class Brain{
        public void Thinking(){
            System.out.println("Logical thinking, critical thinking.");
        }
    }

    //非静态成员内部类：
    class abc{

        String name = "abc";

        public abc(){

        }

        public void sing(){
            System.out.println("Now I know my abc.");
            eat(); //可以调用外部类的方法；// 完整调用：Person.this.eat();
        }

        public void display(String name){
            //调用重名属性：
            System.out.println(name); //方法的形参；
            System.out.println(this.name); //内部类的属性；
            System.out.println(Person.this.name); //外部类的属性；
        }


    }

}

