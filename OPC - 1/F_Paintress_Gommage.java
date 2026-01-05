import java.util.*;

public class F_Paintress_Gommage {
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
            int count = 0, even = 1, odd = 0, sum = 0;
            for (int a : values) {
                sum += a/2;
                if (sum % 2 == 0) {
                    count += even;
                    even++;
                }
                else {
                    count += odd;
                    odd++;
                }
            }
            sb.append(count).append("\n");
        }
        System.out.print(sb);
        sc.close();
    }
}
