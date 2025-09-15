import java.util.*;
public class BinaryTreeIntro {

    public static class Node {
        int data;
        Node left;
        Node right;
    }

    public static class Pair {
        Node node;
        int state;
    }

    // create stack of pair
    public static Node construct(Integer[] arr) {
        Stack<Pair> stack = new Stack<>();

        Node root = new Node();
        root.data = arr[0];

        // main lines
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
    // 25 50 75
    // 12 25 37
    //    12
    // 30 37 
    //    30
    // 62 75 87
    //    62 70
    //    70
    //    87
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

    public static void main(String[] args) {
        Integer[] arr = new Integer[] { 50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null,
                87, null, null }; // capital integer array has null
        Node root = construct(arr);
        display(root);
    }

}