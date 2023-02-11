package Practice;
import static java.lang.Math.random;
import java.util.Arrays;

/**
 * 声明一个method方法，在方法中打印一个10*8的*形矩阵，在main方法中调用该方法。
 *
 */

public class RectangleArea {
    public void method() {
        int[][] arr = new int[10][8];
        for(int i = 0; i < arr.length; i++){
            for(int j =0; j < arr[i].length; j++){
                arr[i][j] = (int)(Math.random() * 100 + 1);
                for(int q = 0; q <= i; q++){
                    for(int r = 0; r < j; r++){
                        if(arr[i][j] == arr[q][r]){
                            j--;
                            break;
                        }
                    }
                }
            }
        }
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }


    public int area(int m , int n){
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
       return m * n;
    }
}