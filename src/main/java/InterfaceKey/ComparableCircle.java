package InterfaceKey;

public class ComparableCircle extends Circle implements CompareObject {

    public ComparableCircle(double radius){
        super(radius); // 父类未提供空参构造器，调用父类中调用了空参参构造器的构造器。
    }

    @Override
    public int compareTo(Object o) {
        if(this == o){
            return 0;
        }
        if(o instanceof ComparableCircle){
            ComparableCircle c = (ComparableCircle) o;
            // 错误写法：
             //return (int) (this.getRadius() - c.getRadius()); radius是double型，转成int精度损失判断失误，如：2.3-2.1返回0；
            // 正确写法方式一：
            if(this.getRadius() > c.getRadius()){
                return 1;
            }else if(this.getRadius() < c.getRadius()){
                return -1;
            }else{
                return 0;
            }
        }else{
            throw new RuntimeException("Illegal input!");
        }
        // 正确写法方式二：
        // 若radius声明为 Double 包装类，可以调用包装类的方法，Double包装类实现了compare接口：
        // return this.getRadius().compareTo(c.getRadius());
    }
}
