package SimpleTree;

public class simpletree {

    public static void main(String[] args){
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.right = new Node(6);
        tree.root.left.left = new Node(4);
        tree.root.right.right = new Node(5);
        tree.root.right.left = new Node(7);

        System.out.println("Pre order traversal:");
        tree.printPreorder(tree.root);
        System.out.println("\nInorder traversal:");
        tree.printInorder(tree.root);
        System.out.println("\nPostorder traversal:");
        tree.printPostOrder(tree.root);

    }
}


