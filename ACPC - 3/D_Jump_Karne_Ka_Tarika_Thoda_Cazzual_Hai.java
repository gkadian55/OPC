import java.util.*;

public class D_Jump_Karne_Ka_Tarika_Thoda_Cazzual_Hai {
    public static void solve(Scanner sc, StringBuilder sb) {
        int n = sc.nextInt();
        int[] potholes = new int[n];
        for (int i = 0; i < n; i++) potholes[i] = sc.nextInt();
        int i = 0;
        int j = n-1;
        int jump = 0;
        while (i < j) {
            if (potholes[i] <= potholes[j]) {
                jump = Math.max(jump, j - i);
                j--;
            }
            else i++;
        }
        sb.append(jump + "\n");
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