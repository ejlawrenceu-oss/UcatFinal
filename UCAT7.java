
import java.util.Arrays;

public class UCAT7
 {
    public static void main(String[] args) {
        int[] arr = {-1, 2, -3, 4};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.abs(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
    }
}
