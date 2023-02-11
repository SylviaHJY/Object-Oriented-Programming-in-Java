package Polymorphism;

import java.util.Objects;

public class ObjectTest {
    public static void main(String[] args) {
        Circle1 c1 = new Circle1(2.3);
        Circle1 c2 = new Circle1(3.3,"white",1.0);

        System.out.println("颜色是否相等：" + c1.getColor().equals(c2.getColor())); //比的是内容，String类型。
        System.out.println("半径是否相等：" + c1.equals(c2)); // 重写了equals方法。
        System.out.println(c1.toString());
        System.out.println(c2);
    }

}

class Geometric{
    protected String color;
    protected double weight;
    public Geometric(){
        super();
        this.color ="white";
        this.weight = 1.0;
    }

    public Geometric(String color, double weight) {
        super();
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}

class Circle1 extends Geometric{
    private double radius;
    public Circle1(){
        super(); //父类空参构造器已经初始化了color和weight，所以一调用就有。
        radius = 1.0;
    }

    public Circle1(double radius){
        super();
        this.radius = radius;
    }

    public Circle1(double radius, String color, double weight){
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea1(){
        return Math.PI * radius * radius;
    }

    //比较两个圆的半径是否相等：
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle1 circle1 = (Circle1) o;
        return Double.compare(circle1.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }

//    public boolean equals(Object o) {
//        if(this == o){
//            return true;
//        }
//
//        if(o instanceof Circle1){
//            Circle1 circle1 = (Circle1) o; // 如果是子类的话进行强转；
//            return this.radius == radius;
//        }
//        return false;
//    }


    @Override
    public String toString() {
        return "Circle1{" + //Circle1表示类型
                "radius=" + radius +
                '}';
    }
}
