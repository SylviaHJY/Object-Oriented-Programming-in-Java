package TeamProject.Util;

import java.util.Scanner;

/**
 *
 * @Description 项目中提供了TSUtility.java类，可用来方便地实现键盘访问。
 * @author
 * @version
 * @date
 *
 */
public class TSUtility {
    private static Scanner scanner = new Scanner(System.in);
    /**
     *
     * @Description 该方法读取键盘，如果用户键入’1’-’4’中的任意字符，则方法返回。返回值为用户键入字符。
     * @author
     * @date
     * @return
     */
    public static char readMenuSelection() {
        char c;
        for (; ; ) {
            String str = readKeyBoard(1, false);
            c = str.charAt(0);
            if (c != '1' && c != '2' &&
                    c != '3' && c != '4') {
                System.out.print("Wrong input, Retype ：");
            } else break;
        }
        return c;
    }
    /**
     *
     * @Description 该方法提示并等待，直到用户按回车键后返回。
     * @author
     * @date
     */
    public static void readReturn() {
        System.out.print("Press enter to return....");
        readKeyBoard(100, true);
    }
    /**
     *
     * @Description 该方法从键盘读取一个长度不超过2位的整数，并将其作为方法的返回值。
     * @author
     * @date
     * @return
     */
    public static int readInt() {
        int n;
        for (; ; ) {
            String str = readKeyBoard(2, false);
            try {
                n = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.print("Wrong number, Retype ：");
            }
        }
        return n;
    }
    /**
     *
     * @Description 从键盘读取‘Y’或’N’，并将其作为方法的返回值。
     * @author
     * @date
     * @return
     */
    public static char readConfirmSelection() {
        char c;
        for (; ; ) {
            String str = readKeyBoard(1, false).toUpperCase();
            c = str.charAt(0);
            if (c == 'Y' || c == 'N') {
                break;
            } else {
                System.out.print("Wrong input, Retype ：");
            }
        }
        return c;
    }

    private static String readKeyBoard(int limit, boolean blankReturn) {
        String line = "";

        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            if (line.length() == 0) {
                if (blankReturn) return line;
                else continue;
            }

            if (line.length() < 1 || line.length() > limit) {
                System.out.print("Input limit : (" + limit + "）, Retype ：");
                continue;
            }
            break;
        }

        return line;
    }
}