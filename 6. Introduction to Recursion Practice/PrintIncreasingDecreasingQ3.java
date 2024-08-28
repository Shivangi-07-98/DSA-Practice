import java.util.*;

public class PrintIncreasingDecreasingQ3 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    PrintIncreasingDecreasing(n);
  }

  public static void PrintIncreasingDecreasing(int n) {
    if (n == 0) {
      return;
    }
    System.out.println(n);
    PrintIncreasingDecreasing(n - 1);
    System.out.println(n);
  }

}