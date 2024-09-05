import java.util.*;
public class MaxOfAnArrayQ3{
  public static void main (String [] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int [] a = new int [n];
    for(int i = 0; i < n; i++){
      a[i] = scn.nextInt();
    }
    int ans = MaxOfAnArray(a, 0);
    System.out.println(ans);
  }

  public static int MaxOfAnArray(int [] a, int x){
    if(x == a.length-1){
      return a[x];
    }

    int max = MaxOfAnArray(a, x + 1);
    // int max = a[0];
    if(a[x] > max){
      max = a[x];
    }
    return max;
    
  }
}