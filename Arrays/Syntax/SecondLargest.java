package Arrays.Syntax;

public class SecondLargest {
   public static void main(String[] args) {
      int[] arr = { 5, 4, 6, 3, 7, 2, 8, 1, 9 };
      int n = secondLargest(arr);
      System.out.println(n);
   }

   static int secondLargest(int[] arr) {
      int largest = 0;
      int res = -1;
      for (int i = 0; i < arr.length; i++) {
         if (arr[i] > arr[largest]) {
            res = arr[largest];
            largest = i;
         } else if (arr[i] != arr[largest]) {
            if (res == -1 || arr[i] > arr[res]) {
               res = arr[i];
            }
         }
      }
      return res;
   }
}
