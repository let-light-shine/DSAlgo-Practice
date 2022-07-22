package TreeHeight;

public class Treeheight {
    Node1 root;

    Treeheight(){
        root = null;
    }

    Treeheight(int key){
        root = new Node1(key);
    }

    int max(int n1, int n2){
        if(n1>n2)
            return n1;
        else
            return n2;
    }

    int max_depth(Node1 node){
        if(node==null){
            return 0;
        }
        else if(node.right==null && node.left==null){
            return 0;
        }
        else{
            int ldepth = max_depth(node.left);
            int rdepth = max_depth(node.right);

            return (max(ldepth,rdepth) + 1);
        }
    }
}
