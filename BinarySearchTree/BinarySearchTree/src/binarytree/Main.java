package binarytree;

public class Main {
    public static void main(String[] args) {
        BST bst = new BST();

        bst.Insert(50);
        bst.Insert(30);
        bst.Insert(70);
        bst.Insert(20);
        bst.Insert(40);
        bst.Insert(60);
        bst.Insert(80);

        // Test preorder traversal
        System.out.println("Preorder Traversal:");
        bst.preorder(bst.root);
        System.out.println();
        // Test inorder traversal
        System.out.println("\nInorder Traversal:");
        bst.inorder(bst.root);
        System.out.println();

        // Test postorder traversal
        System.out.println("\nPostorder Traversal:");
        bst.postorder(bst.root);
    }
}
