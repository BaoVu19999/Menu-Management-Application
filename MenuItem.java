import java.text.DecimalFormat;

public class MenuItem implements Comparable<MenuItem> {

	private String name;
	private int qty;
	private double price;

	public MenuItem(String name, int qty, double price) {
		this.name = name;
		this.qty = qty;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getQty() {
		return qty;
	}

	public double getPrice() {
		return price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean equals(Object other) {
		if (other instanceof MenuItem) {
			MenuItem otherMenuItem = (MenuItem) other;
			if (this.name.equalsIgnoreCase(otherMenuItem.name)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("$#,###.##");
		int quantities = 0;
		return  name +  "   " 
				+ df.format(price) + "   "+ qty + "   " 
				+ df.format(qty * price);
	}

	public int compareTo(MenuItem o) {
		// it will store the return result of compareTo method 1,0,-1 type of recursion
		int comp = this.name.compareToIgnoreCase(o.name);

		//check for equality
		if (comp == 0) {
			return 0;

		}
		return comp;

	}
	
}
