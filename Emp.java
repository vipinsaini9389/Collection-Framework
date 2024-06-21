package c1;

public class Emp implements Comparable<Emp> {
    private int id;
    private String name;
    private int salary;
    private static String cname = "Google";

    public Emp(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Emp em) {
        if (id > em.getId())
            return 1;
        else if (id < em.getId())
            return -1;
        else
            return 0;
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
        Emp.cname = cname;
    }

	
}
