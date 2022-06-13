package structural.compostie;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    public String name;
    public String department;
    public List<Employee> subordinates = new ArrayList<>();

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public void add(Employee employee) {
        subordinates.add(employee);
    }

    public void remove(Employee employee) {
        subordinates.remove(employee);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", subordinates=" + subordinates +
                '}';
    }
}
