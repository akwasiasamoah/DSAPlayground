package Arrays;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void moveZeros(int[] arr, int n) {
        int j = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] != 0  && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if(arr[j] != 0 ) {
                j++;
            }

        }
    }


    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = {1,4,0,5,10,0,43,32,0,91,0,31,24,57,0,93,0,65,74,0};
        printArray(numbers);

        moveZeros(numbers,numbers.length);
        printArray(numbers);
    }
}
