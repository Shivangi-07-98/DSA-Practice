import java.util.*;

public class Q3_SizeSumMaximumHeight {

  public static class Node {
    int data;
    Node left;
    Node right;

    // Node(int data, Node left, Node right){
    // this.data = data;
    // this.left = left;
    // this.right = right;
    // }
  }

  public static class Pair {
    Node node;
    int state;

    // Pair(Node node, int state){
    // this.node = node;
    // this.state = state;
    // }
  }

  public static Node construct(Integer[] arr) {
    Stack<Pair> stack = new Stack<>();

    Node root = new Node();
    root.data = arr[0];

    Pair rootp = new Pair();
    rootp.node = root;
    rootp.state = 1;

    stack.push(rootp);
    int idx = 1;

    while (stack.size() > 0) {
      Pair peekp = stack.peek();

      if (peekp.state == 1) {
        // left
        if (arr[idx] != null) {
          Node lc = new Node();
          lc.data = arr[idx];
          peekp.node.left = lc;

          Pair lp = new Pair();
          lp.node = lc;
          lp.state = 1;

          stack.push(lp);
        }
        peekp.state++;
        idx++;
      } else if (peekp.state == 2) {
        // right
        if (arr[idx] != null) {
          Node rc = new Node();
          rc.data = arr[idx];
          peekp.node.right = rc;

          Pair rp = new Pair();
          rp.node = rc;
          rp.state = 1;

          stack.push(rp);
        }
        peekp.state++;
        idx++;
      } else if (peekp.state == 3) {
        // pop
        stack.pop();
      }
    }
    return root;
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

    display(node.left);
    display(node.right);
  }

  // dry run by making stack
  // total elements without including null
  public static int size(Node node) {
    if (node == null) {
      return 0;
    }
    int ls = size(node.left); // 1
    int rs = size(node.right); // 2
    int size = ls + rs + 1; // 3
    return size; // 4
  }

  public static int sum(Node node) {
    if (node == null) {
      return 0;
    }
    int lsum = sum(node.left);
    int rsum = sum(node.right);
    int sum = lsum + rsum + node.data;
    return sum;
  }

  public static int max(Node node) {
    if (node == null) {
      return Integer.MIN_VALUE;
    }
    int lmax = max(node.left);
    int rmax = max(node.right);
    int max = Math.max(node.data, Math.max(lmax, rmax));
    return max;
  }

  public static int height(Node node) {
    if (node == null) {
      return -1; // edges -1, nodes 0
    }
    int lh = height(node.left);
    int rh = height(node.right);
    int height = Math.max(lh, rh) + 1;
    return height;
  }

  public static void main(String[] args) {
    Integer[] arr = { 50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null, null };

    Node root = construct(arr);
    // display(root);

    int size = size(root);
    int sum = sum(root);
    int max = max(root);
    int height = height(root);
    System.out.println("size " + size);
    System.out.println("sum " + sum);
    System.out.println("max " + max);
    System.out.println("height " + height);
  }

}
