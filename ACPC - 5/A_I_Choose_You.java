import java.util.*;

public class A_I_Choose_You {
    public static void solve(Scanner sc, StringBuilder sb) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] gary = new int[n];
        int[] ash = new int[m];
        for (int i = 0; i < n; i++) gary[i] = sc.nextInt();
        for (int i = 0; i < m; i++) ash[i] = sc.nextInt();
        Arrays.sort(gary);
        Arrays.sort(ash);
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < n && j < m) {
            if (gary[i] < ash[j]) {
                count++;
                i++;
                j++;
            }
            else j++;
        }
        sb.append(count + "\n");
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