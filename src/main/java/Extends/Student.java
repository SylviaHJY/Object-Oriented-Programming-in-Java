package Extends;

/**
 * 继承人的特性, 人有的属性和功能不需要重复写
 */
public class Student extends Person{
    String major;

    public Student(){

    }

    public Student(String name, int age, String major,String gender){
        this.name = name;
        this.age = age;
        this.major = major;
        setGender(gender); //私有属性也继承了，封装性的原因不能直接调用。
    }

    public void study(){
        System.out.println("study");
    }

    public void show(){
        System.out.println("name\tage\tgetGender()"); //方法体里调用方法不用新建对象
    }
}
