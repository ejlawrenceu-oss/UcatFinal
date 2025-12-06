
public class UCAT20_EvenNumbersGreaterThan20 {
    public static void main(String[] args) {
        int[] arr = {10, 22, 33, 24, 18, 40};
        for (int n : arr) {
            if (n % 2 == 0 && n > 20) System.out.println(n);
        }
    }
}
