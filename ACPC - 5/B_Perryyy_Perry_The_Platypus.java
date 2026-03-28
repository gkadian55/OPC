import java.util.*;

public class B_Perryyy_Perry_The_Platypus {
    static int[][] dp;
    public static int simulate(int[] arr, int i, int d) {
        if (d == 0) return 0;
        if (d < 0 || i >= arr.length) return 10000001;
        if (dp[i][d] != -1) return dp[i][d];
        int take = 1 + simulate(arr, i, d-arr[i]);
        int skip = simulate(arr, i+1, d);
        return dp[i][d] = Math.min(take, skip);
    }
    public static void solve(Scanner sc, StringBuilder sb) {
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] arr = new int[n];
        dp = new int[n][d+1];
        for (int[] row : dp) Arrays.fill(row, -1);
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int ans = simulate(arr, 0, d);
        if (ans >= 10000001) sb.append(-1).append("\n");
        else sb.append(ans + "\n");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            solve(sc, sb);
        }
        System.out.print(sb);
        sc.close();
    }
}