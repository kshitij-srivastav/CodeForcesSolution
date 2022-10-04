import java.util.*;

public class B_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int test = sc.nextInt ();
        int test = 1;
        for (int i = 1; i <= test; i++) {
            int n = sc.nextInt();
            int a[] = new int[n];
            a = readArray(a);
            // for (int j = 0; j < n; j++) {
            // a[j] = sc.nextInt();
            // }
            TreeMap<Integer, Integer> map = new TreeMap<>();
            Arrays.sort(a);
            for (int j = 0; j < n; j++) {
                if (map.containsKey(a[j])) {
                    map.put(a[j], map.get(a[j]) + 1);
                } else {
                    map.put(a[j], 1);
                }
            }
            if (map.size() == 1) {
                System.out.println(0 + " " + (long) n * (n - 1) / 2);
            } else {
                System.out.println(
                        map.lastKey() - map.firstKey() + " " + (long) map.get(map.firstKey()) * map.get(map.lastKey()));
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
}
