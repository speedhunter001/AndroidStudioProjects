package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract {
    // TODO -- start your code here
    private int subtractResult;

    public Subtract(int argumentOne, int argumentTwo) {
        if (argumentOne >= argumentTwo)
            subtractResult = argumentOne - argumentTwo;
        else
            subtractResult = argumentTwo - argumentOne;
    }

    public String toString() {
        return String.valueOf(subtractResult);
    }
}
