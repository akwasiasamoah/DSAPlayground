package Arrays;

public class ReverseArray {
    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void reverse(int[] numbers,int start, int end) {
        while(start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,10,5,9,6,11,20,30};
        printArray(numbers);
        reverse(numbers,0,numbers.length - 1);
        printArray(numbers);
    }
}
