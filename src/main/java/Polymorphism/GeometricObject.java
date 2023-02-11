package Polymorphism;

public abstract class GeometricObject {
    protected String color;
    protected double weight;

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

    public GeometricObject(String color, double weight) {
        super();
        this.color = color;
        this.weight = weight;
    }

    //此时将方法抽象化，子类有很多种，不能提供计算方法，所有子类需要重写该方法：
    public abstract double findArea();

}
