package TeamProject.domain;

public class Architect extends Designer{
    private int stock;

    public Architect(){
        super();
    }

    public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
        super(id, name, age, salary,equipment, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return getDetails() + "\tArchitect\t" + getStatus() + "\t" + getBonus() + "\t" + stock  + "\t\t" + getEquipment().getDescription();
    }

    public String getDetailsForTeam(){
        return getTeamInfo()+ "\tArchitect\t" + getBonus() + "\t"+ getStock();

    }
}
