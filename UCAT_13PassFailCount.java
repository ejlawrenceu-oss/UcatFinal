public class UCAT_13PassFailCount {
    public static void main(String[] args) {
        int[] grades = {80, 60, 90, 70, 85};
        int pass = 0, fail = 0;
        for (int g : grades) {
            if (g >= 75) pass++;
            else fail++;
        }
        System.out.println("Passed: " + pass + ", Failed: " + fail);
    }
}


