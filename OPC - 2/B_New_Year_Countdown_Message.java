import java.util.*;

public class B_New_Year_Countdown_Message {
    public static void solve(Scanner sc, StringBuilder sb, ArrayDeque<Integer> queue) {
        String username = sc.next();
        int t = sc.nextInt();
        while (!queue.isEmpty() && queue.peek() < t - 2025) queue.poll();
        queue.add(t);
        sb.append(queue.size() + "\n");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            solve(sc, sb, queue);
        }
        System.out.print(sb);
        sc.close();
    }
}
