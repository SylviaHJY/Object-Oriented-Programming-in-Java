package Extends;

public class ManKid {
    private int sex;
    private double salary;

    public ManKid(){
    };

    public ManKid(int sex, double salary) {
        this.sex = sex;
        this.salary = salary;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void gender(int sex){
        this.sex = sex;
        System.out.println("Please enter 0 or 1 (0 == Woman, 1 == Man) " + " Your enter : " + sex);
        if(sex == 1){
            System.out.println("Man");
        }else if(sex == 0){
            System.out.println("Woman");
        }else{
            System.out.println("Other");
        }
    }

    public void employ(){
        String jobInfo =  (salary == 0.0) ? "no job" : "has job";
        System.out.println(jobInfo);
    }
}
