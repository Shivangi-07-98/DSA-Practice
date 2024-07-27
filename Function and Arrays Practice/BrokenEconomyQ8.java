import java.util.*;

public class BrokenEconomyQ8 {
  public static void main(String[] args) {
    Scanner scn = new Scanner (System.in);
    int n = scn.nextInt();
    int [] arr = new int [n];
    for(int i = 0; i < n; i++){
      arr[i] = scn.nextInt();
    }
    int data = scn.nextInt();

    int left = 0;
    int right = arr.length - 1;
    int ceil = 0;
    int floor = 0;
    while(left <= right){
      int mid = (left + right) / 2;
      if (data < arr[mid]){
        ceil = arr[mid];
        right = mid - 1;
      }
      else if(data > arr[mid]){
        floor = arr[mid];
        left = mid + 1;
      }
      else{
        floor = arr[mid];
        ceil = arr[mid];
      }
    }

    System.out.println(floor);
    System.out.println(ceil);

  }
}

