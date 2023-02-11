package OOPText;

/**
 * 关于值传递的使用
 * 定义一个PassObject, 在类中定义一个方法printAreas(), 该方法的定义如下：public void printAreas(Circle c, int time)
 * 在printAreas()方法中打印输出1到time之间的每个整数半径值，以及对应的圆面积。
 * 例如：times为5， 则输出半径1，2，3，4，5 ，以及对应的圆面积。
 */

public class PassObject {
    public static void main(String[] args) {
        PassObject test = new PassObject();
        Circle c = new Circle();
        test.printAreas(c,6);
        System.out.println("Now radius is " + c.radius);
    }
    public void printAreas(Circle c, int time){
        System.out.println("Radius\t\tArea");

        for(int i = 1; i <= time; i++){
            //设置圆的半径
            c.radius = i;
            System.out.println(c.radius + "\t\t" + c.findArea());
        }

        c.radius = time + 1;
    }
}
