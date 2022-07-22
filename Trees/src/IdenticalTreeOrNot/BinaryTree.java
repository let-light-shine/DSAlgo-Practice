package IdenticalTreeOrNot;

import java.util.ArrayList;

public class BinaryTree {
    Node root;
    static ArrayList<Integer> arr = new ArrayList<Integer>();
    BinaryTree(){
        root = null;
    }

    BinaryTree(int key){
        root = new Node(key);
    }

// this is not working because ArrayList is static
    public void printInOrder(Node node){
        if(node==null){
            return;
        }
        printInOrder(node.left);
        arr.add(node.key);
        printInOrder(node.right);
        //return arr;
    }

}
