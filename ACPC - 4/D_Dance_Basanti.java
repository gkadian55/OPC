import java.util.*;

public class D_Dance_Basanti {
    public static boolean isValid(String time) {
        int check = Integer.parseInt(time);
        if (check / 100 > 23 || check % 100 > 59) return false;
        return true;
    }
    public static void generate(int[] nums, boolean[] marked, StringBuilder time, List<String> valid) {
        if (time.length() == 4) {
            String maybe = time.toString();
            if (isValid(maybe)) valid.add(maybe);
            return;
        }
        for (int i = 0; i < 4; i++) {
            if (!marked[i]) {
                time.append(nums[i]);
                marked[i] = true;
                generate(nums, marked, time, valid);
                time.deleteCharAt(time.length()-1);
                marked[i] = false;
            }
        }
    }
    public static void solve(Scanner sc, StringBuilder sb) {
        int[] nums = new int[4];
        for (int i = 0; i < 4; i++) nums[i] = sc.nextInt();
        boolean[] marked = new boolean[4];
        StringBuilder time = new StringBuilder();
        List<String> valid = new ArrayList<>();
        generate(nums, marked, time, valid);
        if (valid.size() == 0) sb.append(-1);
        else {
            Collections.sort(valid);
            String ans = valid.get(valid.size()-1);
            sb.append(ans.substring(0, 2) + ":" + ans.substring(2));
        }
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
