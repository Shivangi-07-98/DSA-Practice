import java.util.*;
public class PrimeNumberQ1 {
  public static void main(String [] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    int count = 0;
    for(int i = 2; i*i <= n; i++){
      if(n % i == 0){
        count++;
        break;
      }
    }

    if(count == 0){
      System.out.print(n + " is prime");
    }
    else{
      System.out.print(n + " is not prime");
    }
    
  }
}
