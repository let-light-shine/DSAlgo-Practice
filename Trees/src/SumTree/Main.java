package SumTree;

public class Main {
    public static void main(String[] args){
        Binarytree tree = new Binarytree();
        tree.root=new Node(26);
        tree.root.left=new Node(10);
        tree.root.right=new Node(3);
        tree.root.left.left=new Node(4);
        tree.root.left.right=new Node(6);
        tree.root.right.right=new Node(3);
        if(tree.SumTree(tree.root) != 0)
        {
            System.out.println("The given tree is a SumTree");
        }
        else
        {
            System.out.println("The given tree is not a SumTree");
        }
    }

}
