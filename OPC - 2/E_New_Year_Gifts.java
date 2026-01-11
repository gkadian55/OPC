import java.util.*;

public class E_New_Year_Gifts {
    public static void solve(Scanner sc, StringBuilder sb) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] beauties = new int[n];
        int beauty;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a == 0) beauty = 0;
            else {
                int b = a;
                beauty = -1;
                while (a > 0) {
                    if ((a & 1) == 1 && ((a >> 1) & 1) == 0) beauty++;
                    a = a >> 1;
                }
                while (b > 0) {
                    if ((b & 1) == 0 && ((b >> 1) & 1) == 1) beauty++;
                    b = b >> 1;
                }
            }
            beauties[i] = beauty;
        }
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
