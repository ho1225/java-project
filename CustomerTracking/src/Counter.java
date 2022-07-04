
public class Counter {
	
	
	//instance vars
	
	int count;
	
	//constructor
	public Counter(int initialCount) {
		this.setCount(initialCount);
	}
	
	//methods
	
	public void increment() {
		this.count++;
	}
	
	public int getCount() {
		return this.count;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
}
