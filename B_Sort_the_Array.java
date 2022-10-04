import java.util.*;
import java.util.stream.Collectors;

public class B_Sort_the_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int test = sc.nextInt ();
        int test = 1;

        for (int t = 1; t <= test; t++) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }
            int b[] = a.clone();

            Arrays.sort(b);
            Map<Integer, Integer> map = new HashMap<>();
            for (int j = 0; j < n; j++) {
                map.put(b[j], j);
            }
            for (int i = 0; i < n; i++) {
                a[i] = map.get(a[i]);
            }
            System.out.println("after mapping a");
            printArray(a);
            int L = -1;
            for (int i = 0; i < n; i++) {
                if (a[i] != i) {
                    L = i;
                    break;
                }
            }
            int R = -1;
            for (int i = n - 1; i >= 0; i--) {
                if (a[i] != i) {
                    R = i;
                    break;
                }
            }
            if (L == -1 || R == -1) {
                System.out.println("yes");
                System.out.println("1 " + "1");
            } else {
                List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());

                // reverse(a + L, a + R + 1);
                Collections.reverse(list.subList(L, R + 1));
                a = list.stream().mapToInt(i -> i).toArray();
                Boolean ok = true;
                for (int i = 0; i < n; i++) {
                    if (a[i] != i) {
                        ok = false;
                    }
                }
                if (ok) {
                    System.out.println("yes");
                    System.out.println((L + 1) + " " + (R + 1));
                    // cout << L + 1 << " " << R + 1 << endl;
                } else {
                    System.out.println("no");
                }
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
