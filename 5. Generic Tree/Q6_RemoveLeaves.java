import java.util.*;

public class Q6_RemoveLeaves {

  private static class Node {
    int data;
    ArrayList<Node> children = new ArrayList<>();
    Node(int data) {
      this.data = data;
    }
  }

  public static void display(Node node) {
    String str = node.data + " -> ";
    for (Node child : node.children) {
      str += child.data + ", ";
    }
    str += ".";
    System.out.println(str);

    for (Node child : node.children) {
      display(child);
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

  public static void removeLeaves(Node node) {
    // remove your own leaves
    // deleting in node pre also this loop should be above the call
    for (int i = node.children.size() - 1; i >= 0; i--) {
      Node child = node.children.get(i);
      if (child.children.size() == 0) {
        node.children.remove(i);
      }
    }

    // request the children
    for (Node child : node.children) {
      removeLeaves(child);
    }
  }

  public static void myRemoveLeaves(Node node) {
    for (int i = node.children.size() - 1; i >= 0; i--) {
      Node child = node.children.get(i);
      if (child.children.size() == 0) {
        node.children.remove(i);
      }
    }

    for(Node child: node.children){
      myRemoveLeaves(child);
    }
    
  }

  public static void main(String[] args) throws Exception {
    int[] arr = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1,
        -1 };
    Node root = construct(arr);

    levelOrderLinewise(root);
    removeLeaves(root);
    // display(root);
    levelOrderLinewise(root);
  }

}
