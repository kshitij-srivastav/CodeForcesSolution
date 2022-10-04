import java.util.*;

public class A_Crossmarket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        for (int i = 1; i <= test; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            System.out.println(n + m + Math.min(n, m) - 3 + Math.min(Math.max(n, m) - 1, 1));
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
