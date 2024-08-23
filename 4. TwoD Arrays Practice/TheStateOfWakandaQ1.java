import java.util.*;

public class TheStateOfWakandaQ1 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt(); // arr.length
    int m = scn.nextInt(); // arr[0].length

    // twoD array
    int[][] twoD = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        twoD[i][j] = scn.nextInt();
      }
    }

    
for(int i = 0; i < m; i++){
  if(i % 2 == 0){
    for (int j = 0; j < n; j++) {
      System.out.print(twoD[j][i] + " ");
    }
  }
  else{
    for (int j = n-1; j >= 0; j--) {
      System.out.print(twoD[j][i] + " ");
    }
  }
}
    
  }
}

//   0  1  2  3
// 0 11 12 13 14
// 1 21 22 23 24
// 2 31 32 33 34

// 11 21 31     32 22 12      13 23 33      34 24 14