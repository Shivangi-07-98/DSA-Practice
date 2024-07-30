import java.util.*;
public class SpiralDisplayQ2 {
  public static void main (String [] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt(); // 3
    int m = scn.nextInt(); // 5

    int [][] arr = new int [n][m];
    for(int i = 0; i < n; i++){
      for (int j = 0; j < m; j++){
        arr[i][j] = scn.nextInt();
      }
    }

    //     0   1  2  3  4
    // 0   11 12 13 14 15
    // 1   21 22 23 24 25
    // 2   31 32 33 34 35

    int minr = 0;
    int maxr = arr.length-1;

    int minc = 0;
    int maxc = arr[0].length-1;

    int count = 1;
    int total = n*m; // 15

    while(count <= total){
      // left wall, downwards, col is fixed at minc, row varies from minr to maxr
      for(int i = minr, j = minc; i <= maxr && count <= total; i++){
        System.out.println(arr[i][j]);
        count++;
      }
      minc++; // 1

      // bottom wall, righwards, row is fixed at maxr, col varies from minc to maxc
      for(int i = maxr, j = minc; j <= maxc && count <= total; j++){
        System.out.println(arr[i][j]);
        count++;
      }
      maxr--;

      // right wall, upward, col is fixed at maxc, row varies from maxr to minr
      for(int j = maxc, i = maxr; i >= minr && count <= total; i--){
        System.out.println(arr[i][j]);
        count++;
      }
      maxc--;

      // top wall, letwards, row is fixed at minr, col varies from maxc to minc
      for(int i = minr, j = maxc; j >=minc && count <= total; j--){
        System.out.println(arr[i][j]);
        count++;
      }
      minr++;
    }



  }
}
