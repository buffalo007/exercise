package hackerrank;

public class MyCalculator implements AdvanceArithmetic {


    @Override
    public int divisor_sum(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) total += i;
        }
        return total;
    }

}
