package Arrays.Left_Rootated_by_d;

import java.util.Scanner;

public class Reversal {
   public static void main(String args[]) {
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
   static void leftRotate(int[] arr,int d,int n){
      reverse(arr,0,d-1);
      reverse(arr,d,n-1);
      reverse(arr,0,n-1);
   }
   
   static void reverse(int arr[], int low, int high) {
      while (low < high) {
         int temp = arr[low];
         arr[low] = arr[high];
         arr[high] = temp;

         low++;
         high--;
      }
   }
}





Scanner s= new Scanner(System.in);
int diff=Math.abs(s.nextInt()*60+s.nextInt()+s.nextInt()*60+s.nextInt());

System.out.println("%02d",((diff/60)%24));
System.out.println(" ");
System.out.println("%02d",((diff%60)));