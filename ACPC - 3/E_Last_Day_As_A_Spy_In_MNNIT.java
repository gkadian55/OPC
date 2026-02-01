import java.util.*;

public class E_Last_Day_As_A_Spy_In_MNNIT {
    public static void solve(Scanner sc, StringBuilder sb) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int initial = arr[0];
        int q = sc.nextInt();
        while (q-- > 0) {
            int d = sc.nextInt();
            int steps = -1;
            int left = 1;
            int right = n - 1;
            int dest = n - 1;
            boolean exists = false;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (arr[mid] - initial >= d) {
                    exists = true;
                    dest = mid;
                    right = mid - 1;
                }
                else left = mid + 1;
            }
            if (exists) steps = dest / 2 + dest % 2 + 1;
            sb.append(steps + " ");
        }
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
