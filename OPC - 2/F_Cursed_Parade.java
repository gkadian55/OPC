import java.util.*;

public class F_Cursed_Parade {
    public static void solve(Scanner sc, StringBuilder sb) {
        int n = sc.nextInt();
        long[] prefix = new long[n+1];
        for (int i = 1; i < n+1; i++) {
            prefix[i] = prefix[i-1] + sc.nextInt();
        }
        long k = sc.nextLong();
        boolean found = false;
        int length = Integer.MAX_VALUE;
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i <= n; i++) {
            while (!queue.isEmpty()) {
                int start = queue.peekFirst();
                if (prefix[i] - prefix[start] >= k) {
                    length = Math.min(length, i - start);
                    found = true;
                    queue.pollFirst();
                }
                else break;
            }
            while (!queue.isEmpty() && prefix[i] <= prefix[queue.peekLast()]) queue.pollLast();
            queue.add(i);
        }
        if (found) sb.append(length + "\n");
        else sb.append(-1).append("\n");
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
