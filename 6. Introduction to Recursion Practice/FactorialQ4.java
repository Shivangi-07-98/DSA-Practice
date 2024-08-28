import java.io.*;
import java.util.*;

// if 5 is n then it should print 120 why 5*4*3*2*1
public class FactorialQ4 {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = factorial(n);
        System.out.println(ans);
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int a = factorial(n - 1);
        int ans = n * a;
        return ans;

    }

}