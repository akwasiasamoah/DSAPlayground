package Arrays;

public class FindMissingNumber {
    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1;
        int sum = n * (n + 1)/ 2;
        for (int num : arr) {
           sum = sum - num;
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] numbers = {
                1, 2, 3, 4, 5,
                6, 7, 8, 9, 10,
                11, 12, 13, 14, 15,
                16, 17, 18, 19, 20,
                22, 23, 24, 25
        };
        int missingNumber = findMissingNumber(numbers);
        System.out.println(missingNumber);
    }
}
