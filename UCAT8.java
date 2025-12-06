import java.util.Arrays;

public class UCAT8
 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3};
        int[] B = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            B[i] = A[i];
        }
        System.out.println(Arrays.toString(B));
    }
}
