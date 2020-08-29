package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract {
    // TODO -- start your code here
    int result;

    //Subtracting to integer value
    public void subtract (int valueOne, int valueTow) {
        result = valueOne - valueTow;
    }

    public String getResultString() {
        return String.valueOf(result);
    }
}
