
 public class UCAT4 {
     public static void main(String[] args) {
         int[] arr = {4, 2, 9, 1, 5};
         int min = arr[0], max = arr[0];
         for (int n : arr) {
             if (n < min) min = n;
            if (n > max) max = n;
         }
         System.out.println("Min: " + min + ", Max: " + max);
     }
}
