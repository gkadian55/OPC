import java.util.*;

public class D_New_Year_Eve_Fireworks {
    public static void solve(Scanner sc, StringBuilder sb) {
        String str = sc.nextLine();
        int n = str.length();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (stack.isEmpty()) stack.push(ch);
            else if (stack.peek() == ch) stack.pop();
            else stack.push(ch); 
        }
        if (stack.isEmpty()) sb.append(1 + "\n");
        else sb.append(0 + "\n");
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
