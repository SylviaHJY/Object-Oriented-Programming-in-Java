package Template;

public class MonthlyEmployee extends Employee{
    private double monthlySalary;

    public MonthlyEmployee(String name, int numberID, MyDate birthday, double monthlySalary) {
        super(name, numberID, birthday);
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public int bonus() {
        return 100;
    }

    @Override
    public double earnings() {
        return monthlySalary;
    }

    public String toString(){
        return "PaidEmployee{" + super.toString() + "}"; //调用父类的toString方法。
    }
}
