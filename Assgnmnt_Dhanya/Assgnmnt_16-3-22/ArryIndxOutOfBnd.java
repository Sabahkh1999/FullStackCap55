import java.util.Arrays;
import java.util.Scanner;

public class ArryIndxOutOfBnd {
   public static void main(String args[]) {
      int[] myArray = {897, 56, 78, 90, 12, 123, 75};
      System.out.println("Elements in the array are:: ");
      System.out.println(Arrays.toString(myArray));
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the index of the required element ::");
      int element = sc.nextInt();
      System.out.println("Element in the given index is :: "+myArray[element]);
   }
}