package Arrays.Syntax;

public class Search {

   public static void main(String[] args) {
      int[] arr = { 20, 5, 7, 25 };
      int x = 25;

      System.out.println(search(arr, x));
   }

   static int search(int arr[],int x){
      for (int i = 0; i < arr.length; i++) {
         if (arr[i] == x) {
            return i;
         }
      }
      return -1;
   }
}
