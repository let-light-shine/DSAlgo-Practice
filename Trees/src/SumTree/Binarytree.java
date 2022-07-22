package SumTree;

public class Binarytree {
    Node root;

    Binarytree(){
        root = null;
    }

    Binarytree(int key){
        root = new Node(key);
    }


    public int sum(Node node){
        if(node ==null){
            return 0;
        }
        else if(node.left == null && node.right==null){
            return node.key;
        }else{
            return sum(node.left)+sum(node.right)+node.key;
        }
    }
    public int SumTree(Node node){
        if(node == null){
            return 1;
        }
        else if ((node.left == null && node.right == null)){
            return 1;
        }
        int left_sum = sum(node.left);
        int right_sum = sum(node.right);
        if(node.key == left_sum +right_sum && SumTree(node.left)!=0 && SumTree(node.right)!=0){
            return 1;
        }
        return 0;
    }
}
