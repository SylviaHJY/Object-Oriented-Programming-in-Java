package ProxyModel;

/**
 * 接口的应用：Proxy代理模式
 * 应用场景：安全代理、远程代理、延迟加载、静态代理、动态代理
 */

public class NetWorkTest {
    public static void main(String[] args) {
        Sever sever = new Sever();
        ProxySever proxySever = new ProxySever(sever);
        proxySever.browse(); //包含真实的服务器的访问。
    }


}

interface NetWork{
    public abstract void browse();

}


//被代理类：
class Sever implements NetWork{

    @Override
    public void browse() {
        System.out.println("Browsing internet.");
    }
}

//代理类：
class ProxySever implements NetWork{

    private NetWork netWork;

    public ProxySever(NetWork netWork){
        this.netWork = netWork;
    }

    public void check(){
        System.out.println("Checking before connecting...");
    }

    @Override
    public void browse() {
        check();
        netWork.browse(); //真实服务器的访问。实际上是服务器自己调用方法。 NetWork network = new Sever();
    }
}
