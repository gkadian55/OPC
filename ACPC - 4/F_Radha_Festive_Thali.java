import java.util.*;

public class F_Radha_Festive_Thali {
    static int count = 0;
    public static void marker(int i, boolean[] marked, List<int[]> list) {
        marked[i] = true;
        for (int j = 0; j < list.size(); j++) {
            int[] nope = list.get(j);
            Arrays.sort(nope);
            if (nope[0] == i+1) marked[nope[1]-1] = true;
        }
    }
    public static void simulate(int[] arr, boolean[] marked, int i, int k, int S, List<int[]> list) {
        if (k == 0){
            if (S == 0) count++;
            return;
        }
        if (i == arr.length) return;
        if (marked[i]) {
            simulate(arr, marked, i+1, k, S, list);
            return;
        };
        simulate(arr, marked, i+1, k, S, list);
        boolean[] newmarked = marked.clone();
        marker(i, newmarked, list);
        simulate(arr, newmarked, i+1, k-1, S-arr[i], list);
    }
    public static void solve(Scanner sc, StringBuilder sb) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int S = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        boolean[] marked = new boolean[n];
        int m = sc.nextInt();
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < m; i++) list.add(new int[] {sc.nextInt(), sc.nextInt()});
        simulate(arr, marked, 0, k, S, list);
        sb.append(count + "\n");
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