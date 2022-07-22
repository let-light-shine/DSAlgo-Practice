package IdenticalTreeOrNot;

import java.util.ArrayList;

public class Main {

    public static boolean  identical_or_not(Node node1, Node node2){
        if(node1 ==null && node2 ==null){
            return true;
        }
        else if(node1!=null && node2!=null){
            return node1.key == node2.key && identical_or_not(node1.left, node2.left) && identical_or_not(node1.right, node2.right);
        }
        return false;

    }

    public static void main(String[] args){
        BinaryTree tree1 = new BinaryTree();
        BinaryTree tree2 = new BinaryTree();

        // Tree 1
        tree1.root = new Node(1);
        tree1.root.left = new Node(2);
        tree1.root.right = new Node(3);
        tree1.root.left.right = new Node(4);
        tree1.root.left.left = new Node(5);
        tree1.root.left.left.right = new Node(6);
        tree1.root.left.left.right.left = new Node(7);


        //Tree 2
        tree2.root = new Node(1);
        tree2.root.left = new Node(2);
        tree2.root.right = new Node(3);
        tree2.root.left.right = new Node(4);
        tree2.root.left.left = new Node(5);

        tree1.printInOrder(tree1.root);
        tree2.printInOrder(tree2.root);


        // this is not working because ArrayList created here is static

        System.out.print("Tree 1:\n");
        for(int i=0; i<tree1.arr.size(); i++){
            System.out.print(tree1.arr.get(i) + " ");
        }

        System.out.print("\nTree 2:\n");
        for(int i=0; i<tree2.arr.size(); i++){
            System.out.print(tree2.arr.get(i) + " ");
        }

        System.out.print("\n");
        if(tree1.arr.equals(tree2.arr) == true){
            System.out.println("The two trees are identical.");
        }
        else{
            System.out.println("The two trees are not identical.");
        }

        if(identical_or_not(tree1.root, tree2.root)){
            System.out.println("The two trees are identical.");
        }
        else{
            System.out.println("The two trees are not identical.");
        }
    }
}
