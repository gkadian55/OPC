import java.util.*;

public class C_New_Year_Bitwise_Bash {
    public static void solve(Scanner sc, StringBuilder sb) {
        int n = sc.nextInt();
        int count0 = 0;
        int value = 0;
        for (int i = 0; i < n; i++) {
            int power = sc.nextInt();
            if (power == 0) count0++;
            value = value ^ power;
        }
        if (count0 == n) sb.append(-1).append("\n");
        else if (value == 0) sb.append(1 + "\n");
        else sb.append(0 + "\n");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1;
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            solve(sc, sb);
        }
        System.out.print(sb);
        sc.close();
    }
}

