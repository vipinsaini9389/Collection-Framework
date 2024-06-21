package c1;

import java.util.HashSet;

class Emp2 {
    public int id;
    public String name;
    public int salary;
    public static String cname = "Google";
    public Emp2(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static String getCname() {
        return cname;
    }

    public static void setCname(String cname) {
        Emp2.cname = cname;
    }
}

public class Collection {
    public static void main(String[] args) {
        HashSet<Emp2> hs = new HashSet<>();
        Emp2 al1 = new Emp2(1, "Vipin", 10000);
        Emp2 al2 = new Emp2(2, "Gaurav",20000);
        Emp2 al3 = new Emp2(3, "Vikal", 30000);
        Emp2 al4 = new Emp2(4, "Arjun", 40000);
        hs.add(al1);
        hs.add(al2);
        hs.add(al3);
        hs.add(al4);
        for (Emp2 emp : hs) {
        	System.out.println("========================");
            System.out.println("Id: " + emp.getId());
            System.out.println("Name: " + emp.getName());
            System.out.println("Salary: " + emp.getSalary());
            System.out.println( "Company Name: " + Emp2.getCname());
        }
    }
}
