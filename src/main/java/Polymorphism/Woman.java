package Polymorphism;

public class Woman extends Person{
    boolean isLongHair;

    public void goShopping(){
        System.out.println("Woman loves shopping.");
    }

    @Override
    public void eat(){
        System.out.println("Woman likes to eat less to keep thin");
    }

    public void walk(){
        System.out.println("Woman jogging");
    }

}
