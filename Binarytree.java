import java.util.Queue;
import java.util.LinkedList;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class Binarytree {
    Node root;

    void addNode(int data) {
        if (root == null) {
            root = new Node(data);
            return;
        } else {
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            while (!q.isEmpty()) {
                Node curr = q.remove();
                if (curr.left == null) {
                    curr.left = new Node(data);
                    return;
                } else {
                    q.add(curr.left);
                }
                if (curr.right == null) {
                    curr.right = new Node(data);
                    return;
                } else {
                    q.add(curr.right);
                }
            }
        }
    }

    void inOrder(){

    }

    public static void main(String[] args) {
        Binarytree tree = new Binarytree();
        tree.addNode(1);
        tree.addNode(2);
        tree.addNode(3);
        tree.addNode(4);
        tree.addNode(5);
        tree.addNode(6);
        tree.addNode(7);
        tree.addNode(8);

        tree.inOrder();
    }
}