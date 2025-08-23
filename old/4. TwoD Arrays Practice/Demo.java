import java.util.*;
public class Demo {
  public static void main (String [] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt(); // arr.length
    int m = scn.nextInt(); // arr[0].length

    // oneD array
    // int [] oneD = new int [n];
    // for(int i = 0; i < n; i++){
    //   oneD[i] = scn.nextInt();
    // }
    
    // twoD array
    int [][] twoD = new int [n][m];
    for(int i = 0; i < n; i++){
      for(int j = 0; j < m; j++){
        twoD[i][j] = scn.nextInt();
      }
    }


    // twoD array print 
    for(int i = 0; i < n; i++){
      for(int j = 0; j < m; j++){
        System.out.print(twoD[i][j] + " ");
      }
      System.out.println();
    }
  }
  
}
