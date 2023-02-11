package StaticKey;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        Circle c3 = new Circle(3.6);

        System.out.println("c1的ID： " + c1.getId());
        System.out.println("c2的ID： " + c2.getId());
        System.out.println("c3的ID： " + c3.getId() + " c3的radius: " + c3.getRadius());

        System.out.println("total circles : " +  Circle.getTotal());
    }

}

class Circle{
    private double radius;
    private int id;

    public Circle(){ //造一个对象，ID自动生成并+1， 圆的个数也自动+1；
        id = init ++;
        total++;
    }

    public Circle(double radius){
        this();
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getId() {
        return id;
    }

    private static int total; //创建的圆的个数

    public static int getTotal() { //操作static的属性方法也是static；
        return total;
    }

    private static int init = 1001;

    public double findArea(){
        return Math.PI * radius * radius;
    }
}
