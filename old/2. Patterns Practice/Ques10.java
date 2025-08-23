import java.util.*;
public class Ques10{
public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int osp = n/2;
    int isp = -1;
    for(int i = 1; i <= n; i++){

        for(int j = 1; j <= osp; j++){
            System.out.print(" ");
        }
            System.out.print("*");

        for(int j = 1; j <= isp; j++){
            System.out.print(" ");
        }
        if( i == 1 || i == n){
            
        }
        else{
            System.out.print("*");
        }

        for(int j = 1; j <= osp; j++){
            System.out.print(" ");
        }

        System.out.println();
        if(i <= n/2){
            osp--;
            isp += 2; // 1, 3
        }
        else{
            osp++;
            isp -= 2; // 1, 0
        }
    }
    
 }
}