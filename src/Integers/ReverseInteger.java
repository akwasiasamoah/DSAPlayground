package Integers;

public class ReverseInteger {
    public static int reverseInteger(int num) {
        int rev = 0;
        while (num != 0) {
            int lastDigit = num % 10;
            num /= 10;


            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && lastDigit > 7))
                return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && lastDigit < -8))
                return 0;

            rev = rev * 10 + lastDigit;
        }
        return rev;
    }

    public static void main(String[] args) {
        int reversedNumber = reverseInteger(21474836);
        System.out.println(reversedNumber);
    }
}
