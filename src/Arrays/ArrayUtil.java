package Arrays;

public class ArrayUtil {
   public void printArray(int[] array) {
      for (int i = 0; i < array.length; i++) {
         System.out.print(array[i] + " ");
      }
      System.out.println();
   }

   public void arrayDemo( ) {
       int[] array = new int[5];
       array[0] = 10;
       array[1] = 20;
       array[2] = 30;
       array[3] = 40;
       array[4] = 50;
       printArray(array);
       System.out.println(array.length);

   }
}
