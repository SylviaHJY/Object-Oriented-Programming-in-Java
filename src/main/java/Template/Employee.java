package Template;

/**
 *
 */

abstract public class Employee {
    private String name;
    private int numberID;
    private MyDate birthday;

    public Employee(String name, int numberID, MyDate birthday) {
        this.name = name;
        this.numberID = numberID;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberID() {
        return numberID;
    }

    public void setNumberID(int number) {
        this.numberID = number;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }


    public abstract int bonus();


    public abstract double earnings();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", numberID=" + numberID +
                ", birthday=" + birthday.toDateString() +   // 需要注意birthday要调用重写的toDateString方法。
                '}';
    }
}
