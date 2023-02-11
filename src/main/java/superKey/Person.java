package superKey;

public class Person {
    String name;
    int age;
    String ID; // 身份证号

    public Person(){
        System.out.println("I am in everywhere!");
    }

    public Person(String name){
        this.name = name;
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("eat");
    }

    public void walk(){
        System.out.println("walk");
    }

}
