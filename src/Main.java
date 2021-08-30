import java.util.*;

/**
 * @author Samosonok Liliia
 * @version 1.0
 */

public class Main {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Freddie", "Mercury", 25000.00));
        employees.add(new Employee("Paul", "McCartney", 20000.00));
        employees.add(new Employee("Joseph", "McCartney", 20000.00));
        employees.add(new Employee("David", "Bowie", 23000.00));

        Collections.sort(employees);
        System.out.println(employees);
        SalaryComparator comparator = new SalaryComparator();
        employees.sort(comparator);
        System.out.println(employees);
        MegaComparator comparator2 = new MegaComparator();
        employees.sort(comparator2);
        System.out.println(employees);
    }
}