import java.util.*;
public class TargetSumPairQ4 {
  public static void main (String[] args){
    Scanner scn = new Scanner (System.in);
    int n = scn.nextInt();
    int t = scn.nextInt();

    int [] arr = new int [n];
    for(int i = 0; i < n; i++){
      arr[i] = scn.nextInt();
    }

    Arrays.sort(arr);
    // for(int i = 0; i < n; i++){
    //   System.out.print(arr[i] + " ");
    // }


    // now arrays are sorted

    int i = 0;
    int j = arr.length-1;
    while (i < j) {
      if(arr[i] + arr[j] > t){
        j--;
      }
      else if(arr[i] + arr[j] < t){
        i++;
      }
      else if(arr[i] + arr[j] == t){
        System.out.println(arr[i] + " " + arr[j]);
        i++;
        j--;
      }
    }
  }
}
