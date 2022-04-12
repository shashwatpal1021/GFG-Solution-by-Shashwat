package Arrays.Syntax;

public class Deletion {
   public static void main(String[] args) {
      int[] arr = { 3, 8, 12, 5, 6 };
      int x = 12;

      System.out.println("Before Deletion");
      for (int i = 0; i < arr.length; i++) {
         System.out.print(arr[i] + " ");
      }
      System.out.println();
      delteEle(arr, x);
      System.out.println("After Deletion");

      for (int i = 0; i < arr.length; i++) {
         System.out.print(arr[i] + " ");
      }
   }

   static int delteEle(int[] arr, int x) {
      int i = 0;
      for (i = 0; i < arr.length; i++) {
         if (arr[i] == x)
            break;
      }
      if(i == arr.length)
         return arr.length;

      for (int j = 0; j < arr.length; j++) {
         arr[j] = arr[j + 1];
      }
      return arr.length - 1;
   }
}
