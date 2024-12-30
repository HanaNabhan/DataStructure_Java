package tree;

public class BinarySearchTree {
	Member root;

	public BinarySearchTree() {
		root = null;
	}

	public void insert(int data) {
		Member newNode = new Member(data);

		if (root == null) {
			root = newNode;
			return;
		}
		Member current = root;
		Member parent;
		while (true) {
			parent = current;
			if (data < current.data) {
				current = current.leftchild;
				if (current == null) {
					parent.leftchild = newNode;
					return;
				}
			} else {
				current = current.rightchild;
				if (current == null) {
					parent.rightchild = newNode;
					return;
				}
			}
		}
	}

	public void inOrderTraversal(Member node) {
		if (node != null) {
			inOrderTraversal(node.leftchild);
			System.out.print(node.data + " ");
			inOrderTraversal(node.rightchild);
		}
	}

	public int countnode(Member node) {
		if (node == null) {
			return 0;
		}
		return 1 + countnode(node.leftchild) + countnode(node.rightchild);
	}

	public int countleafs(Member node) {
		if (node == null) {
			return 0; // Base case: if the node is null, no leaves exist
		}
		if (node.leftchild == null && node.rightchild == null) {
			return 1;
		}
		return countleafs(node.leftchild) + countleafs(node.rightchild);
	}

	public int countinternal(Member node) { // without the root
		if (node == null || (node.leftchild == null && node.rightchild == null)) {
			return 0;
		}
		return countinternal(node.leftchild) + countinternal(node.rightchild) +1;
		
	}

	public void delete(int data) {

		if (root == null) {
			System.out.println("Nothing to remove");
			return;
		}
		Member current = root;
		Member parent = null;
		while (current != null && current.data != data) {
			parent=current;
			if (data < current.data) {
				current = current.leftchild;
			} else {
				current = current.rightchild;

			}

		}

		if (current == null) {
			System.out.println("Node not found: " + data);
			return;
		}
		if (current.leftchild == null && current.rightchild == null) { // have no child
			if (current == root) {
				root = null; 
			} else if (parent.leftchild == current) {
				parent.leftchild = null;
			} else {
				parent.rightchild = null;
			}
		} else if (current.leftchild == null || current.rightchild == null) { // have 1 child
			Member child = (current.leftchild != null) ? current.leftchild : current.rightchild;

			if (current == root) {
				root = child; 
			} else if (parent.leftchild == current) {
				parent.leftchild = child;
			} else {
				parent.rightchild = child;
			}
		}
		// have 2 child
		
		 else {
		        Member successor = findMin(current.rightchild); // find the smallest value in the right subtree
		        int successorValue = successor.data; 
		        delete(successorValue); // Recursively delete the successor
		        current.data = successorValue; // Replace current node's value with the successor's value
		    }

		    System.out.println("Deleted node: " + data);
	}
	public Member findMin(Member node) {
	    while (node.leftchild != null) {
	        node = node.leftchild;
	    }
	    return node;
	}
}
