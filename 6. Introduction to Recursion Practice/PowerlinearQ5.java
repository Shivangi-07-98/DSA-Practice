import java.io.*;
import java.util.*;

// 2, 5 toh 2 raise to the power 5 i.e. 32
public class PowerlinearQ5 {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt(); //2
        int n = scn.nextInt(); //5
        int ans = power(x, n);
        System.out.println(ans);
    }

    public static int power(int x, int n){

        if(n == 1){
            return x;
        }
        int a = power(x, n-1);
        int ans = x * a;

        return ans;
    }

    
}