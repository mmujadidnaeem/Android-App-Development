package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply {
    // TODO -- start your code here

    int result;

    //Multiplying to integer value
    public void multiply (int valueOne, int valueTow) {
        result = valueOne * valueTow;
    }

    public String getResultString() {
        return String.valueOf(result);
    }
}
