package Integers;

public class PowerRaisedCalculation {
    public static double myPow(double base, int power) {
        long exponent = power;
        if(power < 0) {
            base = 1 /base;
            exponent = -exponent;
        }

        double result = 1;
        while(exponent > 0) {
            if(exponent % 2 == 1) {
                result = result * base;
            }

            base *= base;

            exponent /= 2;

        }

        return result;
    }


    public static void main(String[] args) {
        double powerRaised = myPow(4,8);
        System.out.println(powerRaised);
    }
}
