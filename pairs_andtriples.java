import java.util.*;

public class pairs_andtriples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int test = sc.nextInt();
        int test = 1;

        for (int i = 1; i <= test; i++) {
            String s = sc.next();
            if (s.equals("55"))
                System.out.println("True");
            else
                System.out.println("False");
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
