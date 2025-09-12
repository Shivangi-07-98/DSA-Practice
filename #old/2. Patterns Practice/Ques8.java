import java.util.*;
public class Ques8 {
  public static void main (String [] args){

    Scanner scn = new Scanner (System.in);
    int n = scn.nextInt();

    for(int i = 1; i <= n; i++){

      for(int j = 1; j <= n; j++){
        // if(j == n-i+1){
          if(n+1 == i+j){
          System.out.print("*\t");
        }
        else{
          System.out.print("\t");
        }
        
      }
      System.out.println();
    }
  }
}