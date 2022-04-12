package Arrays.Left_Rootated_by_d;

public class Naive {
   public static void main(String[] args) {
      int arr[] = { 1, 2, 3, 4, 5 }, n = 5, d = 2;

      System.out.println("Before Rotation");

      for (int i = 0; i < n; i++) {
         System.out.print(arr[i] + " ");
      }

      System.out.println();

      leftRotate(arr, d, n);

      System.out.println("After Rotation");

      for (int i = 0; i < n; i++) {
         System.out.print(arr[i] + " ");
      }
   }

   static void lRotateOne(int[] arr, int n) {
      int temp = arr[0];
      for (int i = 1; i < arr.length; i++) {
         arr[i - 1] = arr[i];
      }
      arr[n - 1] = temp;
   }

   static void leftRotate(int[] arr, int d, int n) {
      for (int i = 0; i < d; i++) {
         lRotateOne(arr, n);
      }
   }
}
