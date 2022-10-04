import java.util.*;

public class B_Optimal_Reduction {

    static int N = 1000000;
    static int[] a = new int[N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        for (int i = 1; i <= test; i++) {
            int n = sc.nextInt();
            // int a[] = new int[n];
            a = readArray(a, n);
            int preLen = 1;
            while (preLen < n && a[preLen] <= a[preLen + 1])
                preLen++;

            int sufLen = 1;
            while (sufLen < n && a[n - sufLen] >= a[n - sufLen + 1])
                sufLen++;
            if (preLen + sufLen >= n)
                System.out.println("YES");
            else
                System.out.println("NO");
        }

    }

    static int[] readArray(int a[], int n) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        return a;
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
