// O(n^2)
import java.io.*;
import java.util.*;

public class Q1_BubbleSort {
  public static void main(String[] args) throws Exception {

    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt(); // 5
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = scn.nextInt(); // 20 30 90 40 10
    }

    // Bubble Sort: Compare next element and swap, largest element reaches the end of the array
    for (int i = 1; i < n; i++) { // 1, 2, 3, 4
      for (int j = 0; j <= n - 1 - i; j++) { // 0-3, 0-2, 0-1, 0-0
        // 1(0-3) 2(0-2) 3(0-1) 4(0-0)
        if (arr[j + 1] < arr[j]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }

    // Print sorted array
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
// ques - arrow starting mai rahega aur apne se aage wale se compare hoga
// aur jo chhote hai piche unko aage krna 
// aise 0-4 (for 5 elements) ke liye arrow 3 pr rukega fir 2, 1, 0 aur aise saare elements last mai hote jayenge 
// but ye inner loop 5 elements ke liye 4 baar chlega
// eg- 20 30 90 40 10 ke liye 
// 1st inner loop mai 90 piche hua then 40, 30, 20 aur last element apne aap sorted tha