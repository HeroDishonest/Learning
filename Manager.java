/**
 * Created by i.heldyieu on 26.05.2016.
 */
public class Manager extends Employee{
    private double bonus;

    public Manager (String n, double s, int year, int month, int day){
        super(n,s,year,month,day);
        bonus =0;
    }

    public double getSalary(){
        double baseSalary = super.getSalary();
        return baseSalary+bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (!super.equals(otherObject)) return false;
        Manager other = (Manager) otherObject;
        return bonus==other.bonus;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + 17*new Double(bonus).hashCode();
    }
}

