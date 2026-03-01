import java.util.*;

public class C_Holi_Colour_Packets {
    public static void subsetSum(int[] arr, int x, int i, int sum, int size, List<Integer> sizes) {
        if (sum == x) {
            sizes.add(size);
            return;
        }
        if (i == arr.length || sum > x) return;
        sum += arr[i];
        subsetSum(arr, x, i, sum, size+1, sizes);
        sum -= arr[i];
        subsetSum(arr, x, i+1, sum, size, sizes);
    }
    public static void solve(Scanner sc, StringBuilder sb) {
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        List<Integer> sizes = new ArrayList<>();
        subsetSum(arr, x, 0, 0, 0, sizes);
        if (sizes.size() == 0) sb.append(-1);
        else {
            int min = sizes.get(0);
            for (int i = 0; i < sizes.size(); i++) min = Math.min(min, sizes.get(i));
            sb.append(min);
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