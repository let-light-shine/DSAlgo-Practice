package HeightBalanced;

public class tree {
    Node root;

    tree(){
        root = null;
    }

    tree(int key){
        root = new Node(key);
    }

    int max_depth(Node node){
        if(node == null){
            return 0;
        }
        else if(node.left ==null || node.right==null){
            return 0;
        }
        else{
            return 1+ Math.max(max_depth(node.left),max_depth(node.right));
        }
    }

    boolean balanced_or_not(Node node){
        int leftheight;
        int rightheight;

        if (node == null){
            return true;
        }

        leftheight = max_depth(node.left);
        rightheight = max_depth(node.right);

        if(Math.abs(leftheight-rightheight)<=1 && balanced_or_not(node.left) && balanced_or_not(node.right)){
            return true;
        }

        return false;

    }
}
