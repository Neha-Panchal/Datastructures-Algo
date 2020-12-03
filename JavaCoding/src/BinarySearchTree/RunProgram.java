package BinarySearchTree;

public class RunProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinarySearchTreeImplementation binarySearchTree = new BinarySearchTreeImplementation();
		binarySearchTree.insertNode(10);
		binarySearchTree.insertNode(12);
		binarySearchTree.insertNode(5);
		binarySearchTree.insertNode(4);
		binarySearchTree.insertNode(20);
		binarySearchTree.insertNode(8);
		binarySearchTree.insertNode(7);
		binarySearchTree.insertNode(15);
		binarySearchTree.insertNode(13);
		
		System.out.println("Maximum value: " + binarySearchTree.getMaxValue());
		System.out.println("Minimum value: " + binarySearchTree.getMinValue());
		System.out.println();
		
		System.out.println("Displaying pre-order traversal: ");
		binarySearchTree.traverseTree(1);
		System.out.println();
		
		System.out.println("Displaying in-order traversal: ");
		binarySearchTree.traverseTree(2);
		System.out.println();
		
		System.out.println("Displaying post-order traversal: ");
		binarySearchTree.traverseTree(3);
		System.out.println();
		
		System.out.println("Displaying Tree after deleting requested node: ");
		binarySearchTree.delete(20);
		
		System.out.println("Displaying pre-order traversal: ");
		binarySearchTree.traverseTree(1);
		System.out.println();
		
		
		System.out.println("Height of the tree is:" + binarySearchTree.calcHeight());
		
	
		
			}

}
