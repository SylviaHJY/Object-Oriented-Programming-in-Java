package Constructor;

public class TriAngle {

    private double base; // 底边长；
    private double height; // 高；

    public TriAngle(){
        //  习惯提供一个空参
    }

    //  初始化构造器的属性
    public TriAngle(double b, double h){
        base = b;
        height =h;
    }

    public void setBase(double n){
        if(n <= 0){
            throw new RuntimeException("Illegal input"); // 抛出异常
        }else{
            base = n;
        }
    }
     public double getBase(){

        return base;
    }

    public void setHeight(double h){
        if(h <= 0){
            throw new RuntimeException("Illegal input"); // 抛出异常
        }else{
            height = h;
        }
    }

    public double getHeight(){
        return height;
    }

}

// 在另一个类中定义求三角形面积的方法：
class findArea {
    public double findTriArea(TriAngle triAngle) { // 传参传入一个对象！！
        return 0.5 * triAngle.getBase() * triAngle.getHeight();
    }

}



