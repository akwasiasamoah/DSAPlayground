package Arrays;

public class Resize {
    public static int[] resize(int[] arr, int capacity) {
        int[] temp = new int[capacity];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

       return temp;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = {5,9,3,10};
        printArray(numbers);
        int[] res = resize(numbers, numbers.length * 2);
        printArray(res);

    }
}
