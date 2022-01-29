package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide {
    // TODO -- start your code here
    private int quotient = 0;
    private int remainder = 0;
    private Boolean divisionByZero = false;

    public Divide(int argumentOne, int argumentTwo) {
        if (argumentTwo == 0)
            divisionByZero = true;
        else {
            quotient = argumentOne / argumentTwo;
            remainder = argumentOne % argumentTwo;
        }
    }

    public String toString() {
        if (divisionByZero)
            return "Warning: division by zero is not possible";
        else
            return String.valueOf(quotient) + " R:" + String.valueOf(remainder);
    }
}
