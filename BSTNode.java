
public class BSTNode {

	private MenuItem data;
	private BSTNode left;
	private BSTNode right;
	
	public BSTNode(MenuItem data) {
		this.data = data;
	}
	public BSTNode(MenuItem data, BSTNode left, BSTNode right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}

	public MenuItem getData() {
		return data;
	}

	public BSTNode getLeft() {
		return left;
	}

	public BSTNode getRight() {
		return right;
	}

	public void setData(MenuItem data) {
		this.data = data;
	}

	public void setLeft(BSTNode left) {
		this.left = left;
	}

	public void setRight(BSTNode right) {
		this.right = right;
	}
	
	
}
