package c1;
import java.util.TreeSet;

public class Tree {

    public static void main(String[] args) {
        TreeSet<Emp> tr = new TreeSet<>();
        Emp emp1 = new Emp(301, "Arun", 20000);
        Emp emp2 = new Emp(302, "Aayush", 30000);
        Emp emp3 = new Emp(303, "Abhimanyu", 25000);
        Emp emp4 = new Emp(304, "Akshay", 19000);
        Emp emp5 = new Emp(305, "Anmol", 45000);
        Emp emp6 = new Emp(306, "Ansh", 55000);

        tr.add(emp1);
        tr.add(emp2);
        tr.add(emp3);
        tr.add(emp4);
        tr.add(emp5);
        tr.add(emp6);

        for (Emp emp : tr) {
            System.out.println("ID :" + emp.getId());
            System.out.println("NAME :" + emp.getName());
            System.out.println("Salary :" + emp.getSalary());
            System.out.println("CNAME :" + Emp.getCname());
            System.out.println("==========================");
        }
    }
}
