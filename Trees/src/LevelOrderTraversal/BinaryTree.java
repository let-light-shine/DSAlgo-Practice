package LevelOrderTraversal;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    Node root;

    void printLevelOrder(){
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node tempnode = queue.poll();
            //Poll dequeues element from queue
            System.out.print(tempnode.key + " ");

            //Enqueue left node
            if(tempnode.left!=null){
                queue.add(tempnode.left);
            }

            //Enqueue right node
            if(tempnode.right!=null){
                queue.add(tempnode.right);
            }
        }
    }


    public static void main(String[] args){
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.right.right.right = new Node(10);
        tree.root.right.right.left = new Node(11);


        tree.printLevelOrder();

    }
}
