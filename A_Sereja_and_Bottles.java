import java.util.*;

public class A_Sereja_and_Bottles {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // int test = sc.nextInt ();
    int test = 1;

    for (int i = 1; i <= test; i++) {

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
