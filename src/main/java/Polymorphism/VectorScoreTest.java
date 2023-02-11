package Polymorphism;

import java.util.Scanner;
import java.util.Vector;

/**
 * 用Vector代替数组，向量类java.util.Vector可以根据需要动态伸缩。
 * 创建Vector对象： Vector v= new Vector();
 * 给向量添加元素：v.addElement(Object obj); // obj必须是对象
 * 取出向量中的元素：Object obj = v.elementAt(0);
 * 注意第一个元素的下标是0，返回值是Object类型的。
 * 计算向量的长度：v.size();
 *
 */

public class VectorScoreTest {
    public static void main(String[] args) {
        //1、从键盘获取学生成绩
        Scanner scanner = new Scanner(System.in);
        //2、创建Vector对象： Vector v= new Vector(); 相当于原来的数组。
        Vector v = new Vector();
        //3、for(;;)或while(true)方式，给 Vector中添加对象：
        int maxScore = 0;
        for(;;){
            System.out.println("Please input student score (negative number means exit): ");
            int score = scanner.nextInt();
            //3.1添加操作
            if(score < 0){
                break;
            }
            if(score > 150){
                System.out.println("Illegal input");
                continue;
            }
            // v.addElement(Object obj);添加操作
            Integer inScore = Integer.valueOf(score); //添加的是对象所以先转换成一个对象类
            v.addElement(inScore);

            //4、获取学生成绩的最大值
            if(maxScore < score){
                maxScore = score;
            }
        }
        System.out.println("maxScore is : " + maxScore);

        char level;
        for(int i = 0; i < v.size(); i++){
            Object obj = v.elementAt(i); //取出来的元素是object类型的
             Integer isScore = (Integer)obj; //再将object向下转型成Integer，访问Integer的属性;
            int score = isScore.intValue();  //再将Integer的数据转成int；

            // 或写成自动拆箱： int score = (int)obj;

            if(maxScore - score <= 10){
                level = 'A';
            }else if(maxScore - score <= 20){
                level = 'B';
            }else if(maxScore - score <= 30){
                level = 'C';
            }else{
                level = 'D';
            }
            System.out.println("Student-" + (i + 1) + "score is: " + score + ",level is: " + level);
        }

    }

}
