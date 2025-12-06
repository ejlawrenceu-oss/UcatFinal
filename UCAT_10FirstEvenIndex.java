
public class UCAT_10FirstEvenIndex {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 2};
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                index = i;
                break;
            }
        }
        System.out.println("First even number index: " + index);
    }
}