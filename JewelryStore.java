/*Katherine Sarkisov Period 6 1/29/20
 * Jewelry Store Class - maintain all jewelry in store (jewelry can be ring or necklace)
 * Adding a ring or jewelry object.....finish
 */

public class JewelryStore {

	private Jewelry[] allJewelry;
	
	public JewelryStore(Jewelry[] j) {
		
		allJewelry =  new Jewelry[1];
		allJewelry[0] = j[0];

		for(int i = 1; i < j.length; i ++) {
      System.out.println("toadd :"  + i);
			this.add(j[i]);
      System.out.println("added :"  + i);
		}
	}
	
	
	//copy constructor
	public JewelryStore(JewelryStore other) {
		
		allJewelry =  new Jewelry[other.allJewelry.length];
		
		for(int i = 0; i < other.allJewelry.length; i ++) {
			
			allJewelry[i] = other.allJewelry[i];
		}
	}
	
	
	//add jewelry object to array, if exists then update the quantity
	public void add(Jewelry toAdd) {	

		
    if(!this.isDuplicate(toAdd)){//check if toAdd was a duplicate

      Jewelry[] temp = new Jewelry[allJewelry.length];

      for(int i = 0; i < allJewelry.length; i ++){
        
        temp[i] = allJewelry[i];
      }

      allJewelry = new Jewelry[temp.length + 1];
      int location = allJewelry.length;

      for(int loc = 0; loc < temp.length; loc ++){

        if(temp[loc].compare(toAdd) > 0){
          allJewelry[loc] = toAdd;
          location = loc;
          loc = allJewelry.length;
        }
        else{
          allJewelry[loc] = temp[loc];
        }
      }

      for(int loc = location; loc < allJewelry.length; loc ++){
        allJewelry[loc] = temp[loc - 1];
      }
	  }
  }
	private boolean isDuplicate(Jewelry toAdd){
    System.out.println("isdup" + allJewelry.length);
    System.out.println(toAdd);
		for(int i = 0; i < allJewelry.length; i ++){
			System.out.println(i);
			System.out.println(allJewelry.length);//test
			
			if(toAdd.compare(allJewelry[i]) == 0){
				allJewelry[i].addQuantity(toAdd.getQuantity());
				return true;
			}
		}	
		return false;
	}




		/*boolean isFound = false;
		
		for(int i = 0; i < allJewelry.length; i ++) {
			
			if(allJewelry[i].getName().compareTo(toAdd.getName()) == 0) {
				allJewelry[i].addQuantity(toAdd.getQuantity());
				isFound = true;
			}
		}
		
		if(!isFound) {
			
			Jewelry[] temp = allJewelry;
			
			allJewelry = new Jewelry[temp.length + 1];
			
			for(int jewel = 0; jewel < temp.length; jewel ++) {//fix
				System.out.println(toAdd.compare(temp[jewel]));

				if(toAdd.compare(temp[jewel]) < 0 && !isFound){
					System.out.println(toAdd.compare(temp[jewel]));
					allJewelry[jewel] = temp[jewel];
					isFound = !isFound;
					jewel --;
				}
				else {
					allJewelry[jewel] = toAdd;
					allJewelry[jewel + 1] = temp[jewel];
				}
			}
		}*/
	
	
	
	//remove first occurrence of name from allJewelry array
	public void remove(String name) {
		
		Jewelry[] temp = allJewelry;
		allJewelry = new Jewelry[temp.length - 1];
		int tempLoc = 0;
		
		for(int i = 0; i < allJewelry.length; i ++) {
			
			if(!temp[i].getName().equals(name)){
				
				allJewelry[i] = temp[tempLoc];
				tempLoc ++;
			}
			else {
				name = "";
			}
		}
	}
	
	
	//print list of all the jewelry in the store
	public void display() {
		
		for(int i = 0; i < allJewelry.length; i ++) {
			System.out.println(allJewelry.length + " length " + i);
			System.out.println("\n" + allJewelry[i].toString());
		}
	}
	
	
	//return true if name was found in array, else false
	public boolean search (String name) {//finish
		
		//binary search code
		int startLoc = 0;
		int endLoc = allJewelry.length - 1;
			
		while(startLoc <= endLoc){
				
			int midIndex = (startLoc + endLoc)/2;
				
			if(allJewelry[midIndex].getName().equals(name)){
				return true;
			}
			//else if(allJewelry[midIndex].getName().compareTo(name)  ){
				//endLoc = midIndex - 1;
			//}
			else{
				startLoc = midIndex + 1;
			}
		}
		return false;
	}
	
	
}
