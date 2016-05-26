

public class EmployeeTest {

    public static void main(String[] args) {

        Manager boss = new Manager("Carl Cracker", 80000,1987, 10, 1);
        boss.setBonus(5000);
        Employee[] staff = new Employee[3];
        staff[0] = boss;
        staff[1] = new Employee("Harry Hacker",50000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tester",40000, 1990, 3, 15);

        for (Employee w : staff){
            w.raiseSalary(5);
            System.out.println("name = "+ w.getName() +", salary = "+ w.getSalary());
        }
    }





}
