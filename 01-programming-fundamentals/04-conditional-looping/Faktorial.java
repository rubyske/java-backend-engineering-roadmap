public class Faktorial {
    public static void main(String[] args) {
        int n = 20;
        long result = 1;

        for (int i = n; i > 1; i--) {
            result *= i;
        }

        System.out.println(result);
    }
}
