package c1;
import java.util.Iterator;
import java.util.TreeSet;


public class  iterator2 {

    public static void main(String[] args) {
        TreeSet<Emp> tr = new TreeSet<>();
        Emp emp1 = new Emp(301, "Arun", 1000);
        Emp emp2 = new Emp(302, "Aayush", 2000);
        Emp emp3 = new Emp(303, "Abhimanyu", 3000);
        Emp emp4 = new Emp(304, "Akshay", 4000);
        Emp emp5 = new Emp(305, "Anmol", 5000);
        Emp emp6 = new Emp(306, "Ansh",6000);

        tr.add(emp1);
        tr.add(emp2);
        tr.add(emp3);
        tr.add(emp4);
        tr.add(emp5);
        tr.add(emp6);

        Iterator<Emp> em = tr.iterator(); 
        while(em.hasNext()){
        	Emp emp = em.next();
            System.out.println("ID :" + emp.getId());
            System.out.println("NAME :" + emp.getName());
            System.out.println("Salary :" + emp.getSalary());
            System.out.println("CNAME :" + Emp.getCname());
            System.out.println("==========================");
        }
    }
}



