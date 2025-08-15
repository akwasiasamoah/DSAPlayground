package Integers;

public class PalindromeNumber {
    public static boolean palindromeNumber(Integer num) {
        char[] numArray = num.toString().toCharArray();
        int start = 0;
        int end = numArray.length - 1;
        while(start < end) {
            if(numArray[start] != numArray[end]) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static boolean palindromeNumber(int num) {
        if (num < 0) return false;
        int original = num;
        int reversed = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            reversed = reversed * 10 + lastDigit;
            num /= 10;
        }

        return original == reversed;

    }

    public static void main(String[] args) {
        boolean isPalindrome = palindromeNumber(-1881);
        boolean isPalindromeAnotherApproach = palindromeNumber(11);
        System.out.println(isPalindrome);
        System.out.println(isPalindromeAnotherApproach);
    }
}
