/*Katherine Sarkisov Period 6 1/31/20
 * Jewelry store client file - test out methods
 */

public class Main {

	public static void main(String[] args) {
		
		Jewelry one = new Jewelry("a", "gold", "diamond", 2, 100);
		Jewelry two = new Jewelry("ac", "silver", "diamond", 4, 100);
		Jewelry three = new Jewelry("b", "gold", "diamond", 2, 150);
		//public Necklace(String name, String metal, String stone, int quantity, int cost, int l) {
		Ring four = new Ring("d", "gold", "", 3, 300, "princess", 2.2);
		Jewelry[] jewels = {one, two, three};
		//System.out.println("a".compareTo("b"));

		//System.out.println(one.getName());

		JewelryStore store = new JewelryStore(jewels);


		store.display();
	}

}
