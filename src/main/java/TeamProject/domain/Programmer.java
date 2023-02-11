package TeamProject.domain;

import TeamProject.Service.Status;

public class Programmer extends Employee{
    private int memberID; //在开发团队中的ID；
    private Status status = Status.AVAILABLE;
    private Equipment equipment;

    public Programmer(){
        super();
    }

    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return super.toString() + "\tProgrammer\t" + status + "\t\t\t" + equipment.getDescription();
    }

    public String getTeamInfo(){
       return memberID + "/" + getId() + "\t" + getName() + "\t" + getAge() + "\t" + getSalary();
    }

    public String getDetailsForTeam(){
        return getTeamInfo()+ "\tProgrammer";

    }
}

