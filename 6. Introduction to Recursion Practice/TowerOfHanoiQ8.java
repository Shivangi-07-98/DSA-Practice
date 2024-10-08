import java.io.*;
import java.util.*;
public class TowerOfHanoiQ8 {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); //3
        int n1 = scn.nextInt(); // 10 A
        int n2 = scn.nextInt(); // 11 B
        int n3 = scn.nextInt(); // 12 C
        toh(n, n1, n2, n3);
    }

    public static void toh(int n, int n1, int n2, int n3) {
        if (n == 0) {
            return;
        }
        toh(n - 1, n1, n3, n2); // line1
        System.out.println(n + "[" + n1 + " -> " + n2 + "]"); // line2
        toh(n - 1, n3, n2, n1); // line3
    }
}