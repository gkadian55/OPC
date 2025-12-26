import java.util.*;

public class E_Santa_Magic_Workshop_Progress_Bar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] tiles = new int[n];
        int k = sc.nextInt();
        int t = sc.nextInt();
        t = (t * n * k) / 100;
        int i = 0;
        while (t > 0) {
            if (t >= k) tiles[i] = k;
            else tiles[i] = t;
            t -= k;
            i++;
        }
        for (int a : tiles) System.out.print(a + " ");
        sc.close();
    }
}
