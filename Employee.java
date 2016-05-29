import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

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

    public boolean equals(Object otherObject){
        //быстро проверить объекты на идентичность
        if (this == otherObject) return true;
        // если янвый параметр имеет пустое значение должно быть возвращено логическое знаение false
        if (otherObject == null) return false;
        // если классы не совпадают, то они неравнозначны
        if (getClass()!=otherObject.getClass()) return false;
        //теперь известно , что Otherobject непустой объект типа Employee
        Employee other = (Employee) otherObject;

        //проверить, содержат ли поля одинаковые значения
        return Objects.equals(name,other.name) && salary==other.salary && Objects.equals(hireDay, other.hireDay);
    }

    public int hashCode(){
        return Objects.hash(name,salary,hireDay);
    }



    public static int getNextId() {
        return nextId;
    }
}