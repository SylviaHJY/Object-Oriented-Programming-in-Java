package TeamProject.Service;

/**
 *  枚举；
 */

public class Status {
    private final String NAME; // final属性一般都是全大写；

    //1.私有化类的构造器:
    private Status(String name){
        this.NAME = name;
    }

    public static final Status AVAILABLE = new Status("AVAILABLE");
    public static final Status UNAVAILABLE = new Status("UNAVAILABLE");
    public static final Status VACATION = new Status("VACATION");

    public String getNAME() {
        return NAME;
    }

    @Override
    public String toString() {
        return NAME;
    }
}
