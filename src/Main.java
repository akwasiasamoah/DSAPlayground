import Arrays.ArrayUtil;
import Arrays.RemoveEven;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//     ArrayUtil arrayDemo = new ArrayUtil();
//     arrayDemo.arrayDemo();

        RemoveEven removeEven = new RemoveEven();
        int[] response = removeEven.removeEven(new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20});
        for(int res : response) {
            System.out.println(res);
        }

    }
}