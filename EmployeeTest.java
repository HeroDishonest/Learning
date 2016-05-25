

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by HeroDishonest on 23.05.2016.
 */
public class EmployeeTest {

    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Carl Cracker",75000, 1987, 12, 15);
        staff[1] = new Employee("Harry Hacker",50000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tester",40000, 1990, 3, 15);

        for (Employee w : staff){
            w.raiseSalary(5);
            System.out.println("name = "+ w.getName() +", salary = "+ w.getSalary()+", hireDay = "+w.getHireDay());
        }
    }





}
