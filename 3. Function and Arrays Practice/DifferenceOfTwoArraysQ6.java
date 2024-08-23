import java.util.*;
public class DifferenceOfTwoArraysQ6 {
  public static void main (String [] args){
    Scanner scn = new Scanner (System.in);

    int n1 = scn.nextInt();
    int [] a1 = new int [n1];
    for(int i = 0; i <= n1; i++){
      a1[i] = scn.nextInt();
    }

    int n2 = scn.nextInt();
    int [] a2 = new int [n2];
    for(int i = 0; i <= n2; i++){
      a2[i] = scn.nextInt();
    }

    int [] ans = new int [n1];

    int i = a1.length-1;
    int j = a2.length-1;
    int k = ans.length-1;

    int carry = 0;

    while(k >= 0){
      int digit = a1[i] - carry;
      
      if(j >= 0){
        digit = digit - a2[j];
      }

      if (digit < 0){
        digit = digit + 10;
        carry = 1;
      }
      else{
        carry = 0;
      }

      ans[k] = digit;

      i--;
      j--;
      k--;
    }

    for(int x = 0; x <= ans.length; x++ )
    System.out.print(ans[x]);

  }
}
