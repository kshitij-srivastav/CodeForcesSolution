import java.util.*;

public class A_Adding_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int test = sc.nextInt ();
        int test = 1;

        for (int j = 1; j <= test; j++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            boolean exist = false;
            for (int i = 0; i < 10; ++i) {
                if ((a * 10 + i) % b == 0) {
                    System.out.print(a * 10 + i);
                    for (int k = 1; k < n; ++k)
                        System.out.print(0);
                    exist = true;
                    break;
                }
            }
            if (!exist) {
                System.out.println("-1");
            }

        }

    }

    static int[] readArray(int a[]) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
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

    static int gcd(int a, int b) {

        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
}
