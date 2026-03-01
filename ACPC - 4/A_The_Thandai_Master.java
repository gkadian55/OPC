import java.util.*;

public class A_The_Thandai_Master {
    public static boolean possible(int[] arr, int i, int k, int sum) {
        if (sum == k) return true;
        if (i == arr.length) return false;
        sum += arr[i];
        if (possible(arr, i+1, k, sum)) return true;
        sum -= arr[i];
        if (possible(arr, i+1, k, sum)) return true;
        return false;
    }
    public static void solve(Scanner sc, StringBuilder sb) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        boolean possible = possible(arr, 0, k, 0);
        if (possible) sb.append("YES\n");
        else sb.append("NO\n");
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