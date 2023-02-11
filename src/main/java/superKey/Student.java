package superKey;

public class Student extends Person{
    String major;
    String ID; //学生学号

    public Student(){

    }

    public Student(String major){
        super(); //调用父类的空参构造器
        this.major = major;
    }

    public Student(String name, int age, String major){
        super(name,age); // 通过super调父类构造器
        this.major = major;
    }

    @Override
    public void eat(){
        System.out.println("student should eat more nutritious food");
    }

    public void study(){
        System.out.println("Study");
        this.eat();
        super.eat();
        walk(); // 没有重名的情况下写this.walk() super.walk()是一样的，现在本类找，找不到去父类找。
    }

    public void show(){
        System.out.println("Name: " + this.name + "\t" + "Age:" + super.age + "\t" + "Major: " + this.major);
        System.out.println("ID : " + ID); // 此时调用的是student类自己定义的ID， 属性不会覆盖；
        System.out.println("ID : " + super.ID); // 此时调用的是父类的ID。
    }
}
