/*Katherine Sarkisov Period 6 1/29/20
 * Jewelry Class - object for individual jewelry
 */

public class Jewelry {

	private String name;
	private String metal;
	private String stone;
	private int quantity;
	private int cost;
	
	//constructor
	public Jewelry(String n, String m, String s, int q, int c){
		
		name = n;
		metal = m;
		stone = s;
		
		if(q < 0 || c < 0)
			throw new IllegalArgumentException("Invalid cost or quantity!");
		
		quantity = q;
		cost = c;
	}
	
	public String toString() {
		
		String toReturn = "Name: " + name + "\nMetal: " + metal;
		toReturn += "\nStone: " + stone + "\nQuantity: " + quantity + "\nCost: " + cost;
		return toReturn;
	}
	
	
	//compare if calling object comes before or after the parameter
	public int compare(Jewelry other) {
		
		int nameDiff = name.compareTo(other.getName());
		
		if(nameDiff == 0)
			return cost - other.getCost();
		
		return nameDiff;
	}
	
	public String getName() {
		
		return name;
	}
	
	public int getCost() {
		
		return cost;
	}
	
	public void addQuantity(int q) {
		
		quantity += q;
	}
	
	public int getQuantity() {
		
		return quantity;
	}
}
