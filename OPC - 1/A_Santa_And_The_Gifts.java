import java.util.*;

public class A_Santa_And_The_Gifts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int gifts = 1;
        boolean valid = false;
        if (n == 0) valid = true;
        else {
            for (int i = 1; gifts <= n; i++) {
                if (gifts == n) {
                    valid = true;
                    break;
                }
                gifts += (int) Math.pow(2, i);
            }
        }
        if (valid) System.out.println("YES");
        else System.out.println("NO");
        sc.close();
    }
}
