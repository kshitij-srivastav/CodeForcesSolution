import java.util.*;

public class B_Suit_and_Tie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        for (int k = 1; k <= test; k++) {
            int n = sc.nextInt();
            int a[] = new int[n * 2 + 1];
            for (int j = 0; j < n * 2; j++) {
                a[j] = sc.nextInt();
            }
            int ans = 0;
            for (int i = 1; i <= n; i++) {
                if (a[i] != 0) {
                    int j;
                    for (j = i + 1;; j++) {
                        if (a[j] != a[i] && a[j] != 0) {
                            ans++;
                        } else if (a[j] == a[i]) {
                            break;
                        }
                    }
                    a[j] = 0;
                }
            }
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
