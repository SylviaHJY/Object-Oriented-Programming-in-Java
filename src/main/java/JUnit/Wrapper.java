package JUnit;

/**
 * Java提供了8种基本数据类型对应的包装类，使得基本数据类型的变量具有类的特征，引入包装类。
 *
 * 基本数据类型                    包装类
 * byte                           Byte
 * short                          Short
 * int                            Integer         数值型的父类是 Number
 * long                           Long
 * float                          Float
 * double                         Double
 * boolean                        Boolean
 * char                           Character
 *
 * 基本类型、包装类和String类间的转换
 *
 * 自动装箱与自动拆箱
 * 自动装箱：int num = 10; Integer in1 = num; 看上去像把一个基本数据类型赋值给类，实际上是Integer in1 = new Integer(10); 自动装箱。
 *          boolean b1 = true; Boolean b2 = b1;
 *
 * 自动拆箱：int num1 = in1; 直接把包装类赋给基本数据类型
 * Integer i=10; 自动装箱；//如果i的值大于-128小于127则返回一个缓冲区(常量池)中的已经初始化后Integer对象。
 *
 * Integer c = 11;
 * int d = c;  //自动拆箱
 *
 *
 * Integer内部定义了IntegerCache结构，IntegerCache中定义了integer[], 保存了从-128～127的整数。如果我们使用自动装箱的方式，给Integer
 * 赋值的范围在-128～127范围内时，可以直接使用数组中的元素，不用再去new了。主要目的提高效率。
 *
 * 包装类应用场景举例：Vector类中添加元素，只定义了形参为Object类型的方法：
 *                  v.addElement(Object obj); // obj必须是对象实例。基本数据类型-----包装类------使用多态
 */

public class Wrapper {
    //基本数据类型------包装类:调用包装类的构造器
    public void test1(){
        int num1 = 10;
        Integer int1 = Integer.valueOf(num1);
        System.out.println(int1.toString());
        System.out.println(int1 + 10);

        String s1 = "123";
        Integer int2 = Integer.valueOf(s1);
        System.out.println(int2.toString());

        Float f1 = Float.valueOf(15.3f); //把15.3的数据类型转成 Float
        System.out.println(f1.toString());

        Boolean b1 = Boolean.valueOf("TruE");
        System.out.println(b1); //忽略大小写，只要字母和 true一样就返回true。
        Boolean b2 = Boolean.valueOf("true123"); // 进行了优化，类型和布尔类型不一致返回false。
        System.out.println(b2);

        Order o1 = new Order();
        System.out.println(o1.isMale); //没有赋值，默认值是false.
        System.out.println(o1.isFemale); // null, 此时是个Boolean类。
    }

    //包装类---------基本数据类型：调用包装类的XXXValue();
    public void test2(){
        Integer int1 = 10;
        int i1 = int1.intValue();
        System.out.println(i1 + 1);
        System.out.println(int1 + 1);

        Float f = 12.3f;
        float f1 = f.floatValue();
        System.out.println(f.toString());
        System.out.println(f1);

        Double d1 = 12.6;
        String str = String.valueOf(d1);
        System.out.println(str);
        System.out.println("Hello world!");
    }

    //基本数据类型、包装类-------- String类，调用String重载的valueOf(XXX XXX)
    public void test3(){
        int num = 12;
        //方式一；做连接运算：
        String str1 = num + " ";
        //方式二：valueOf()
        float f1 = 33.6f;
        String str2 = String.valueOf(f1);
    }

    //String类-------------基本数据类型、包装类,调用包装类的parseXxx();
    //注意：转换时，可能会报NumberFormatException异常。
    public void test4(){
        String str1 = "12345";
        int int1 = Integer.parseInt(str1);
        System.out.println(int1 + 20);

        String str2 = "true1";
        boolean b1 = Boolean.parseBoolean(str2);
        System.out.println(b1);
    }

    public void test5(){
       // Object o1 = true ? new Integer(1) : new Double (3.0) ;
       // System.out.println(o1);打印值：1。0；自动类型提升成double
        Integer i = Integer.valueOf(1);
        Integer j = Integer.valueOf(1);
        System.out.println(i == j); // true;

        Integer m = 1;
        Integer n = 1;
        System.out.println(m == n); // true;    // IntegerCache结构缓存从-128到127的Integer数组。
        // 方便使用，使用自动装箱时在这个范围的数从数组里取。取一样的数地址值一样。

        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y); // false; // 数组值从-128到127。没有128。
        //如果i的值大于-128小于127则返回一个缓冲区(常量池)中的已经初始化后Integer对象。
    }
}

class Order{
    boolean isMale;
    Boolean isFemale;
}
