package Polymorphism;

/**
 *  证明多态是运行时行为：
 *  public class InterviewTest{
 *      public static Animal getInstance(int key){
 *         switch(key){
 *             case 0:
 *             return new Cat();
 *             case 1:
 *             return new Dog();
 *             case 2:
 *             return new Sheep();
 *         }
 *      }
 *
 *      public static void main(String[] args){
 *          int key = new Random().nextInt(3); // int key = (int)Math.random() * 3;
 *          System.out.println(key);
 *          Animal animal = getInstance(key); // 用随机生成的数来决定造哪个类，编译时不能确定会调用哪个方法
 *          animal.eat();
 *      }
 *  }
 *
 *
 */

public class GeometricTest {

    public static void main(String[] args) {
        GeometricTest test = new GeometricTest();
        test.displayGeometricObject(new Circle("white",1.0,3.5)); // 传参父类的子类，多态性的体现

        //多态性的体现二：
        MyRectangle r1 = new MyRectangle("white",1.0,5.0,4.0);
        MyRectangle r2 = new MyRectangle("black",1.0,6.0,5.0);
        System.out.println(test.equalsArea(r1,r2));
        test.displayGeometricObject(r1);
        test.displayGeometricObject(r2);

    }

    //测试两个对象的面积是否相等
    public boolean equalsArea(GeometricObject O1, GeometricObject O2){
        return O1.findArea() == O2.findArea(); //调方法的时候都是子类重写的方法。
    }

    public void displayGeometricObject(GeometricObject O){
        System.out.println("Area is : " + O.findArea());
    }

}
