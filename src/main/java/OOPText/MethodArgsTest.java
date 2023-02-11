package OOPText;

/**
 *  可变形参
 *  具体使用：1. 可变个数形参格式：数据类型...变量名
 *          2. 当调用可变个数形参的方法时，传入的参数个数可以是：0个，1个，2个...或多个。
 *          3. 可变个数形参的方法与本类中方法名相同，形参不同的方法之间构成重载。
 *          4. 可变形参的方法与本类中方法名相同，形参类型也相同的 数组 之间不构成重载。二者不能共存。
 *          5. 可变个数形参在方法的形参中，必须声明在末尾：public void show(int i, String ...strs);两个形参位置对调则出错。
 *          6. 可变个数形参在方法的形参中，最多只能声明一个可变形参。
 */
public class MethodArgsTest {
    public static void main(String[] args) {
        MethodArgsTest test = new MethodArgsTest();
        test.show(12);
        test.show("Hello");
        test.show("a","b","c");
        test.show(new String[]{"AA","BB","CC"}); // 调用的时候仍可以像数组调用一样新建一个数组
    }

    public void show(int i ){
        System.out.println(i);
    }

    public void show(String S){
        System.out.println("show(String)");
    }

    public void show(String...strs){ //表示输入strs数组，相当于把原来的[]换成...三个点。调用的时候就是调用数组。
        System.out.println("show(String...strs");

        for(int i = 0; i < strs.length; i++){
            System.out.print(strs[i] + "\t"); // \t表示空格
        }
    }

    //上面的表达式也可以这样写，改写成数组格式：
    // public void sho(String[] strs){ }

}
