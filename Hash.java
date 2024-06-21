package c1;


import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;



public class Hash {

    public static void main(String[] args) {
        HashSet<Emp> hs = new HashSet<>();
        Emp emp1 = new Emp(301, "Arun", 20000);
        Emp emp2 = new Emp(302, "Aayush", 30000);
        Emp emp3 = new Emp(303, "Abhimanyu", 25000);
        Emp emp4 = new Emp(304, "Akshay", 19000);
        Emp emp5 = new Emp(305, "Anmol", 45000);
        Emp emp6 = new Emp(306, "Ansh", 55000);

        hs.add(emp1);
        hs.add(emp2);
        hs.add(emp3);
        hs.add(emp4);
        hs.add(emp5);
        hs.add(emp6);

        Enumeration<Emp> em = Collections.enumeration(hs); 
        while(em.hasMoreElements()){
        	Emp emp = (Emp)em.nextElement();
            System.out.println("ID :" + emp.getId());
            System.out.println("NAME :" + emp.getName());
            System.out.println("Salary :" + emp.getSalary());
            System.out.println("CNAME :" + Emp.getCname());
            System.out.println("==========================");
        }
    }
}

