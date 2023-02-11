package Practice;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtil util = new ArrayUtil();
        int[] arr = new int[]{23,35,46,78,98,77,57,13,25,28,189,247,-5,-94,0,369,1098,987,683,562,10009};
        System.out.println("Max: " + util.getMax(arr));
        System.out.println("Min: " + util.getMin(arr));
        System.out.println("Sum: " + util.getSum(arr));
        System.out.println("Avg: " + util.getAvg(arr));
        System.out.println( util.getIndex(arr,90));
        util.reverse(arr);
        util.print(arr);
        util.sort(arr);
        System.out.print("Sort: ");
        util.print(arr);

    }
}
