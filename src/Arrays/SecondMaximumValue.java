package Arrays;

public class SecondMaximumValue {
    public static int findSecondMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
                
            }
        }

        return secondMax;
    }

    public static void main(String[] args) {
        int[] numbers = {35,100,40,1,10,20,21,34,23,75,43,65,54,45,90};
        int secondMax = findSecondMax(numbers);
        System.out.println(secondMax);
    }
}
