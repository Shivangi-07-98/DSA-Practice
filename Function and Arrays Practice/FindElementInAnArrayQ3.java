import java.util.*;
public class FindElementInAnArrayQ3 {
  public static void main (String [] args){
    Scanner scn = new Scanner (System.in);
    int n = scn.nextInt();
    int [] arr = new int [n];
    for(int i = 0; i < n; i++){
      arr[i] = scn.nextInt();
    }
    int d = scn.nextInt();

    for(int i = 0; i < n; i++){
      if(arr[i] == d){
        System.out.println("index is " + i);
      }
    }

  }
}
