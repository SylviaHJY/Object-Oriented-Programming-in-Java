package Polymorphism;

public class Person {
    String name;
    int age;

    public Person(){

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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
