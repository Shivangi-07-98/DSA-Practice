import java.util.*;
public class BubbleSortQ1{
  public static void main (String [] args){
    Scanner scn = new Scanner (System.in);
    int n = scn.nextInt();
    int [] arr = new int [n];
    for(int i = 0; i < n; i++){
      arr[i] = scn.nextInt();
    }

    BubbleSort(arr, n);
  }

  public static void BubbleSort(int [] arr, int n){
    for(int i = 1; i <= n-1; i++){
      for(int j = 0; j <= n-1-i; j++){
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
