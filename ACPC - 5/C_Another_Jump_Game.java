import java.util.*;

public class C_Another_Jump_Game {
    static int[][] dp;
    public static int jump(String[] strs, int i, int last) {
        if (i <= 0) return 0;
        if (dp[i][last] != -1) return dp[i][last];
        int ans = 10000001;
        for (int k = 0; k < strs[0].length(); k++) {
            int curr = Math.abs(strs[i-1].charAt(k) - strs[i].charAt(last)) + jump(strs, i-1, k);
            ans = Math.min(ans, curr);
        }
        return dp[i][last] = ans;
    }
    public static void solve(Scanner sc, StringBuilder sb) {
        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();
        String[] strs = new String[m];
        dp = new int[m][n];
        for (int[] row : dp) Arrays.fill(row, -1);
        for (int i = 0; i < m; i++) strs[i] = sc.nextLine();
        int ans = jump(strs, m-1, 0);
        sb.append(ans + "\n");
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