package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add {
    // TODO -- start your code here
    private int addResult = 0;

    public Add(int argumentOne, int argumentTwo) {
        addResult = argumentOne + argumentTwo;
    }

    public String toString() {
        return String.valueOf(addResult);
    }
}
