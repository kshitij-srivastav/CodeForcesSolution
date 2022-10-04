import java.util.*;

public class B_Effective_Approach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int test = sc.nextInt ();
        int test = 1;

        for (int i = 1; i <= test; i++) {

            int n = sc.nextInt();
            int a[] = new int[n];
            String s = "";
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
                s = s + a[j];
            }
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                list.add(a[j]);
            }
            int m = sc.nextInt();
            int b[] = new int[m];
            // System.out.println(s);

            int ans1 = 0, ans2 = 0;
            for (int j = 0; j < m; j++) {
                b[j] = sc.nextInt();
                ans1 = ans1 + list.indexOf(b[j]) + 1;
                ans2 = ans2 + (n - s.indexOf(b[j]));

            }
            System.out.println(ans1 + " " + ans2);

        }

    }

    static void readArray(int a[]) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
    }

    static void printArray(int a[]) {
        for (int x : a) {
            System.out.print(x + " ");
        }
    }

    static int[] listToArray(ArrayList<Integer> a1) {
        int[] arr = a1.stream().mapToInt(i -> i).toArray();

        return arr;
    }
}
