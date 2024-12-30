package binarytree;

public class BST {
	Node root;
	
	public BST() {
		root =null;
	}
	public Node Insert(Node r , int value) {
		if ( r==null) {
			Node n = new Node(value);
			r = n;
			
		}
		
		else if ( r.data > value) {
			r.left= Insert(r.left,value);
		}
		
		else {
			r.right= Insert(r.right,value);

		}
		
		return r;
	}
	
	public void Insert(int value) {
		root = Insert(root,value);
	}
	
	public void preorder(Node r) { // root -> left -> right
		if (r==null)
			return;
		System.out.print(r.data+" ");
		preorder(r.left);
		preorder(r.right);


	}
	public void inorder(Node r) { // left -> root -> right
		if (r==null)
			return;
		inorder(r.left);
		System.out.print(r.data+" ");
		inorder(r.right);


	}
	public void postorder(Node r) { // left  -> right -> root
		if (r==null)
			return;
		postorder(r.left);
		postorder(r.right);
		System.out.print(r.data +" ");


	}
}
