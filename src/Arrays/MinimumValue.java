package Arrays;

public class MinimumValue {
    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int findMinimum(int[] arr) {
        if(arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid input");
        }
        int min = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] numbers = {5,10,7,1,3,20,56,21,35,-1,45,12,14,100};
        printArray(numbers);
        int minimumNum = findMinimum(numbers);
        System.out.println(minimumNum);
    }
}
