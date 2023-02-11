package Practice;
/** 一、理解"万事万物皆对象"
 * 1.在Java语言中，将功能、结构等封装到类中，通过类的实例化，来调用具体的内容结构（属性，或者方法）。
 *    如：  Scanner，String等
 *         文件：File
 *         网络地址：URL
 * 2.涉及到Java语言与前端HTML、后段数据库交互时，前后端的结构在Java层面交互时，都体现为类、对象。
 *
 * 二、内存解析的说明
 * 1.引用类型的变量，只能储存两类值：null、或地址值（含变量的类型）
 *
 * 三、匿名对象
 *     new Phone().sendEmail(); 没有名字
 *     new Phone().playGame(); 此时new Phone()是新的对象，和上行的new Phone()不是同一个对象；
 *     理解：创建的对象没有显式的赋给一个变量名，即为匿名对象；
 *     特征：匿名对象只能调用一次
 *     使用：mall.show(new Phone()); 传参的时候直接传匿名对象
 * 有名对象：p.sendEmail(); p.playGame(); p是名字
 *
 */
public class ArrayUtil {
    //自定义数组的工具类
    //求数组的最大值
    public int getMax(int[] arr){
        int maxValue = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
    //求数组的最小值
    public int getMin(int[] arr){
        int minValue = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < minValue){
                minValue = arr[i];
            }
        }
        return minValue;
    }
    //求数组的总和
    public int getSum(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
    //求数组的平均值
    public double getAvg(int[] arr){

        return Double.valueOf(getSum(arr)) / arr.length;
    }

    // 以下两个同名方法构成了重载
    //反转数组
    public void reverse(int[] arr){
        for(int i = 0; i < arr.length / 2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 -i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    public void reverse(String[] arr){
        for(int i = 0; i < arr.length / 2; i++){
            String temp = arr[i];
            arr[i] = arr[arr.length - 1 -i];
            arr[arr.length - 1 - i] = temp;
        }
    }
    //复制数组
    public int[] copy(int[] arr){
        int[] arr1 = new int[arr.length];
        for(int i = 0; i < arr.length ;i++){
            arr1[i] = arr[i];
        }
        return arr1;
    }
    //冒泡数组排序
    public void sort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length - 1 - i; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    //遍历数组
    public void print(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " \t");
            //"\t" is used inside the println statement. It is similar to pressing the tab on our keyboard.
        }
        System.out.println();
    }
    //查找指定元素
    public int getIndex(int[] arr, int number){
       // isFlag = true;
        for(int i = 0; i < arr.length; i++){
            if(number == (arr[i])){
                // isFlag = false; break;
                return i;
            }
            // if(isFlag){
            // System.out.println("No Found!");
        }
        return -1; // 表示没有找到；
    }

}
