package OOPText;

public class ValueTransferTest1 {
    public static void main(String[] args) {
        Data data = new Data();
        data.m = 12;
        data.n = 23;
        System.out.println("m = " + data.m + ", n = " + data.n);

        ValueTransferTest1 test1 = new ValueTransferTest1();
        test1.swap(data);
        System.out.println("m = " + data.m + ", n = " + data.n);

        int[] arr = new int[]{1,3,8,0,46,-6,-9,-112,45,59,256,289,333,5,66,109,-8};
        test1.sort(arr);
        test1.print(arr);
    }

    public void swap(Data data){
        int temp = data.m;
        data.m = data.n;
        data.n = temp;
    }

    //  数组中交换元素，给一个数组参数：int[]arr
    public void swap(int[]arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // 将冒泡排序写成引用swap方法：
    public void sort(int[] arr){
        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length - 1 - i; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr,j,j+1); // 这里引用方法不用new一个对象，因为不是static
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


}


class Data{
    int m;
    int n;
}