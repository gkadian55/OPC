import java.util.*;

public class A_New_Year_Firework_Allocation {
    public static void solve(Scanner sc, StringBuilder sb) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) pq.add(sc.nextInt());
        long beauty = 0;
        while (k-- > 0) {
            int burst = pq.poll();
            beauty += burst;
            pq.add(burst/2);
        }
        sb.append(beauty + "\n");
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
