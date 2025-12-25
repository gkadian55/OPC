import java.util.*;

public class B_The_Grinch_Sticky_Gift_List {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("");
        String str = sc.nextLine();
        int k = sc.nextInt();
        int mistakes = 0;
        for (int i = 0; i < str.length(); i++) {
            char key = str.charAt(i);
            int j = i;
            while (j < str.length() && str.charAt(i) == str.charAt(j)) {
                j++;
            }
            if (j - i > 1) {
                mistakes++;
            }
            i = j - 1;
            sb.append(key);
        }
        if (mistakes <= k) System.out.println(sb);
        else System.out.println("NO\n");
        sc.close();
    }
}
