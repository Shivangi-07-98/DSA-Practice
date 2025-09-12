import java.util.*;
public class ExitPointOfaMatrixQ3 {
  public static void main (String [] args){
    Scanner scn = new Scanner(System.in);
    int r = scn.nextInt(); // 4
    int c = scn.nextInt(); // 4

    int [][] arr = new int [r][c];
    for(int i = 0; i < r; i++){
      for(int j = 0; j < c; j++){
        arr[i][j] = scn.nextInt();
      }
    }

    // logic

    int i = 0;
    int j = 0;
    int dir = 0;
    // east = 0; south = 1; west = 2; north = 3;

    // 4 4
// 0 0 1 0
// 1 0 0 0  (1,3)
// 0 0 0 0
// 1 0 1 0

// 90 right turn at 1
// 

    while(true){
      dir = (dir + arr[i][j]) % 4;
      
      if(dir == 0){ // east
        j++;
        if(j == arr[0].length){
          j--;
          break;
        }
      }
      else if(dir == 1){ // south
        i++;
        if(i == arr.length){
          i--;
          break;
        }
      }
      else if(dir == 2){ // west
        j--;
        if(j == -1){
          j++;
          break;
        }
      }
      else { // north
        i--;
        if(i == -1){
          i++;
          break;
        }
      }

    }

    System.out.println(i);
    System.out.println(j);

  }
}

