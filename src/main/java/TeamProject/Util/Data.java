package TeamProject.Util;

public class Data {
    public static final int EMPLOYEE = 10;
    public static final int PROGRAMMER = 11;
    public static final int DESIGNER = 12;
    public static final int ARCHITECT = 13;

    public static final int PC = 21;
    public static final int NOTEBOOK = 22;
    public static final int PRINTER = 23;

    //Employee  :  10, id, name, age, salary
    //Programmer:  11, id, name, age, salary
    //Designer  :  12, id, name, age, salary, bonus
    //Architect :  13, id, name, age, salary, bonus, stock
    public static final String[][] EMPLOYEES = {
            {"10", "1", "   Ma   Yun  ", "22", "3000"},
            {"13", "2", " Huateng   Ma", "32", "18000", "15000", "2000"},
            {"11", "3", " Yanhong   Li", "23", "7000"},
            {"11", "4", "Qiangdong Liu", "24", "7300"},
            {"12", "5", "   Jun   Lei ", "28", "10000", "5000"},
            {"11", "6", "Zhiqiang  Ren", "22", "6800"},
            {"12", "7", "Chuanzhi  Liu", "29", "10800","5200"},
            {"13", "8", "Yuanqing Yang", "30", "19800", "15000", "2500"},
            {"12", "9", "  Yuzhu   Shi", "26", "9800", "5500"},
            {"11", "10", "  Ding   Lei", "21", "6600"},
            {"11", "11", "Chaoyang Zhang", "25", "7100"},
            {"12", "12", "Zhiyuan Yang", "27", "9600", "4800"}
    };

    //如下的EQUIPMENTS数组与上面的EMPLOYEES数组元素一一对应
    //PC      :21, model, display
    //NoteBook:22, model, price
    //Printer :23, name, type
    public static final String[][] EQUIPMENTS = {
            {},
            {"22", " Lenovo", "6000"},
            {"21", " Dell", "NEC17inch"},
            {"21", "Dell", "SamSung 17inch"},
            {"23", "Canon 2900", "laser"},
            {"21", " ASUS", "SamSung 17inch"},
            {"21", "ASUS", "SamSung 17inch"},
            {"23", "EPSON20K", "Needle"},
            {"22", "HPm6", "5800"},
            {"21", "Dell", "NEC 17inch"},
            {"21", "ASUS","SamSung 17inch"},
            {"22", "HPm6", "5800"}
    };
}
