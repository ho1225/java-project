/**
 * 
 * @author sean.s.ho
 *
 */
public class Counter {
	// instance variables
	/**
	 * store internal count
	 */
	int count;
	
	//methods
	
	public int increment() {
		this.count++;
		return this.count;
	}
	
	public int decrement() {
		this.count--;
		return this.count;
	}
	
	public int getCount() {
		return this.count;
	}
	
	
}
