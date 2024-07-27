import java.util.*;
public class ReverseAnArrayQ7 {
  public static void main (String [] args){
    Scanner scn = new Scanner (System.in);
    int n = scn.nextInt();

    int [] arr = new int [n];
    for(int i = 0; i < n; i++){
      arr[i] = scn.nextInt();
    }

    int left = 0;
    int right = arr.length-1;
    while(left < right){
      int temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;

      left++;
      right--;
    }

    for(int i = 0; i < arr.length; i++){
      // System.out.print(arr[i] + "\t");
      System.out.print(arr[i] + " ");
    }
  }
}