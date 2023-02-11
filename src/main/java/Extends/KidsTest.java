package Extends;

public class KidsTest {
    public static void main(String[] args) {
        Kids kid = new Kids(12);
        System.out.println(kid.getYearsOld());

        kid.setSalary(100);
        kid.employ();  // 方法的重写，调用的是kids里重写过的方法。
        kid.gender(1);
    }
}
