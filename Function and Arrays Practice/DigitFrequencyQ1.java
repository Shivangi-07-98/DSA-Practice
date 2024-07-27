import java.util.*;
public class DigitFrequencyQ1{
  public static void main (String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int d = scn.nextInt();
    int f = getNumber(n,d);
    System.out.print(f);
  }

  public static int getNumber(int n, int d){

     int f = 0;
    while(n > 0){
      int rem = n % 10;
      n = n/10;
      if (rem == d){
        f++;
      }
    }
    return f;
  }

}