package BinarySearchTree;


public class BinarySearchTreeImplementation {
	private Node root;

	public int getMaxValue() {
		if (root == null) {
		}

		return getMax(root);
	}

	public int getMax(Node node) {

		if (node.getRightchild() != null) {
			return getMax(node.getRightchild());
		}
		return node.getData();
	}

	// Similarly getMin
	public int getMinValue() {
		if (root == null) {
		}

		return getMin(root);
	}

	public int getMin(Node node) {

		if (node.getLeftchild() != null) {
			return getMin(node.getLeftchild());
		}
		return node.getData();
	}

	// insert
	public void insertNode(int datatoBeInserted) {

		// if root is null, new incoming data will be root
		if (root == null) {
			root = new Node(datatoBeInserted);
		} else {
			insertNewNode(datatoBeInserted, root);
		}
	}

	public void insertNewNode(int newData, Node node) {
		if(newData < node.getData()){

			if (node.getLeftchild() != null) {
				insertNewNode(newData, node.getLeftchild());
			} else {
				Node newNode = new Node(newData);
				node.setLeftchild(newNode);
			}
		} else {
			if (node.getRightchild() != null) {
				insertNewNode(newData, node.getRightchild());
			} else {
				Node newNode = new Node(newData);
				node.setRightchild(newNode);
			}
		}
	}
	
	// traverse
	public void traverseTree(int traversalType) {
		if(root!=null) {
			switch (traversalType) {
			case 1: {
				preOrderTraversal(root);
				break;
			}
			case 2: {
				inOrderTraversal(root);
				break;
			}
			case 3: {
				postOrderTraversal(root);
				break;
			}
			}
		}		
	}
	
	public void preOrderTraversal(Node node) {
//		if(root == null) {
//			System.out.println("No Node present");
//		}
		
		System.out.print(node + " --> ");
		
		if(node.getLeftchild()!=null) {
			preOrderTraversal(node.getLeftchild());		
		} 
		if(node.getRightchild()!=null) {
		preOrderTraversal(node.getRightchild());
		}
		//System.out.println("Pre-order traversal: " +node);
	}
	
	public void inOrderTraversal(Node node) {
//		if(root == null) {
//			System.out.println("No Node present");
//		}
		
		if(node.getLeftchild()!=null) {
			inOrderTraversal(node.getLeftchild());		
		}
	
		System.out.print(node + " --> ");
		
		if(node.getRightchild()!=null) {
			inOrderTraversal(node.getRightchild());
		}
	//	System.out.println("In-order traversal: " +node);
			
	}
	
	public void postOrderTraversal(Node node) {
//		if(root == null) {
//			System.out.println("No Node present");
//		}
		
		if(node.getLeftchild()!=null) {
			postOrderTraversal(node.getLeftchild());		
		}
	
		if(node.getRightchild()!=null) {
			postOrderTraversal(node.getRightchild());
		}
		
		System.out.print(node + " --> ");
	
	// System.out.println("Post-order traversal: " +node);		
	}
	
	//delete node
	public void delete(int data) {
		if (root == null) {}
		else
		root = deleteNode(root, data);
	}
	
	public Node deleteNode(Node nodeToRemove, int data) {
		if(nodeToRemove == null) {
			System.out.println("Node to be removed does not exist");
		}
		//if root
		//if(nodeToRemove == root) {}
	
		if(data < nodeToRemove.getData()) {
		nodeToRemove.setLeftchild(deleteNode(nodeToRemove.getLeftchild(), data));
		}
		else if(data > nodeToRemove.getData()){
		nodeToRemove.setRightchild(deleteNode(nodeToRemove.getRightchild(), data));
		}
		
		else { 
			if(nodeToRemove.getRightchild()==null && nodeToRemove.getLeftchild()==null) {
			//System.out.println("Node has no child nodes - Removing a leaf node");
			return null;
		}
		//if node has 1 child - Right child present
		if(nodeToRemove.getLeftchild()==null) {
			Node tempNode = nodeToRemove.getRightchild();
			nodeToRemove = null;
			return tempNode;
		}
		//if node has 1 child - Left child present
		else if(nodeToRemove.getRightchild()==null) {
			Node tempNode = nodeToRemove.getLeftchild();
			nodeToRemove = null;
			return tempNode;
		}
		//if node has 2 children
		//First get predecessor or successor	
		Node tempnode = getPredecessor(nodeToRemove.getLeftchild());
		nodeToRemove.setData(tempnode.getData());
		//tempnode = null;
		nodeToRemove.setLeftchild(deleteNode(nodeToRemove.getLeftchild(), tempnode.getData()));
	}
		return nodeToRemove;
		
	}
	//same thing can be done with successor - by getting the max value from left subtree
	public Node getPredecessor(Node node) {
		if(node.getRightchild()!=null) 
			return getPredecessor(node.getRightchild());
			System.out.println("Predecessor is: " + node);
			return node;
				
	}
	
	public int calcHeight() {
		//if no tree exists
		if(root == null) {
			return -1;
		}
		else
		//calling calcHeight function
		return calcHeight(root);
		
	}
	
	public int calcHeight(Node node) {
		//No child
		if(node.getLeftchild()==null && node.getRightchild()==null) {
			node.setHeight(1);
		}
		//2 child
		if(node.getLeftchild()!=null && node.getRightchild()!=null) {
			node.setHeight(Math.max(calcHeight(node.getLeftchild()),calcHeight(node.getRightchild()))+1);
		}
		//1 child - Left child
		if(node.getLeftchild()!=null && node.getRightchild()==null) {
		node.setHeight(calcHeight(node.getLeftchild())+1);
		}
		//1 child - Right child
		else if(node.getLeftchild()==null && node.getRightchild()!=null) {
		node.setHeight(calcHeight(node.getRightchild())+1);	
		}
		return node.getHeight();
	}
	
}
	

