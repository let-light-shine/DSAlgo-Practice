package TreeHeight;

import SimpleTree.BinaryTree;
import SimpleTree.Node;

public class main {
    public static void main(String[] args){
/*        BinaryTree tree = new BinaryTree();

        tree.root = new SimpleTree.Node(1);
        tree.root.left = new SimpleTree.Node(2);
        tree.root.right = new SimpleTree.Node(3);
        tree.root.left.right = new SimpleTree.Node(6);
        tree.root.left.left = new SimpleTree.Node(4);
        tree.root.right.right = new SimpleTree.Node(5);
        tree.root.right.left = new Node(7);

        System.out.println("Pre order traversal:");
        tree.printPreorder(tree.root);
        System.out.println("\nInorder traversal:");
        tree.printInorder(tree.root);
        System.out.println("\nPostorder traversal:");
        tree.printPostOrder(tree.root);*/

        Treeheight tree = new Treeheight();

        tree.root = new Node1(1);
        tree.root.left = new Node1(2);
        tree.root.right = new Node1(3);
        tree.root.left.right = new Node1(6);
        tree.root.left.left = new Node1(4);
        tree.root.right.right = new Node1(5);
        tree.root.right.left = new Node1(7);
        tree.root.right.left.right = new Node1(8);
        tree.root.right.left.right.right = new Node1(8);

        System.out.println("The height of the tree is: " + tree.max_depth(tree.root));
        System.out.println(tree.max_depth(tree.root.left));
        System.out.println(tree.max_depth(tree.root.right));
        System.out.println("The diameter of the tree is: " + (tree.max_depth(tree.root.left) + tree.max_depth(tree.root.right) + 2));
    }
}
