package DesignProject.Util;

import java.util.*;

/**
 * 将不同的功能能装为方法，就是可以直接通过调用方法使用它的功能，而无序考虑具体的实现细节。
 */

public class CMUtility {

    public static void main(String[] args) {

        //System.out.println(readMenuSelection());
    }
    private static Scanner scanner = new Scanner(System.in);
    private static String readKeyBoard(int limit,boolean blank){

        for (;;) {

            String str = scanner.nextLine();
            if (str.length()>0 && str.length()<=limit) {

                return str;
            } else if (blank) {

                return str;
            }else{

                System.out.println("Please enter a command that does not exceed the length limit ："+ limit );
            }
        }

    }

    public static char readMenuSelection(){

        //获取功能选择
        char c;
        for(;;){

            String str = readKeyBoard(1,false);
            c = str.charAt(0);
            if (c=='1' || c=='2' || c=='3' || c=='4' || c=='5' ) {

                return c;
            } else {

                System.out.println("Incorrect selection, please re-enter ： ");
            }
        }
    }

    public static char readChar(){

        //获取性别
        String str = readKeyBoard(10,false);
        return str.charAt(0);
    }

    public static char readChar(char defaultValue){

        //修改性别信息时，不输入信息直接回车
        String str = readKeyBoard(1,true);
        return (str.length()==0)? defaultValue : str.charAt(0);
    }

    public static int readInt(){

        //获取年龄
        int n;
        for(;;){

            String str = readKeyBoard(2,false);
            try{

                n = Integer.parseInt(str);
                return n;
            }catch (NumberFormatException e) {

                System.out.println("Incorrect numbers, please re-enter ：");
            }
        }
    }

    public static int readInt(int defaultValue){

        //修改年龄信息时，不输入信息直接回车
        int n;
        for(;;){

            String str = readKeyBoard(2,true);
            if (str.equals("")) {

                return defaultValue;
            }
            try{

                n = Integer.parseInt(str);
                return n;
            }catch (NumberFormatException e) {

                System.out.println("Incorrect numbers, please re-enter ：");
            }
        }
    }

    public static String readString(int limit){

        //姓名、电话、邮箱的输入
        return readKeyBoard(limit,false);
    }

    public static String readString(int limit,String defaultValue){

        //修改姓名、电话、邮箱时，不输入信息直接回车
        String str = readKeyBoard(limit,true);
        return str.equals("") ? defaultValue : str;
    }

    public static char readConfirmSelection(){

        //获取确认的输入
        for(;;){

            String str = readKeyBoard(1,false).toUpperCase();
            char c = str.charAt(0);
            if (c=='Y' || c=='N') {

                return c;
            } else {

                System.out.println("Incorrect input, please re-enter: Y/N");
            }
        }
    }
}

