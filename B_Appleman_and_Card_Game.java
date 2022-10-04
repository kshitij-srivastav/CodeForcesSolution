import java.util.*;

public class B_Appleman_and_Card_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int test = sc.nextInt ();
        int test = 1;

        for (int i = 1; i <= test; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            HashMap<Character, Integer> map = new HashMap<>();
            for (int j = 0; j < n; j++) {
                char c = s.charAt(j);
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }
            long ans = 0;
            pair p[] = new pair[map.size()];
            int j = 0;
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                p[j] = new pair(entry.getKey(), entry.getValue());
                j++;
            }
            Arrays.sort(p, (p1, p2) -> p2.count - p1.count);
            for (int l = 0; l < p.length; l++) {
                if (k >= p[l].count) {
                    ans += (long) p[l].count * p[l].count;
                    k -= p[l].count;
                } else {
                    ans += (long) k * k;
                    break;
                }
            }
            System.out.println(ans);

            // sort map on basis of value
            // List<Map.Entry<Character, Integer>> list = new LinkedList<>(map.entrySet());
            // Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            // @Override
            // public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character,
            // Integer> o2) {
            // return o2.getValue().compareTo(o1.getValue());
            // }
            // });
            // long ans = 0;
            // for (Map.Entry<Character, Integer> entry : list) {
            // if (k >= entry.getValue()) {
            // ans += (long)entry.getValue() * entry.getValue();
            // k -= entry.getValue();
            // } else {
            // ans +=(long) k * k;
            // k = 0;
            // }
            // }
            // System.out.println(ans);
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

    static class pair {
        char c;
        int count;

        pair(char c, int count) {
            this.c = c;
            this.count = count;
        }
    }
}
