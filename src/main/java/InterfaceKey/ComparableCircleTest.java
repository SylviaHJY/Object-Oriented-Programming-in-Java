package InterfaceKey;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(3.4);
        ComparableCircle c2 = new ComparableCircle(3.6);

        System.out.println(c1.compareTo(c2)); //返回-1则当前对象小；

        System.out.println(c1.compareTo(new String("AA")));
    }
}
