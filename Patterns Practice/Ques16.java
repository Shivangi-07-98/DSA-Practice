import java.util.*;
public class Ques16 {
  public static void main (String [] args){
    Scanner scn = new Scanner (System.in);
    int n = scn.nextInt();
    int sp = n + 2;

    for(int i = 1; i <= n; i++){
      int val = 1;
      int hz = val;
      for(int j = 1; j <= i; j++){
        System.out.print(hz + "\t");
        val++;

        if(j <= 2*n-1/2){
          hz++;
        }
        else{
          hz--;
        }
      }
      for(int j = 1; j <= sp; j++){
        System.out.print("\t");
      }
      int st = i;
      if(i == n){
        st = st-1;
      }
      for(int j = 1; j <= st; j++){
        System.out.print(hz + "\t");
        val++;

        if(j <= 2*n-1/2){
          hz++;
        }
        else{
          hz--;
        }
        
        
      }

      System.out.println();
      sp -= 2;
      
    }

    }
  }