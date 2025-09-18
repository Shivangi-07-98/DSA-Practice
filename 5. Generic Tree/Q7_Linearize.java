import java.util.*;

public class Q7_Linearize {

  private static class Node {
    int data;
    ArrayList<Node> children = new ArrayList<>();
    Node(int data) {
      this.data = data;
    }
  }

  public static void levelOrderLinewise(Node root) {
    Queue<Node> queue = new ArrayDeque<Node>();
    Queue<Node> cqueue = new ArrayDeque<Node>();
    queue.add(root);

    while (queue.size() > 0) {
      Node temp = queue.remove();
      System.out.print(temp.data + " ");

      for (Node child : temp.children) {
        cqueue.add(child);
      }

      if (queue.size() == 0) {
        queue = cqueue;
        cqueue = new ArrayDeque<>();
        System.out.println();
      }
    }
  }

  public static Node construct(int[] arr) {
    // using the array create a tree and return root
    Node root = null;
    Stack<Node> stack = new Stack<>();
    for (int val : arr) {
      if (val != -1) {
        Node node = new Node(val);
        stack.push(node);
      } else {
        Node node = stack.pop();
        if (stack.size() > 0) {
          Node parent = stack.peek();
          parent.children.add(node);
        } else {
          root = node;
        }
      }
    }
    return root;
  }

  public static Node getTail(Node node) {
    while (node.children.size() > 0) {
      node = node.children.get(0);
    }
    return node;
  }

  public static void linearize(Node node) {
    for (Node child : node.children) {
      linearize(child);
    }
    while (node.children.size() > 1) {
      Node last = node.children.remove(node.children.size() - 1);
      Node slast = node.children.get(node.children.size() - 1);
      Node slastKiTail = getTail(slast);
      slastKiTail.children.add(last);
    }
  }

  public static void myLinearize(Node node) {
    for (int i = node.children.size() - 1; i >= 0; i--) {
      if (node.children.size() > 1) {
        Node val = node.children.remove(i);
        Node parent = node.children.get(i - 1);
        parent.children.add(val);
      }
    }
    for (Node child : node.children) {
      myLinearize(child);
    }
  }

  // linearizes and returns the tail
  public static Node linearizeEfficient(Node node) {
    if (node.children.size() == 0) {
      return node;
    }
    Node lastChild = node.children.get(node.children.size() - 1);
    Node lastKiTail = linearizeEfficient(lastChild);

    while (node.children.size() > 1) {
      Node slastChild = node.children.get(node.children.size() - 2);
      Node slastKiTail = linearizeEfficient(slastChild);
      slastKiTail.children.add(lastChild);

      node.children.remove(node.children.size() - 1);
      lastChild = slastChild;
    }

    return lastKiTail;
  }
  
  public static void main(String[] args) throws Exception {
    int[] arr = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1,
        -1 };
    Node root = construct(arr);

    // linearize(root);
    // levelOrderLinewise(root);

    linearizeEfficient(root);
    levelOrderLinewise(root);
  }

}
