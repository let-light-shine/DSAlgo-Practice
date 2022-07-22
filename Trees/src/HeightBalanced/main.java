package HeightBalanced;

public class main {

    public static void main(String[] args){
        tree btree = new tree();
        btree.root = new Node(1);
        btree.root.left = new Node(2);
        btree.root.right = new Node(3);
        btree.root.right.right = new Node(10);
//        btree.root.right.right.right = new Node(11);
        btree.root.left.left = new Node(4);
        btree.root.left.right = new Node(5);
        btree.root.left.left.left = new Node(8);

        System.out.println("Height of the tree is:" + btree.max_depth(btree.root));

        if (btree.balanced_or_not(btree.root))
            System.out.println("Tree is balanced");
        else
            System.out.println("Tree is not balanced");
    }
}
