package Integers;

public class FactorialTrailingZeros {
    public static int trailingZeros(int n) {
        int count = 0;
        while(n > 0) {
            n /= 5;
            count += n;
        }

        return count;
    }

    public static void main(String[] args) {
        int count = trailingZeros(504342);
        System.out.println(count);
    }
}
