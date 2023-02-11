package Polymorphism;



/**
 * 1.当我们输出一个对象的引用时，实际上就是调用当前对象的toString();
 *
 * 2.Object类中toString()的定义：
 *   public String toString(){
 *       return getClass().getName() + "@" + Integer.toHexString(hashCode());
 *   }
 *
 *  3. String、Date、File、Array、包括类等都重写了Object类中的toString()方法。
 *     使得在调用对象的toString()时，返回"实体内容"信息。
 *     如果s = null; System.out.println(S)输出null; 但如果System.out.println(s.toString())显式调用会出现空指针异常。
 *
 * 4. 自定义类也可以重写toString()时，当调用此方法时，返回"实体内容"信息。
 *    如果需要打印出类的信息，重写toString的方法。
 *    右键Generate---toString()重写方法
 */

public class ToString {
    public static void main(String[] args) {
        Person p1 = new Person("Tom",21);
        System.out.println(p1.toString()); // 输出的是地址值
        System.out.println(p1); // 输出的是地址值

         String str = new String("MM");
        System.out.println(str); // MM , String 重写了toString方法
    }
}
