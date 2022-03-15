public class Leader {
   public static void main(String[] args) {
      int[] a = { 7, 10, 4, 10, 6, 5, 2 };
      leader(a);
   }

   static void leader(int[] a) {
      for (int i = 0; i < a.length; i++) {
         boolean flag = false;
         for (int j = i + 1; j < a.length; j++) {
            if (a[i] <= a[j]) {
               flag = true;
               break;
            }
         }
         if (flag == false) {
            System.out.print(a[i]+" ");
         }
      }
   }
}
