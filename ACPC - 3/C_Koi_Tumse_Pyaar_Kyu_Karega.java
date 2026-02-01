import java.util.*;

public class C_Koi_Tumse_Pyaar_Kyu_Karega {
    public static void solve(Scanner sc, StringBuilder sb) {
        String s = sc.nextLine();
        String t = sc.nextLine();
        int i = 0;
        int j = 0;
        while (i < s.length() && j < t.length()) {
            char ch = s.charAt(i);
            if (ch == t.charAt(j)) i++;
            j++;
        }
        if (i == s.length()) sb.append("YES\n");
        else sb.append("NO\n");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            solve(sc, sb);
        }
        System.out.print(sb);
        sc.close();
    }
}
