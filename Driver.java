
public class Driver {
	public static void main(String[] args) {
		BST order1 = new BST();

		MenuItem item1 = new MenuItem("Coffee", 2, 2.45);
		MenuItem item2 = new MenuItem("Cookie", 3, 1.00);
		MenuItem item3 = new MenuItem("Cupcake", 1, 1.99);
		MenuItem item4 = new MenuItem("Pizza", 1, 2.50);
		MenuItem item5 = new MenuItem("Cookie", 3, 1.00);
		MenuItem item6 = new MenuItem("Cupcake", 1, 1.99);
		MenuItem item7 = new MenuItem("Pached Eggs", 2, 5.99);
		MenuItem item8 = new MenuItem("Smoked Salmon", 1, 12.25);
		MenuItem item9 = new MenuItem("Oatmeal", 1, 6.99);
		MenuItem item10 = new MenuItem("Yogurt", 1, 3.49);
		MenuItem item11 = new MenuItem("Bread", 3, 2.25);
		MenuItem item12 = new MenuItem("Green Salad", 1, 6.99);

		order1.insert(item1);
		order1.insert(item2);
		order1.insert(item3);
		order1.insert(item4);
		order1.insert(item5);
		order1.insert(item6);
		order1.insert(item7);
		order1.insert(item8);
		order1.insert(item9);
		order1.insert(item10);
		order1.insert(item11);
		order1.insert(item12);
		System.out.println(order1);

		BST order2 = new BST();
		MenuItem item13 = new MenuItem("Milkshake", 2, 3.95);
		MenuItem item14 = new MenuItem("Pie Apple", 3, 3.99);
		MenuItem item15 = new MenuItem("Orange Juice", 1, 8.99);
		MenuItem item16 = new MenuItem("Donut", 5, 2.50);
		MenuItem item17 = new MenuItem("Cake", 1, 11.00);
		MenuItem item18 = new MenuItem("Valina ice cream", 1, 3.99);
		MenuItem item19 = new MenuItem("Sandwiches ", 2, 5.99);
		MenuItem item20 = new MenuItem("Smoked Salmon", 1, 12.25);
		MenuItem item21 = new MenuItem("Oatmeal", 1, 6.99);
		MenuItem item22 = new MenuItem("Cereal", 1, 3.49);
		MenuItem item23 = new MenuItem("Bread", 3, 2.25);
		MenuItem item24 = new MenuItem("Green Salad", 1, 7.99);
		MenuItem item25 = new MenuItem("Cherreo", 1, 5.99);
		order2.insert(item13);
		order2.insert(item14);
		order2.insert(item15);
		order2.insert(item16);
		order2.insert(item17);
		order2.insert(item18);
		order2.insert(item19);
		order2.insert(item20);
		order2.insert(item21);
		order2.insert(item22);
		order2.insert(item23);
		order2.insert(item24);
		order2.insert(item25);
		System.out.println(order2);
	}
}
