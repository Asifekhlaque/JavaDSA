import java.util.Queue;
import java.util.LinkedList;

class Node {
    int data;
    Node left;
    Node mid;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.mid = null;
        this.right = null;
    }
}

public class terary {
    Node root;

    Node insertNode(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node temp = q.remove();
            if (temp.left == null) {
                temp.left = new Node(data);
                return root;
            } else {
                q.add(temp.left);
            }
            if (temp.mid == null) {
                temp.mid = new Node(data);
                return root;
            } else {
                q.add(temp.mid);
            }
            if (temp.right == null) {
                temp.right = new Node(data);
                return root;
            } else {
                q.add(temp.right);
            }
        }
        return root;
    }

    void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.mid);
        preOrder(root.right);
    }

    void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.mid);
        postOrder(root.right);
        System.out.println(root.data);
    }

    void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node curr = q.remove();
            System.out.println(curr.data);
            if (curr.left != null) {
                q.add(curr.left);
            }
            if (curr.mid != null) {
                q.add(curr.mid);
            }
            if (curr.right != null) {
                q.add(curr.right);
            }
        }
    }

    public static void main(String[] args) {
        terary tree = new terary();

        tree.root = tree.insertNode(tree.root, 10);
        tree.root = tree.insertNode(tree.root, 20);
        tree.root = tree.insertNode(tree.root, 30);
        tree.root = tree.insertNode(tree.root, 40);
        tree.root = tree.insertNode(tree.root, 50);
        

        System.out.println("___Preorder____");
        tree.preOrder(tree.root);

        System.out.println("___Postorder____");
        tree.postOrder(tree.root);

        System.out.println("___Levelorder____");
        tree.levelOrder(tree.root);
    }
}