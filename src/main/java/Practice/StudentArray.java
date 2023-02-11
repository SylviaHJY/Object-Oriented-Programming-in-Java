package Practice;

import java.util.Arrays;

public class StudentArray {
    public static void main(String[] args) {
        //声明人数为20的学生数组：
        Student[] students = new Student[20]; // String[] arr = new String[]; 数组声明类型可以是任意类型

        //给每个数组里新建一个类-学生-对象
        for(int i = 0; i < students.length; i++){
            students[i] = new Student();
            // 给每一个数组对象的属性赋值
            students[i].ID = i + 1; // 学号从1-20
            // 年级随机，范围：【1，6】  取值可以取到0但是取不到右边闭合括号的数，即取不到6
            students[i].grade = (int)(Math.random() * (6 - 1 + 1) + 1);
            // 成绩：【0，100】 // 成绩可以为0，但要取到100；
             students[i].score = (int)(Math.random() * (100 - 0 + 1));
        }
        // 遍历学生数组打印学生信息
//        System.out.println("ID "  + " Grade" +  " score");
        for(int i = 0; i < students.length; i++){
//            System.out.println(students[i].ID + "  " + students[i].grade + "  " + students[i].score + " ");
            // 通过调用方法完成遍历打印学生信息
            System.out.println(students[i].info());
        }
          System.out.println();

        // 打印出三年级学生的信息
        for(int i = 0; i < students.length; i ++){
            if(students[i].grade == 3){
                System.out.println(students[i].info());
            }
        }
        System.out.println();

        // 使用冒泡排序按学生成绩排序，并遍历所有学生信息
        for(int i = 0; i < students.length; i++){
            for(int j = 0; j < students.length - 1 -i; j++) {
                if (students[j].score > students[j + 1].score) { // 如果需要换顺序，交换的是整个student对象
                    Student temp = students[j]; // 声明的临时变量类型要和声明的数组类型一致
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
        // 打印排序后的数组
        for(int i = 0; i < students.length; i++){
            System.out.println(students[i].info());
        }
    }

}

class Student{
    int ID;
    int grade;
    int score;

    // 显示学生信息的方法
    public String info(){
        return  "ID is : " + ID + " grade is : " + grade + " score is : " + score ;
    }

}