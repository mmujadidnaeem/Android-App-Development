package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add {
    // TODO -- start your code here
    int result;

    //Adding to integer value
    public void add (int valueOne, int valueTow) {
        result = valueOne + valueTow;
    }

    public String getResultString() {
        return String.valueOf(result);
    }
}
