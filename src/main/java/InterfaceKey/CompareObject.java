package InterfaceKey;

public interface CompareObject{
    //若返回值是0，代表相等；若为正数，代表当前对象大；负数代表当前对象小：
    public abstract int compareTo(Object o);
}


