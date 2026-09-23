public class Factorial {

    public static long calculate(int n) {
        //throw exception
        

        if (n < 0) {
            throw new IllegalArgumentException("Negative number");
        }

        long result = 1;

        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}