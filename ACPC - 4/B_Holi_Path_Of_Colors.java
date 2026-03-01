import java.util.*;

public class B_Holi_Path_Of_Colors {
    public static void traverse(int[][] matrix, int i, int j, int sum, List<Integer> sizes) {
        if (i < 0 || j < 0) return;
        sum += matrix[i][j];
        if (i == 0 && j == 0) {
            sizes.add(sum);
            return;
        }
        traverse(matrix, i-1, j, sum, sizes);
        traverse(matrix, i, j-1, sum, sizes);
    }
    public static void solve(Scanner sc, StringBuilder sb) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        List<Integer> sizes = new ArrayList<>();
        traverse(matrix, n-1, m-1, 0, sizes);
        int max = sizes.get(0);
        for (int i = 0; i < sizes.size(); i++) max = Math.max(max, sizes.get(i));
        sb.append(max);
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