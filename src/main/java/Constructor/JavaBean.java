package Constructor;

/**
 * JavaBean是一种 Java语言写成的可重用组件。
 * JavaBean是符合如下标准的Java类：
 *    1. 类是公共的
 *    2. 有一个无参的公共的构造器
 *    3. 有属性，且有对应的get,set方法。
 */

// 下面是一个 JavaBean：
public class JavaBean {

    private String id;
    private String name;

    public JavaBean(){

    }

    public void setId(String n){
        id = n;
    }

    public void setName(String m){
        name = m;
    }
}
