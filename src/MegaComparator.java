import java.util.Comparator;

/**
 * @author Samosonok Liliia
 * @version 1.0
 */

public class MegaComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee s1, Employee s2) {
        if (s1.salary != s2.salary) {
            return Double.compare(s1.salary, s2.salary);
        } else if (!s1.surname.equals(s2.surname)) {
            return s1.surname.compareTo(s2.surname);
        }
        return s1.name.compareTo(s2.name);
    }
}