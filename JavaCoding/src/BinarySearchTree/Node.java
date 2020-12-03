package BinarySearchTree;

public class Node {

	private int data;
	private Node leftchild;
	private Node rightchild;
	private int height;
	
	public Node(int data) {
		// TODO Auto-generated constructor stub
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getLeftchild() {
		return leftchild;
	}

	public void setLeftchild(Node leftchild) {
		this.leftchild = leftchild;
	}

	public Node getRightchild() {
		return rightchild;
	}

	public void setRightchild(Node rightchild) {
		this.rightchild = rightchild;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", leftchild=" + leftchild + ", rightchild=" + rightchild + "]";
	}

}