package Polymorphism;

public class Man extends Person{
    boolean isSmoking;

    public void earnMoney(){
        System.out.println("Man has to get paid job.");
    }

    @Override
    public void eat(){
        System.out.println("Man usually needs more protein food");
    }

    public void walk(){
        System.out.println("Man run");
    }
}
