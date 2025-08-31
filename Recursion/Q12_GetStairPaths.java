import java.util.*;
public class Q12_GetStairPaths {
  public static void main (String [] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    ArrayList <String> ans = gsp(n); // 3
    System.out.println(ans);
  }

  public static ArrayList <String> gsp(int n){
    if(n == 0){
      ArrayList <String> bres = new ArrayList<>();
      bres.add("");
      return bres;
    }
    else if(n < 0){
      ArrayList <String> bres = new ArrayList<>();
      return bres;
    }

    ArrayList <String> one = gsp(n-1);
    ArrayList <String> two = gsp(n-2);
    ArrayList <String> three = gsp(n-3);

    ArrayList <String> ans = new ArrayList<>();

    for(String rone: one){
      ans.add("1" + rone);
    }
    for(String rone: two){
      ans.add("2" + rone);
    }
    for(String rone: three){
      ans.add("3" + rone);
    }
    
    return ans;
  }
  
}
