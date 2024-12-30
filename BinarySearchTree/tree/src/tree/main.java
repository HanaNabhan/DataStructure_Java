package tree;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BinarySearchTree bst = new BinarySearchTree();

	        // Insert nodes into the tree
	        bst.insert(50);
	        bst.insert(30);
	        bst.insert(70);
	        bst.insert(20);
	        bst.insert(40);
	        bst.insert(60);
	        bst.insert(80);

	        // Display the tree structure (in-order traversal)
	        System.out.print("In-order Traversal: ");
	        bst.inOrderTraversal(bst.root);
	        System.out.println("Count: " + bst.countnode(bst.root));
	        System.out.println("Count leafs: " + bst.countleafs(bst.root));
	        System.out.println("Count internal: " + bst.countinternal(bst.root));
	        
	        
	        bst.delete(20); // Leaf node
	        bst.delete(30); // Node with one child
	        bst.delete(50); //  Node with two children
	        System.out.print("In-order Traversal: ");
	        bst.inOrderTraversal(bst.root);
	}

}
