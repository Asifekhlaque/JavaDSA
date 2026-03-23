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

public class bst {
    Node root;

    void insert(Node root, int data) {
        if (this.root == null) {
            this.root = new Node(data);
            return;
        }

        Node temp = this.root;
        while (temp != null) {
            if (temp.data > data && temp.left != null) {
                temp = temp.left;
            } else if (temp.data < data && temp.right != null) {
                temp = temp.right;
            } else {
                break;
            }
        }

        if (temp.data > data) {
            temp.left = new Node(data);
        } else {
            temp.right = new Node(data);
        }

    }

    void inOrder(Node root) {
        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }

    void preOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.println(root.data); // Root
        preOrder(root.left); // Left
        preOrder(root.right); // Right
    }

    void postOrder(Node root) {
        if (root == null) {
            return;
        }

        postOrder(root.left); // Left
        postOrder(root.right); // Right
        System.out.println(root.data); // Root
    }

    void search(Node root, int key) {
        if (root == null) {
            return;
        }

        Node temp = root;
        int cnt = 0;
        while (temp != null) {
            cnt++;
            if (temp.data == key) {
                System.out.println("Found at " + cnt);
                return;
            } else if (temp.data > key) {
                temp = temp.left;
            } else {
                temp = temp.right;
            }
        }
        System.out.println("Not Found");
    }



    public static void main(String[] args) {
        bst tree = new bst();
        tree.insert(tree.root, 10);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 50);
        tree.inOrder(tree.root);
        System.out.println("____________________");
        tree.preOrder(tree.root);
        System.out.println("____________________");
        tree.postOrder(tree.root);
        System.out.println("____________________");
        tree.search(tree.root, 40);
    }
}
