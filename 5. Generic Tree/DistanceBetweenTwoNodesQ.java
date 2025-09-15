import java.util.*;

public class DistanceBetweenTwoNodesQ {

    public static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();

        Node(int data) {
            this.data = data;
        }
    }

    public static void levelOrder(Node root) {
        Queue<Node> queue = new ArrayDeque<Node>();
        queue.add(root);

        while (queue.size() > 0) {
            // remove, print, add
            Node temp = queue.remove();
            System.out.print(temp.data + " ");
            for (Node child : temp.children) {
                queue.add(child);
            }
        }

        System.out.println(".");
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
                System.out.println(".");
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

    public static boolean find(Node node, int data) {
        if (node.data == data) {
            return true;
        }

        for (Node child : node.children) {
            boolean fic = find(child, data);
            if (fic == true) {
                return true;
            }
        }

        return false;
    }

    public static ArrayList<Integer> nodeToRootPath(Node node, int data) {
        if (node.data == data) {
            ArrayList<Integer> bres = new ArrayList<>();
            bres.add(node.data);
            return bres;
        }

        // Search in all children
        for (Node child : node.children) {
            ArrayList<Integer> childToPath = nodeToRootPath(child, data);

            // If path found in child subtree
            if (childToPath.size() > 0) {
                childToPath.add(node.data); // Add current node to the path
                return childToPath;
            }
        }

        // Return empty list if not found
        return new ArrayList<>();
    }

    public static int lca(Node node, int d1, int d2) {
        ArrayList<Integer> path1 = nodeToRootPath(node, d1);
        ArrayList<Integer> path2 = nodeToRootPath(node, d2);
        int i = path1.size() - 1;
        int j = path2.size() - 1;

        while (i >= 0 && j >= 0) {
            if (path1.get(i) == path2.get(j)) {
                i--;
                j--;
            } else {
                break;
            }
        }

        int lca = path1.get(i + 1);
        return lca;
    }

    public static int distanceBetweenTwoNodes(Node node, int d1, int d2) {
        ArrayList<Integer> path1 = nodeToRootPath(node, d1);
        ArrayList<Integer> path2 = nodeToRootPath(node, d2);
        int i = path1.size() - 1;
        int j = path2.size() - 1;

        while (i >= 0 && j >= 0) {
            if (path1.get(i) == path2.get(j)) {
                i--;
                j--;
            } else {
                break;
            }
        }

        i++;
        j++;
        return i + j;

    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1,
                -1 };
        Node root = construct(arr);

        int d1 = 120;
        int d2 = 50;
        int distance = distanceBetweenTwoNodes(root, d1, d2);
        System.out.println(distance);

        // levelOrder(root);
        // levelOrderLinewise(root);
    }

}
