package Template;

public class HourlyEmployee extends Employee{

    private int wage; // 每小时的工资；
    private int hour; // 工作的小时数；

    public HourlyEmployee(String name, int numberID, MyDate birthday, int wage, int hour) {
        super(name, numberID, birthday);
        this.wage = wage;
        this.hour = hour;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public int bonus() {
        return wage * 2;
    }

    @Override
    public double earnings() {
        return wage * hour;
    }

    public String toString(){
        return "HourlyEmployee{" + super.toString() + "}"; //调用父类的toString方法。
    }
}
