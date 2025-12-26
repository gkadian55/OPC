import java.util.*;

public class D_Santa_Magical_Numbers {
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder("");
        while (t-- > 0) {
            int n = sc.nextInt();
            boolean harmony = false;
            boolean diversity = false;
            if (n >= 6) {
                if (n % 2 == 0) harmony = true;
                else {
                    int check = n - 2;
                    if (isPrime(check)) harmony = true;
                }
                diversity = true;
            }
            if (harmony && diversity) sb.append("YES\n");
            else sb.append("NO\n");
        }
        System.out.print(sb);
        sc.close();
    }
}
