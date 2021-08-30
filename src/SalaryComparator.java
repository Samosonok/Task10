import java.util.Comparator;

/**
 * @author Samosonok Liliia
 * @version 1.0
 */

public class SalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee s1, Employee s2) {
        return Double.compare(s1.salary, s2.salary);
    }
}