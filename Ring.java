/*Katherine Sarkisov Period 6 1/29/20
 * Ring Class - maintain carats and type of cut
 */

public class Ring extends Jewelry {

	private String cut;
	private double carats;
	
	//constructor
	public Ring(String name, String metal, String stone, int quantity, int cost, String c, double carat) {
		
		super(name, metal, stone, quantity, cost);
		cut = c;
		carats = carat;
	}
	
	public String toString() {
		
		String toReturn = super.toString();
		toReturn += "\nCut: " + cut + "\nCarats: " + carats;
		return toReturn;
	}
}
