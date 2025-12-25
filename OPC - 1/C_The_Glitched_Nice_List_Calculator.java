import java.util.*;

public class C_The_Glitched_Nice_List_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        StringBuilder sb = new StringBuilder("");
        int p1 = a.length() - 1;
        int p2 = b.length() - 1;
        int max = Math.max(a.length(), b.length());
        int[] arr = new int[max];
        for (int i = 0; i < max; i++) {
            int n1 = (p1 >= 0) ? a.charAt(p1) - '0' : 0;
            int n2 = (p2 >= 0) ? b.charAt(p2) - '0' : 0;
            arr[i] = n1 + n2;
            p1--;
            p2--;
        }
        for (int i = max - 1; i >= 0; i--) {
            sb.append(arr[i]);
        }
        System.out.println(sb);
        sc.close();
    }
}
