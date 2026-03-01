import java.util.*;

public class E_Last_One_With_The_Pichkari {
    public static void solve(Scanner sc, StringBuilder sb) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++) arr.add(i);
        int count = 0;
        int index = 0;
        while (arr.size() != 1) {
            count++;
            if (count == k) {
                count = 0;
                arr.remove(index);
                if (index == arr.size()) index = 0;
            }
            else index = (index + 1) % arr.size();
        }
        sb.append(arr.get(0));
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