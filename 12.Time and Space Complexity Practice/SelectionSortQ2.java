import java.util.*;
public class SelectionSortQ2{
  public static void main (String [] args){
    Scanner scn = new Scanner (System.in);
    int n = scn.nextInt();
    int [] arr = new int [n];
    for(int i = 0; i < n; i++){
      arr[i] = scn.nextInt();
    }

    SelectionSort(arr, n);
  }

  public static void SelectionSort(int [] arr, int n){
    for(int i = 0; i <= n-2; i++){
      for(int j = i+1; j <= n-1; j++){
        if(arr[i] > arr[j]){
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp; 
        }
      }
    }

    for(int i = 0; i < n; i++){
      System.out.print(arr[i] + " ");
    }
  }
}
