import java.io.*;
import java.util.*;
public class DisplayArrayQ1 {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }
        displayArr(a, n-1);
    }

    public static void displayArr(int [] a, int n){
        if(n == 0){
            System.out.println(a[n]);
            return;
        }

        displayArr(a, n-1);
        System.out.println(a[n]);

    }

}