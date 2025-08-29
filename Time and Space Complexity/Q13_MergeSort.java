// O(nlogn)
import java.util.*;
public class Q13_MergeSort {
  public static void main(String[] args) {

    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = scn.nextInt();
    }

    int[] ans = mergeSort(arr, 0, arr.length - 1);
    for (int i = 0; i < ans.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static int[] mergeSort(int[] arr, int lo, int hi) {
    if (lo == hi) {
      int[] ba = new int[1];
      ba[0] = arr[lo];
      return ba;
    }

    int mid = (lo + hi) / 2;
    int[] fsh = mergeSort(arr, lo, mid);
    int[] ssh = mergeSort(arr, mid + 1, hi);
    int[] fsa = mergeTwoSortedArrays(fsh, ssh);

    return fsa;
  }

  public static int[] mergeTwoSortedArrays(int[] one, int[] two) {

    int[] ans = new int[one.length + two.length];

    // int i = 0, j = 0, k = 0;
    int i = 0;
    int j = 0;
    int k = 0;

    while (i < one.length && j < two.length) {
      if (one[i] < two[j]) {
        ans[k] = one[i];
        i++;
        k++;
      } else {
        ans[k] = two[j];
        j++;
        k++;
      }
    }

    while (j < two.length) {
      ans[k] = two[j];
      j++;
      k++;
    }
    while (i < one.length) {
      ans[k] = one[i];
      i++;
      k++;
    }

    return ans;
  }

}
