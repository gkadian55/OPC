import java.util.*;

public class D_Santa_Magical_Numbers {
    public static boolean isPrime(int i, int[] arr) {
        if (arr[i] == 1) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder("");
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] primesUptoN = new int[n];
            for (int i = 2; i < n; i++) primesUptoN[i] = 1;
            for (int i = 2; i < n; i++) {
                if (primesUptoN[i] == 1) {
                    for (int j = i; j < n; j = j + i) {
                        if (i == j) continue;
                        primesUptoN[j] = 0;
                    }
                }
            }
            boolean harmony = false;
            boolean diversity = false;
            for (int i = 2; i < n; i++) {
                int rem = n - i;
                if (isPrime(i, primesUptoN) && isPrime(rem, primesUptoN)) {
                    harmony = true;
                    break;
                }
            }
            for (int i = 4; i < n; i++) {
                int rem = n - i;
                if (!isPrime(i, primesUptoN) && isPrime(rem, primesUptoN)) {
                    diversity = true;
                    break;
                }
            }
            if (harmony && diversity) sb.append("YES\n");
            else sb.append("NO\n");
        }
        System.out.print(sb);
        sc.close();
    }
}
