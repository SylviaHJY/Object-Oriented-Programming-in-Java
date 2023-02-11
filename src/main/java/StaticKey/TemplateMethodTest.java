package StaticKey;

/**
 * 抽象类的应用：模版方法设计模式：TemplateMethod
 */
public class TemplateMethodTest {
    public static void main(String[] args) {
        SubTemplate t = new SubTemplate();
        t.code();
    }

}

abstract class Template{
    //计算某段代码执行需要花费的时间：
    public void runTime(){
        //获取1970年之后到现在的时间毫秒数
        long start = System.currentTimeMillis();
        this.code(); //不确定的部分，易变的部分。钩子方法。
        long end = System.currentTimeMillis();
        System.out.println("Code run time is : " + (end - start));

    }

    public abstract void code(); //不确定执行哪段代码，所以写成abstract。

}

class SubTemplate extends Template{

    @Override
    public void code() {
        for(int i = 2; i <= 1000; i++){ //求1000以内的质数
            boolean isFlag = true;
            for(int j = 2; j <= Math.sqrt(i); j++){   // Math.sqrt(i), 开根号计算公式，Math.sqrt(9) = 3；
                 if(i % j == 0){
                     isFlag = false;
                     break;
                 }
            }
            if(isFlag){
                System.out.println(i);
            }
        }
    }
}