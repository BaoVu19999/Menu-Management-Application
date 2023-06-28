import java.text.DecimalFormat;

public class BST {

	private BSTNode root;
	
	//no-arg constructor
	public BST() {
		root = null;
	}
	
	//insert method calling the helper method
	public void insert(MenuItem mi) {
		root = insert(root, mi);
	}
	//helper method insert menu item node into binary tree start with root
	private BSTNode insert(BSTNode root, MenuItem mi) {
		if (root == null) {
			return new BSTNode(mi);
		}
		if (mi.compareTo(root.getData()) < 0) {
			root.setLeft(insert(root.getLeft(), mi));
		} else if (mi.compareTo(root.getData()) > 0) {
			root.setRight(insert(root.getRight(), mi));
		}
		return root;
	}
	//preorder traversal calling helper method
	public void preorder() {
		preorderTraversal(root);
	}

	/*
	 * Internal private method to do pre order traversal.We will pass the root node
	 * to start with and will visit the tree recursively using the following path
	 * current-left-right
	 */
	private void preorderTraversal(BSTNode node) {
		// We will continue until null or empty node is found
		if (node != null) {
			// Print the node
			System.out.println(node.getData());
			// visit the left subtree until the leaf node
			inorderTraversal(node.getLeft());
			// process the same step for the right node
			inorderTraversal(node.getRight());
		}
	}
	//post order traversal method call helper method
	public void postorder() {
		postorderTraversal(root);
	}

	/*
	 * Internal private method to do post-order traversal.We will pass the root node
	 * to start with and will visit the tree recursively using the following path
	 * right-left-current
	 */
	private void postorderTraversal(BSTNode node) {
		// We will continue until null or empty node is found
		if (node != null) {
			// visit the left subtree until the leaf node
			inorderTraversal(node.getLeft());
			// process the same step for the right node
			inorderTraversal(node.getRight());
			// Print the node
			System.out.println(node.getData());
		}
		
	}
	//in order traversal method call helper method below
	public void inorder() {
		inorderTraversal(root);
	}

	/*
	 * Internal private method to do in order traversal.We will pass the root node
	 * to start with and will visit the tree recursively using the following path
	 * left-current-right
	 */
	private void inorderTraversal(BSTNode node) {
		// We will continue until null or empty node is found
		if (node != null) {
			// visit the left subtree until the leaf node
			inorderTraversal(node.getLeft());
			// Print the node
			System.out.println(node.getData());
			// process the same step for the right node
			inorderTraversal(node.getRight());
		}
	}
	//size method that calculate the method of tree
	public int size(BSTNode node) {
		int size = 0;
		if (root == null) {
			return 0;
		}
		// for each node increment the size and left and right size child
		size = 1 + size(root.getLeft()) + size(root.getRight());
		return size;

	}
	//depth method calulate the depth of the binary tree
	public int Depth(BSTNode root) {

		if (root == null) {
			return 0;
		}
		int leftDepth = Depth(root.getLeft());
		int rightDepth = Depth(root.getRight());

		// return if leftdept is greater than rightdept add 1 to leftdepth
		// if leftdepth is less than rightdepth add 1 to rightdepth
		return leftDepth > rightDepth ? leftDepth + 1 : rightDepth + 1;

	}
	//call the helper method calculate the quantities of menu items
	public int getTotalQty() {
		return recGetTotalQty(root);
	}
	// helper method return 0 if node is null and return the total node of the tree both left and right
	private int recGetTotalQty(BSTNode node) {
		if (node == null) {
			return 0;
		}
		return (node.getData().getQty() + recGetTotalQty(node.getLeft()) 
				+ recGetTotalQty(node.getRight()));
	}
	
	//search method search the name of menu item 
	public MenuItem search(String name) {
		return searchItem(name, root);
	}

	// Helper method for search
	public MenuItem searchItem(String name, BSTNode node) {
		if (name.equalsIgnoreCase(node.getData().getName())) {
			return node.getData();
		} else if (node.getLeft() != null) {
			return searchItem(name, node.getLeft());
		} else if (node.getRight() != null) {
			return searchItem(name, node.getRight());
		} else
			return null;

	}
	//calculate the total of the bill by call helper method 
	public double getTotalBeforeTax() {
		return totalBeforeTax(root);
	}
	// helper method
	private double totalBeforeTax(BSTNode node) {
		if (node == null) {
			return 0;
		}
		MenuItem item = node.getData();
		return item.getPrice() * item.getQty() 
				+ totalBeforeTax(node.getLeft()) 
				+ totalBeforeTax(node.getRight());
	}
	//calculate the tax method by call helper method
	public double getTax() {
		return getTotalTax();
	}
	// helper method for total tax 8%
	private double getTotalTax() {
		double taxRate = 0.08;
		double total = taxRate * getTotalBeforeTax();
		return total;
	}
	//calculate the tip 20%  call helper method type of recursive 
	public double getTip() {
		return getTotalTip();
	}
	//helper method
	public double getTotalTip() {
		double tip = 0.2;
		double totalTip = tip * getTotalBeforeTax();
		return totalTip;
	}
	// calculate the total of the bill 
	public double getGrandTotal() {
		double total = (getTotalBeforeTax() - getTax()) + getTip();
		return total;
	}
	//The toString method format nicely like a receipt 
	public String toString() {
		DecimalFormat df = new DecimalFormat("$#,###.##");
		String result = " ";
		result += "Downtown Cafe"  ;
		result += "\n--------------------------------------------";
		result += "\nItem    Price    Qty      Total" ;
		result += "\n--------------------------------------------";
		
			result += "\n" + getToString(root);
		result += "\n--------"
				+ "------------------------------------";
		
		result += "\nTotal:  " + df.format(getTotalBeforeTax());
		result += "\nTax:   "   + df.format(getTax());
		result +=  "\nTip:   "  + df.format(getTip());
		result += "\n--------------------------------------------";
		result += "\nGrant Total:   " + df.format(getGrandTotal()); 
		return result;
	}
	// helper method of tostring format the menu items into alphabet order
	  public String getToString(BSTNode node){
		    if(node != null){
		        String s = getToString(node.getLeft());
		        s += node.getData().toString() + System.lineSeparator();
		        s += getToString(node.getRight());
		        return s;
		    }
		    return "";
		  }
}
