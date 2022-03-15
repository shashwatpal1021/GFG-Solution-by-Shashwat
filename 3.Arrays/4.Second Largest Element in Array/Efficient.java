import java.util.Scanner;

public class Efficient {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] a = new int[n];
      for (int i = 0; i < a.length; i++) {
         a[i] = sc.nextInt();
      }
      int pos = secondlargest(a);
      System.out.println(a[pos]);
   }

   static int secondlargest(int[] a) {
      int largest = 0;
      int res = -1;

      for (int i = 1; i < a.length; i++) {
         if (a[i] > a[largest]) {
            res = largest;
            largest = i;
         } else if (a[i] != a[largest]) {
            if (res == -1 || a[i] > a[res])
               res = i;
         }
      }
      return res;
   }
}
