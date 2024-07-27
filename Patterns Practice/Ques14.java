import java.util.*;
public class Ques14 {
  public static void main (String [] args){
    Scanner scn = new Scanner (System.in);
    int n = scn.nextInt();
    int answer = 0;

    for(int i = 1; i <= 10; i++){
      answer = n * i;
      System.out.println(n + " * " + i + " = " + answer);
    }
  }
}
