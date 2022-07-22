package SumTree;

public class Node {
    int key;
    Node left, right;
    Node(int key){
        this.key=key;
        right = left = null;
    }
}