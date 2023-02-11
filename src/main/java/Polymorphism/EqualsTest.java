package Polymorphism;

import java.util.Objects;

/**
 * 面试题：== 和 equals的区别
 * 一、 == : 运算符
 *     1、可以使用在基本数据类型变量和引用数据类型变量中
 *     举例：int i = 10; double d = 10.0; char c = 10;  i == d == c -----True; 值相等，与数据类型无关
 *          char c1 = 'A'; char c2 = 65; c1 == c2 -------True; 字母A的二次码就是65。
 *     2、如果比较的是基本数据类型变量，比较两个变量保存的数据是否相等，不一定数据类型要相同。
 *        如果比较的是引用数据类型变量，比较的是两个对象的地址值是否相同，即两个引用是否指向同一个对象实体。
 *        举例：Sub S = new Sub(); Base b = S; // 多态性； b == S ------True;
 *            ==，对于引用数据类型来讲，比较的是两个引用数据类型变量的地址值是否相同。
 *
 * 二、 equals()方法的使用：
 *     1、是一个方法，而非运算符，只适用于引用数据类型，基本数据类型不适用。
 *     2、Object类中equals()的定义：
 *        public boolean equals(Object obj){
 *            return (this == obj);
 *        }
 *        说明：Object类中定义的equals()和==的作用是相同的，比较的是两个对象的地址值是否相同。
 *
 *    3、像 String、Date、File、包装类都重写了Object类中equals()的方法。重写以后，比较的不是两个引用的地址值是否相同，
 *       比较两个对象的"实体内容"是否相同，即存储的值是否相同。
 *
 * 三、通常情况下，自定义类如果使用equals()的话，也通常是想比较两个对象的"实体内容"是否相同，需要重写对Object类的equals进行重写。
 *    比较两个对象的属性。右键Generate----override method-----equals()重写 equals方法。
 *
 *    重写equals()方法的原则：
 *    对称性：如果x.equals(y)返回是"true", 那么y.equals(X)也应该返回是"true"。
 *    自反性： x.equals(x)必须返回是true。
 *    传递性：如果x.equals(y)返回是"true"，而且y.equals(z)返回也是true，那么z.equals(x)也应该返回true。
 *    一致性：如果x.equals(y)返回是"true"，只要x和y内容一直不变，不管重复x.equals(y)多少次，返回都是true。
 *    任何情况下，x.equals(null),永远返回是"false"；x.equals(和x不同类型的对象)永远返回是"false"。
 *
 */

public class EqualsTest {
    public static void main(String[] args) {
        Customer cust1 = new Customer("Tom",21);
        Customer cust2 = new Customer("Tom",21);
        System.out.println(cust1.equals(cust2)); //没改写前是false，两个对象储存的地址值不同，改写后是true,比较的是储存的内容是否相同。

        String str1 = new String("offer");
        String str2 = new String("offer");
        System.out.println(str1.equals(str2)); //true
        // 但是str1 == str2返回false, ==对于引用类型永远比的是地址。

    }
}

class Customer{
    private String name;
    private int age;

    public Customer(){

    }

    public Customer(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o; //不转成user对象没办法调用user自己定义的属性。
        return age == customer.age && Objects.equals(name, customer.name);
        // 错误的：
        // return age == customer.age && this.name == customer.name; == 是比较地址值，当写成new String(name)的时候会出错。
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
