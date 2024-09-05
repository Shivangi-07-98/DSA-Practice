import java.util.*;
public class DisplayArrayInReverseQ2{
  public static void main (String [] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int [] a = new int [n];
    for(int i = 0; i < n; i++){
      a[i] = scn.nextInt();
    }
    DisplayArrayInReverse(a, n-1);
  }

  public static void DisplayArrayInReverse(int [] a, int n){
    if(n == 0){
      System.out.println(a[n]);
      return;
    }

    System.out.println(a[n]);
    DisplayArrayInReverse(a, n-1);
  }
}