import java.io.*;
import java.util.*;

public class Q1_BstIntro {

  public static class Node {
    int data;
    Node left;
    Node right;
  }

  // leftNode parentNode rightNode
  public static void display(Node node) {
    if (node == null) {
      return;
    }
    String str = " <- " + node.data + " -> ";
    String lcstr = node.left == null ? ".." : "" + node.left.data;
    String rcstr = node.right == null ? ".." : "" + node.right.data;
    System.out.println(lcstr + str + rcstr);

    display(node.left); // will print the entire left tree
    display(node.right); // will print the entire right tree
  }

  // node isbst true when all to the left are smaller and all to the right are greater
  public static Node construct(int[] sarr, int lo, int hi){
    if(lo > hi){
      return null;
    }
    int mid = (lo + hi) / 2;
    Node node = new Node();
    node.data = sarr[mid];
    node.left = construct(sarr, lo, mid - 1);
    node.right = construct(sarr, mid + 1, hi);
    
    return node;
  }

  public static void main(String[] args) {
    int[] arr = { 12, 25, 37, 50, 62, 75, 87 }; // these are inorder
    Node root = construct(arr, 0, arr.length - 1);
    display(root);

  }

}

// bad construct bad complexity h = n and O(n)
// we want O(log(n))

/*
all left node are small, all right node are big is bst
eg-
             50
      25           75
   12   37      62    87
       30 40   60 70 

see all left node are smaller 
and all right node are bigger
*/