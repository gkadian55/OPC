import java.util.*;

public class F_Paintress_Gommage {
    public static boolean isEvenPowerOf2(long number) {
        int n = (int) (Math.log(number) / Math.log(2));
        if (n % 2 == 0) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("");
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] values = new int[n];
            for (int i = 0; i < n; i++) {
                values[i] = sc.nextInt();
            }
            int count = 0;
            for (int i = 0; i < n; i++) {
                long product = 1;
                for (int j = i; j < n; j++) {
                    product *= values[j];
                    if (isEvenPowerOf2(product)) count++;
                }
            }
            sb.append(count).append("\n");
        }
        System.out.print(sb);
        sc.close();
    }
}
