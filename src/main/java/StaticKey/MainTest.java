package StaticKey;

/**
 * main()方法的使用说明：
 * 1、main()方法作为程序的入口。
 * 2、main()方法也是一个普通的静态方法。
 * 3、main()方法可以作为我们与控制台交互的方式。（之前用 scanner）。
 */

public class MainTest {
    public static void main(String[] args) { //体现为作为程序的入口
           Main.main(args = new String[100]);
           show(); //类的静态方法里调类的静态方法不需要造对象，直接调用。静态里不能调用非静态，需要造对象。
    }

    public static void show(){
        System.out.println("Hh");
    }

}

class Main{
    public static void main(String[] args) {
        for(int i = 0; i < args.length; i++){
            args[i] = "args_" + i;
            System.out.println(args[i]);
        }
    }
}
