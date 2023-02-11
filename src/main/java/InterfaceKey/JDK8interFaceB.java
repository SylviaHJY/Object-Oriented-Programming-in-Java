package InterfaceKey;

public interface JDK8interFaceB {
    default void method3() {  //省略了public, 但是权限还是public的；
        System.out.println("JDK8B");
    }
}
