package Tree;

public class BinaryTree {
	
	Node root;
	
	static class Node {
		int data;
		Node left;
		Node right;
		
		Node(int d){
			data = d;
			left = right = null;
			//right = null;
		}
	}
	
	BinaryTree(){
		root = null;
	}

//	BinaryTree(int d){
//		root = new Node(d);      // Initialised root to new node
//	}
	
	void preOrder() {
		System.out.println("Pre-Order: ");
		printPreOrder(root);
	}
	
	void printPreOrder(Node rootNode){
		if(rootNode != null) {
			System.out.println(rootNode.data + " ");
			printPreOrder(rootNode.left);
			printPreOrder(rootNode.right);
		}
	}
	
	void InOrder() {
		System.out.println("In-Order: ");
		printInOrder(root); //11
	}
	
	void printInOrder(Node rootNode){ //11
		if(rootNode != null) {
			printInOrder(rootNode.left);
			System.out.println(rootNode.data + " ");
			printInOrder(rootNode.right);
		}
	}
	
	void postOrder() {
		System.out.println("Post-Order: ");
		printPostOrder(root);
	}
	
	void printPostOrder(Node rootNode){
		if(rootNode != null) {
			printPostOrder(rootNode.left);
			printPostOrder(rootNode.right);
			System.out.println(rootNode.data + " ");
		}
	}
	
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.root = new Node(11);  // here also we did the same new node ko root banaya aur fir pass kiya h print -pre, in ,post order me 
		
		//BinaryTree bt = new BinaryTree(11); // we can also use parameterized constructor to assign new node to root
		bt.root.left = new Node(22);
		bt.root.right = new Node(33);
		bt.root.left.left = new Node(44);
		bt.root.left.right = new Node(55);
		
		bt.preOrder();
		bt.InOrder();
		bt.postOrder();
	}
	}