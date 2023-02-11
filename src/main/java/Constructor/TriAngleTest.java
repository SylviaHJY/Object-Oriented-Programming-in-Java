package Constructor;

public class TriAngleTest {
    public static void main(String[] args) {
        TriAngle t1 = new TriAngle();
        t1.setBase(3.8);
        t1.setHeight(2.4);
        System.out.println("base: " + t1.getBase() + ", height : " + t1.getHeight());
        TriAngle t2 = new TriAngle(5.6,8.0);
        System.out.println("base: " + t2.getBase() + ", height : " + t2.getHeight());
        System.out.println();

        findArea f = new findArea();
        System.out.println(f.findTriArea(t2));
    }
}
