
public class UCAT_12ValueAtLeastThreeTimes {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 2, 4};
        int target = 2, count = 0;
        for (int n : arr) {
            if (n == target) count++;
        }
        System.out.println(count >= 3 ? "Yes" : "No");
    }
}
