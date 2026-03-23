import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

class Node{
    int data;
    Vector<Node> child=new Vector<>();
    Node (int data){
        this.data=data;
    }
}

public class nchildTree {
    Node root;
    Node Insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        Queue <Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node temp=q.poll();
            temp.child.add(new Node(data));
            return root;
        }
        return root;
    }

    void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        int i=0;
        while(i<root.child.size()){
            preOrder(root.child.get(i));
            i++;
        }
    }

    void postOrder(Node root){
        if(root==null){
            return;
        }
        int i=0;
        while(i<root.child.size()){
            postOrder(root.child.get(i));
            i++;
        }
        System.out.println(root.data);
    }

    void levelOrder(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node temp=q.remove();
            System.out.println(temp.data);
            for(int i=0;i<temp.child.size();i++){
                q.add(temp.child.get(i));
            }
        }
    }


    public static void main(String[] args) {
        nchildTree tree=new nchildTree();
        tree.root=tree.Insert(tree.root,10);
        tree.root=tree.Insert(tree.root,20);
        tree.root=tree.Insert(tree.root,30);
        tree.root=tree.Insert(tree.root,40);
        tree.root=tree.Insert(tree.root,50);

        System.out.println("___Preorder____");
        tree.preOrder(tree.root);
        System.out.println("___Postorder____");
        tree.postOrder(tree.root);
        System.out.println("___Levelorder____");
        tree.levelOrder(tree.root);
    }
}
