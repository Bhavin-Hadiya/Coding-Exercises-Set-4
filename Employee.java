import java.util.*;

class Employee {
    String name;
    String dept;

    void setData(String n, String d) {
        name = n;
        dept = d;
    }

    void displayDetails() {
        System.out.println(name);
        System.out.println(dept);
    }
}

class Manager extends Employee {
    int teamSize;
    String project;

    void setManagerData(String n, String d, int t, String p) {
        name = n;
        dept = d;
        teamSize = t;
        project = p;
    }

    void displayDetails() {
        System.out.println(name);
        System.out.println(dept);
        System.out.println(teamSize);
        System.out.println(project);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();
        Manager m = new Manager();

        e.setData("A", "HR");
        m.setManagerData("B", "IT", 5, "X");

        e.displayDetails();
        m.displayDetails();

        Employee ref = new Manager();
        ref.setData("C", "Sales");
        ref.displayDetails();
    }
}