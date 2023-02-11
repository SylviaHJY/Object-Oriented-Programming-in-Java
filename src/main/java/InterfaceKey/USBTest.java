package InterfaceKey;

/**
 * 接口的使用：
 * 1. 体现了接口的多态性；执行实现类重写的接口的方法；
 * 2. 实例演练接口是一种规范。
 * 3. 开发项目往往都是面向接口编程。
 *
 * 4. 体会面向接口编程的思想：
 *    我们在应用程序中，调用的结构都是JDBC中定义的接口，不会出现具体某一个数据库厂商的API。
 */

public class USBTest {
    public static void main(String[] args) {
        Computer computer = new Computer();
        // 创建接口的非匿名实现类的非匿名对象：
        Flash flash = new Flash();
        computer.transferData(flash); // 体现接口的多态性。

        //创建接口的非匿名实现类的匿名对象：
        computer.transferData(new Printer());

        //创建接口的非匿名实现类的匿名对象：实现类的名字：phone;
        USB phone = new USB() {
            @Override
            public void start() {
                System.out.println("Phone start working.");
            }

            @Override
            public void stop() {
                System.out.println("Phone stop working.");
            }
        };
        computer.transferData(phone);

        //创建接口的匿名实现类的匿名对象：
        computer.transferData(new USB() {
            @Override
            public void start() {
                System.out.println("Hard drive start working.");
            }

            @Override
            public void stop() {
                System.out.println("Hard drive stop working.");
            }
        });
    }
}

interface USB{
    //常量：定义了长、宽、最大最小的传输速度等
    void start();

    void stop();
}

class Computer{
    public void transferData(USB usb){ //声明的是一个USB，传入的是实现类的对象。USB usb = new Flash();
        usb.start();
        System.out.println("Starting transfer....");
        usb.stop();
    }
}

class Flash implements USB{

    @Override
    public void start() {
        System.out.println("U drive start working.");
    }

    @Override
    public void stop() {
        System.out.println("U drive stop working.");
    }
}

class Printer implements USB{

    @Override
    public void start() {
        System.out.println("Printer start working.");
    }

    @Override
    public void stop() {
        System.out.println("Printer stop working.");
    }
}