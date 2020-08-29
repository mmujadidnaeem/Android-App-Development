package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide {
    // TODO -- start your code here
    int quotient;
    int remainder;
    String resultString;

    public void divide(int valueOne, int valueTow) {

        // try dividing arg1 and arg2
        // if 0 is passed as the arg2
        // then throw an exception
        try {

            quotient = valueOne/valueTow;
            remainder = valueOne % valueTow;

            resultString = String.valueOf(quotient) + " R: " + remainder;


        } catch (ArithmeticException e) {

            resultString = "Division by zero not allowed.";
        }
    }

    public String getResultString() {
        return resultString;
    }

}
