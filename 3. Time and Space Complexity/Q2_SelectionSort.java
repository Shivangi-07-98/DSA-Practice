// O(n^2)
import java.io.*;
import java.util.*;

public class Q2_SelectionSort {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt(); // 5
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt(); // 20 30 90 10 40
    }

    // Selection Sort: Find smallest element and put it at start by swapping,
    // smallest element reaches the start of the array
    // Diff from Bubble: Bubble swaps adjacent, Selection finds min and swaps
    for (int i = 0; i <= n - 2; i++) { // 0, 1, 2, 3
      int minidx = i;
      for (int j = i + 1; j <= n - 1; j++) { // 1-4, 2-4, 3-4, 4-4
        // 0(1-4) 1(2-4) 2(3-4) 3(4-4)
        if (arr[j] < arr[minidx]) { // find smaller element
          minidx = j;
        }
        // because i jb tk same hai tbh tk minidx j loop mai change ho chuka and agli baar changed wale se compare hoga 
        // mai arr[i] krke min fixed krdungi fir agar min milta bhi hai toh update nhi ho payega 
        // IMPORTANT: arr[minidx] use karo, arr[i] nahi!
        // arr[i] se compare karne par last element mil jayega, smallest nahi
      }
      // swap smallest element to correct position
      // bahar ku swap krenge kuki position toh i wali hi chaiye
      int temp = arr[i];
      arr[i] = arr[minidx];
      arr[minidx] = temp;
    }

    // Print sorted array
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}

// for n = 5, 0 index ko small mankar, hum 1-4 mai search krenge koi aur chhota
// hai kya? agar hai toh swap
// aage saare sort hote jayenge
// but ek loop mai ek hi sort hoga issiliye O(n2)

/*
ques - 5 elements ke liye 0-4 
hum 0 idx ko min maankr arrow 1-4 chlate hai and min update krte hai fir 0th position par swap krte hai
abhi 0th position sorted hai 
fir 1 idx ko min maankr arrow 2-4 chlayenge
aise krte krte aage saare sort hote jayenge pehle 0 fir 1, 2, 3 4th apne aap sorted hota
*/