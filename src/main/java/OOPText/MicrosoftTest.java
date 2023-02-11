package OOPText;
import java.util.Arrays;

/**
 * 微软：
 * 定义一个int型的数组：int[] arr = new int[]{12,3,3,34,56,77,432};
 * 让数组的每个位置上的值去除以首位置的元素，得到的结果，作为该位置上的新值。遍历新的数组。
 */

public class MicrosoftTest {
    public static void main(String[] args) {
        //方法一：倒着来，从最后一个开始，从第一个开始的话除已自己本身后变成1。
       int[] arr = new int[]{12,3,3,34,56,77,432};
       for(int i = arr.length -1; i >= 0; i--){
           arr[i] = arr[i]/arr[0];
       }

        System.out.println(Arrays.toString(arr));

        // 方法二：用temp
        int[] arr1 = new int[]{10,24,35,44,56,78,987,456,236,100};
        int temp = arr1[0]; //需要额外开辟一个空间，不如方法一
        // 引入了temp保存第一个元素不变，即可从左到右的顺序来
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = arr1[i]/temp;
        }

        System.out.println(Arrays.toString(arr1));

        int[] arr2 = new int[]{1,2,3};
        System.out.println(arr2); // 输出地址值

        char[] arr3 = new char[]{'a','b','c'};
        System.out.println(arr3); //abc, 调用的时候就是把遍历char数组写进去了

    }

}
