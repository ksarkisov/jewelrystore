/*Katherine Sarkisov Period 6 1/29/20
 * Necklace Class - maintain length
 */

public class Necklace extends Jewelry {

	private int length;
	
	//constructor
	public Necklace(String name, String metal, String stone, int quantity, int cost, int l) {
		
		super(name, metal, stone, quantity, cost);
		length = l;
	}
	
	public String toString() {
		
		String toReturn = super.toString();
		toReturn += "\nLength: " + length;
		return toReturn;
	}
}
