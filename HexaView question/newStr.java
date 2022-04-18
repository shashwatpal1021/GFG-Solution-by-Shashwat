public class newStr {
        public static void main(String[] args) {
            String s="anna";
            System.out.println(swap(s));
        }
        static String swap(String s){
    
            int n = s.length();
        char[] str = s.toCharArray();
        
        for (int i = 0; i < n / 2; i++) {
          int left = i;
          int right = n - left - 1;
          while (left < right) {
            if (str[left] == str[right]) {
              break;
            }
            else {
              right--;
            }
          }
          if (left == right) {
            return "-1";
          }
          else {
            for (int j = right; j < n - left - 1; j++) {
              char t = str[j];
              str[j] = str[j + 1];
              str[j + 1] = t;
            }
          }
        }
        String sb=str.Arrays.toString();
        return sb;            
        }
    }