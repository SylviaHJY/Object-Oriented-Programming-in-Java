package ThisKeyword;

public class Boy {
    private String name;
    private int age;

    public Boy(){

    }

    public Boy(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void marry( Girl girl){
        System.out.println("I want to marry " + girl.getName() + " !");
    }

    public void shout(){
        if(this.age >= 22){ //体现this的使用，通常省略。
            System.out.println("You are legal to marry!");
        }else{
            System.out.println("Bro enjoy your life!");
        }
    }
}
