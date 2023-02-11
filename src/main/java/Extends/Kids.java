package Extends;

public class Kids extends ManKid{
    private int yearsOld;

    public Kids(){

    }

    public Kids(int yearsOld){
        this.yearsOld = yearsOld;
    }

    public int getYearsOld(){
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public void employ(){
        System.out.println("Kids should not have job.");  //对父类同名同参方法employ的重写override.
    }


}
