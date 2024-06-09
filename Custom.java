//Q4:- Create An ArrayList of Custom Objects.

package Assignment;

import java.util.ArrayList;

public class Custom {
    static class Emp {
        public int id;
        public String name;
        public int salary;
        public String companyName;

        Emp(int id, String name, int salary, String companyName) {
            this.id = id;
            this.name = name;
            this.salary = salary;
            this.companyName = companyName;
        }
    }

    public static void main(String[] args) {
        ArrayList<Emp> list1 = new ArrayList<>();
        Emp emp1 = new Emp(101, "Sonu", 2255, "Google");
        Emp emp2 = new Emp(102, "Monu", 2245, "Google");
        list1.add(emp1);
        list1.add(emp2);

        for (Emp emp : list1) {
            System.out.println("ID: " + emp.id);
            System.out.println("Name: " + emp.name);
            System.out.println("Salary: " + emp.salary);
            System.out.println("Company Name: " + emp.companyName);
            System.out.println();
        }
    }
}
