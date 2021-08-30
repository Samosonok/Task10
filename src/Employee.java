
/**
 * @author Samosonok Liliia
 * @version 1.0
 */

public class Employee implements Comparable<Employee> {

    int id;
    String name;
    String surname;
    double salary;

    public Employee(String name, String surname, double salary) {
        this.id = IdGenerator.newId();
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee employees) {
        return this.id - employees.id;
    }

    @Override
    public String toString() {
        return "Employee{ " +
                "id: " + id +
                ", name: " + name + '\'' +
                ", surname: " + surname + '\'' +
                ", salary: $" + salary +
                '}';
    }
}