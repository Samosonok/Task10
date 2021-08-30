
/**
 * @author Samosonok Liliia
 * @version 1.0
 */

public class IdGenerator {

    private static int nextId = 1;

    public static int newId() {
        return nextId++;
    }
}