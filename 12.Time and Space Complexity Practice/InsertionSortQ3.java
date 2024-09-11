import java.util.*;
public class InsertionSortQ3{
  public static void main (String [] args){
    Scanner scn = new Scanner (System.in);
    int n = scn.nextInt();
    int [] arr = new int [n];
    for(int i = 0; i < n; i++){
      arr[i] = scn.nextInt();
    }
    InsertionSort(arr, n);
  }

  public static void InsertionSort(int [] arr, int n){
    for(int i = 1; i <= n-1; i++){
      // int comp = i;
      for(int j = i-1; j >= 0; j--){
        if(arr[j] > arr[j+1]){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp; 
        }
      }
    }

    for(int i = 0; i < n; i++){
      System.out.print(arr[i] + " ");
    }
  }
}
