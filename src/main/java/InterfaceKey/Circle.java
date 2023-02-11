package InterfaceKey;

public class Circle {
    private double radius;
    //可以将属性声明为Double类，Double类实现了compare接口，可以直接比较大小：
    // private Double radius;

    public Circle(){
        super();
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
