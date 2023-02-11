package Practice;

public class OptimizeStudentArray {
    public static void main(String[] args) {
        Student1[] students1 = new Student1[20];
        //给每个数组里新建一个类-学生-对象
        for (int i = 0; i < students1.length; i++) {
            students1[i] = new Student1();
            // 给每一个数组对象的属性赋值
            students1[i].ID = i + 1; // 学号从1-20
            // 年级随机，范围：【1，6】  取值可以取到0但是取不到右边闭合括号的数，即取不到6
            students1[i].grade = (int) (Math.random() * (6 - 1 + 1) + 1);
            // 成绩：【0，100】 // 成绩可以为0，但要取到100；
            students1[i].score = (int) (Math.random() * (100 - 0 + 1));
        }

        OptimizeStudentArray test = new OptimizeStudentArray();
        test.print(students1);
        test.searchGrade(students1,5);
        System.out.println();
        test.bubbleSort(students1);
    }


        //遍历Student1[]数组的操作；
        public void print(Student1[] students1){
            for(int i = 0; i < students1.length; i++){
                System.out.println(students1[i].info());
            }
            System.out.println();
        }

        // 查找Student1[]数组中指定年级学生的信息
        public void searchGrade(Student1[] students1, int grade){
            for(int i = 0; i < students1.length; i ++){
                if(students1[i].grade == grade){
                    System.out.println(students1[i].info());
                }
            }

        }

        //给Student1[]数组进行冒泡排序
        public void bubbleSort(Student1[] students1){
            for(int i = 0; i < students1.length; i++){
                for(int j = 0; j < students1.length - 1 -i; j++) {
                    if (students1[j].score > students1[j + 1].score) { // 如果需要换顺序，交换的是整个student对象
                        Student1 temp = students1[j]; // 声明的临时变量类型要和声明的数组类型一致
                        students1[j] = students1[j + 1];
                        students1[j + 1] = temp;
                    }
                }
            }
            // 打印排序后的数组
            for(int i = 0; i < students1.length; i++){
                System.out.println(students1[i].info());
            }
        }

    }


class Student1 {
    int ID;
    int grade;
    int score;

    //现实学生信息的方法
    public String info() {
        return "ID is : " + ID + " grade is : " + grade + " score is : " + score;
    }
}
