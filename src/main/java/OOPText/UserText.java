package OOPText;
/**  类中属性的使用
 * 属性（成员变量）vs 局部变量 // 对应类中的成员变量，Field = 属性 = 域/字段 = 成员变量，Method = （成员方法）= 函数
 * 1.相同点：
 *  1.1 定义变量的格式：数据类型 变量名 = 变量值
 *  1.2 先声明，后使用
 *  1.3 变量都有其对应的作用域
 *
 * 2.不同点：
 *   2.1 在类中声明的位置不同
 *   属性：直接定义在类的一对 {} 内;
 *   局部变量：声明在方法内、方法形参、代码块内、构造器形参、构造器内部的变量;
 *
 *   2.2 权限修饰符的不同
 *   属性：可以在声明属性时，指明其权限，使用权限修饰符；
 *   常用的权限修饰符：　private、public、缺省、protected-----> 封装性
 *   局部变量：不可以使用权限修饰符：方法已经声明权限
 *
 *   2.3  默认初始化值的情况
 *   属性：类的属性，根据其类型，都有默认初始化值；
 *     整形（byte、short、int、long):0;
 *     浮点型（float、double):0.0
 *     字符型（ chart）：0（或'\u0000')
 *     布尔型（ boolean): false
 *     引用数据类型（类、数组、接口）：null
 *
 *   局部变量： 没有默认初始化值，在调用之前一定要赋值，形参在调用之前要传参。
 *
 *   2.4 在内存中加载的位置：
 *   属性：加载到堆空间中（非static）
 *   局部变量：加载到栈空间
 *
 *
 */

public class UserText {
    public static void main(String[] args) {
        User u1 = new User();
        u1.name = "Leona";
        u1.age = 20;
        u1.nationality = "America";
        u1.isMale = false;
        u1.talk("English,Chinese,Cantonese");
        u1.eat();
        u1.hobbies("RoadTrip,YouTube,Snowboarding");
        u1.sleep(8);
        System.out.println(u1.getName());
        System.out.println(u1.getGender("Female"));

    }
}

class User{
    //属性（或成员变量）
    String name;
    String nationality;
    int age;
    boolean isMale;

    /** 类中方法的声明和使用
     * 方法：描述类应该具有的功能
     * 比如：Math类：sqrt()\random()...
     *      Scanner类，nextXX()...
     *      Array类：sort()\ binarySearch()\ toString() \ equals() \ ....
     *
     * 1. 举例：
     *  public void eat(){} // void没有返回值
     *  public void hobbies(String hobbies){}
     *  public String getName(){} // String表示返回了字符串
     *  public String getGender(String gender){}
     *
     * 2. 方法的声明：权限修饰符，返回值类型，方法名（形参，可不止一个）{
     *      方法体
     * }
     *
     * 3. 返回值类型：有返回值 vs 没有返回值
     *   3.1 如果有返回值，必须在方法声明时，指定返回值的类型；同时方法中需要使用return关键字来返回指定类型的变量或常量。
     *   3.2 如果方法没有返回值，则方法声明时，使用void来表示。
     *   3.3 定义方法时是否有返回值？看题目要求，或凭经验
     *   3.4 方法名：属于标识符，遵循标识符的规则和规范
     *   3.5 形参列表：方法可以声明0个，1个或多个形参；格式：数据类型1 形参1，数据类型2 形参2，...
     *
     * 4.方法体
     *
     * 5.  return 关键字的使用：
     *     1.使用范围：使用在方法体中
     *     2.作用：1）结束方法
     *            2）针对有返回值类型的方法：return 数据 ， 返回所要的数据。return关键字后面不可以声明执行语句。
     *
     * 6. 方法的使用：可以调用当前类的属性，也可以调用当前类中的方法。特殊的：方法A中又调用方法A，递归。
     *              一个方法里不可以定义其他方法。
     */

    public void talk(String language){ //language：形参
        System.out.println("languages:" + language);

    }

    public void eat(){
        String Food = "Pizza"; //局部变量
        System.out.println("People from Western countries like to eat :" + Food);
    }

    public void hobbies(String hobbies){
        System.out.println(name + " likes to do: " + hobbies + " in leisure time ");

    }

    public void sleep(int hours){
        System.out.println("Sleep for " + hours + " hours");
        eat(); // 方法中再调用当前类的方法
    }

    public String getName(){

        return name;
    }

    public String getGender(String gender){
        String Gender1 = name + " gender is : " + gender;
        return Gender1;
    }
}