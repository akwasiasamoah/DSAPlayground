package Integers;

public class SingleNumber {
    public static int singleNumber(int[] nums){
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,1,3,4};
        int singleNum = singleNumber(numbers);
        System.out.println(singleNum);
    }
}
