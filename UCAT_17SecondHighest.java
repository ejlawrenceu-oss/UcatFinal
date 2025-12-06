
public class UCAT_17SecondHighest {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 9, 7};
        int max = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int n : arr) {
            if (n > max) {
                second = max;
                max = n;
            } else if (n > second && n != max) {
                second = n;
            }
        }
        System.out.println("Second highest: " + second);
    }
}
