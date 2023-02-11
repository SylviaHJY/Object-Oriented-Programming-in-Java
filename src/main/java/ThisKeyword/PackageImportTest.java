package ThisKeyword;

import ThisArrayPractice.Bank;
import ThisArrayPractice.Account;

import java.lang.reflect.Field;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
//以上三个可以合写为：import java.util.*; 表示导入util目录下的所有类。
import java.util.*;

import static java.lang.System.*; // 引用System类下静态的结构
import static java.lang.Math.*; // 引用static的落脚点一定是类中的某一个结构！！


/**
 * 一、package关键字的使用
 * 1.为了更好的实现项目中类的管理，提供包的概念。
 * 2.使用package声明类或接口所属的包，声明在源文件的首行。
 * 3.包，属于标识符，遵循标识符的命名规则，命名规范（xxxyyy）。小写。见明知意。
 * 4.每"."一次，就代表一层文件目录。如：com.atguigu.java2;
 *
 * 补充：同一个包下不能命名同名的接口、类。
 *      不同的包下可以命名同名的接口、类。
 *
 * MVC设计模式：
 * 模型层 model 主要处理数据
 * 视图层 view 显示数据
 * 控制层 controller 处理业务逻辑
 *
 * 二、import关键字的使用
 *    比如：import java.util.Scanner;  // Import the Scanner class
 *    1. 在源文件中，显式的使用import结构导入指定包下的类、接口。
 *    2. 声明在package的声明和类的声明之间。
 *    3. 如果需要导入多个结构，则并列写出即可。
 *    4. 可以使用"XXX.*" 的方式，表示导入XXX包下的所有结构。
 *    5. 如果使用的类或接口是java.lang包下定义的，则可以省略import结构。
 *    6. 如果使用的类或接口是本包下定义的，则可以省略import结构。
 *    7. 如果在源文件中，使用了不同包下的同名的类，则必须至少有一个以全类名的方式显示。（包含包的名字在内）
 *    8. 如果使用"XXX.*" 方式表面可以调用XXX包下的所有结构。但如果使用的是XXX子包下的结构，则仍需要显式调用。
 *       如：import ThisKeyword.thisKeyword.account, 表示在ThisKeyword包里还有一个thisKeyword子包。
 *    9. import static： 导入指定类或接口中的静态结构：属性或方法。
 *
 */

public class PackageImportTest {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new int[]{1,2,3}));;

         Bank bank = new Bank(20);

        ArrayList List = new ArrayList();
        HashMap map = new HashMap();

        Account acct = new ThisArrayPractice.Account(200);

        //若引用不同包里相同名字的类，在另一个前面补全包的名字。（全类名）
        ThisKeyword.Account acct1 = new ThisKeyword.Account(98033,60000,0.23);

        // 再比如：
        Date date = new Date(); // 此时date默认在util包下。
        java.sql.Date date1 = new java.sql.Date(20220710);  // 此时的date在java.sql的类中。

        // 调用包里的子包类，需要显式调用：
        Field field = null; // Field 是在java.lang.reflect.Field里，在lang的子包reflect内。

        out.print("hello"); // 引入了System类下的静态结构。
    }
}
