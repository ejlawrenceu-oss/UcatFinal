
public class UCAT6 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0, count = 0;
        for (int n : arr) {
            if (n % 2 != 0) {
                sum += n;
                count++;
            }
        }
        double avg = count == 0 ? 0 : (double) sum / count;
        System.out.println("Average of odd numbers: " + avg);
    }
}
  