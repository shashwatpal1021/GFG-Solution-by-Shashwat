import java.util.Scanner;

class HelloWorld {
   public static void main(String[] args) {

      Scanner in= new Scanner(System.in);
      String s=in.nextLine();
      
      if(ispalindrome(s)){
         System.out.println(s);
      }
      else{
         System.out.println(MakePalindrome(s));
      }
   }
      static boolean ispalindrome(String s){
         char[] arr=s.toCharArray();
         int i=0,j=arr.length-1;
         
         while(i<j){
            if(arr[i]==arr[j]){
               i++;
               j--;
               
            }else{
               return false;
            }
         }
         return true;
}

static String MakePalindrome(String s){
   char[] arr=s.toCharArray();
   int i=0,j=arr.length-1;
   String str2;
   while(i<j){
      if(arr[i] != arr[j]){
         if(arr[i+1]==arr[j]){
            char temp = arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;

            i++;
            j--;
         }else if(arr[i]==arr[j-1]){
            char temp = arr[j];
            arr[j]=arr[j-1];
            arr[j-1]=temp;
            i++;
            j--;
         }else if(arr[i+1]==arr[j-1] && i+1 != j-1){
            char temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp;

            temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;

           i++;
           j--;
         }else{
            str2 ="-1";
            return str2;
            
         }
      }else{
         i++;
         j--;
      }
   }
   str2 = String.valueOf(arr);
   return str2;
}
}
