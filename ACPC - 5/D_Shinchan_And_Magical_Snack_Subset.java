import java.util.*;

public class D_Shinchan_And_Magical_Snack_Subset {
    static List<Integer>[][] dp;
    public static List<Integer> generate(int[] arr, int i, int prev) {
        if (i == arr.length) {
            return new ArrayList<>();
        }
        if (dp[i][prev+1] != null) return dp[i][prev+1];
        List<Integer> take = new ArrayList<>();
        if (prev == -1 || arr[i] % arr[prev] == 0) {
            take.add(arr[i]);
            take.addAll(generate(arr, i+1, i));
        }
        List<Integer> skip = generate(arr, i+1, prev);
        List<Integer> ans = (take.size() > skip.size()) ? take : skip;
        return dp[i][prev+1] = ans;
    }
    public static void solve(Scanner sc, StringBuilder sb) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        dp = (ArrayList<Integer>[][]) new ArrayList[n+1][n+1];
        List<Integer> ans = generate(arr, 0, -1);
        sb.append(ans.size() + "\n");
        for (int a : ans) sb.append(a + " ");
        sb.append("\n");
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