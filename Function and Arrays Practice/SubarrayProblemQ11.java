import java.util.*;
public class SubarrayProblemQ11 {
  public static void main (String [] args) {
    Scanner scn = new Scanner (System.in);
    int n = scn.nextInt();
    // String n = scn.nextLine();

    int [] arr = new int [n];
    for(int i = 0; i < n; i++){
      arr[i] = scn.nextInt();
    }

    for(int i = 0; i < n; i++){
      for(int j = i; j < n; j++){
        for(int k = i; k <= j; k++){
          System.out.print(arr[k]);
        }
        System.out.println();
      }
    }


  }
  
}
