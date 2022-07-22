package SimpleTree;

public class BinaryTree {
    Node root;

    BinaryTree(){
        root = null;
    }
    BinaryTree(int key){
        root = new Node(key);
    }

    void printPreorder(Node node){

        if(node ==null){
            return;
        }

        System.out.print(node.key + " ");
        printPreorder(node.left);
        printPreorder(node.right);

    }

    void printInorder(Node node){
        if(node ==null){
            return;
        }

        printInorder(node.left);
        System.out.print(node.key + " ");
        printInorder(node.right);
    }

    void printPostOrder(Node node){
        if(node==null){
            return;
        }

        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.print(node.key + " ");

    }
}

