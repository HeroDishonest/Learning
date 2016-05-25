import java.util.Date;
import java.util.GregorianCalendar;

class Employee{
    private String name;
    private double salary;
    private Date hireDay;
    private int id;
    private static int nextId=1;


    public Employee(String n, double s, int year, int month, int day){
        name=n;
        salary=s;
        GregorianCalendar calendar = new GregorianCalendar(year,month-1,day);
        hireDay = calendar.getTime();
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Object getHireDay() {
        return hireDay.clone();
    }

    public void raiseSalary (double byPercent){
        double raise = salary*byPercent/100;
        salary+=raise;
    }

    public void setId(){
        id = nextId;
        nextId++;
    }

    public static int getNextId() {
        return nextId;
    }
}