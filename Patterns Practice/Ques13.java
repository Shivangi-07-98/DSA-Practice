import java.util.*;
public class Ques13 {
  public static void main (String [] args){
    Scanner scn = new Scanner (System.in);
    int n = scn.nextInt(); // n = 6

    for(int i = 0; i < n; i++){
      int ncr = 1; // it is written inside for loop because we have to initialize ever row with 1 
      for(int j = 0; j <= i; j++){

        System.out.print(ncr + "\t");
        ncr = (ncr * (i-j))/(j+1); 

      }
      System.out.println();
    }

  }
}