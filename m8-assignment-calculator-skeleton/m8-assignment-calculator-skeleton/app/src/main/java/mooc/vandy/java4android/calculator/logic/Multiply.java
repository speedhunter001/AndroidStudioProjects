package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply {
    // TODO -- start your code here
    private int multiplicationResult = 0;

    public Multiply(int argumentOne, int argumentTwo) {
        multiplicationResult = argumentOne * argumentTwo;
    }

    public String toString() {
        return String.valueOf(multiplicationResult);
    }
}
