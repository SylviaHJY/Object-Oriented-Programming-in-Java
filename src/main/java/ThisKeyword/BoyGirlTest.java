package ThisKeyword;

public class BoyGirlTest {
    public static void main(String[] args) {
        Boy boy = new Boy("Hose",27);
        boy.shout();
        Girl girl = new Girl("Lydia", 25);
        girl.marry(boy);
        System.out.println();

        Girl girl1 = new Girl("Pig",4);
        System.out.println(girl.compare(girl1));
    }
}
