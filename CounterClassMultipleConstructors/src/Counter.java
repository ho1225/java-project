
public class Counter {
	//instance vars
	int count;
	
	//constructor
	
	public Counter(int start) {
		this.count = start;
	}
	
	public Counter() {
		this.count = 0;
	}
	

	public static void main(String[] args) {
		
		Counter counter1 = new Counter(2);
		System.out.println(counter1.count);
		
		Counter counter2 = new Counter();
		System.out.println(counter2.count);
	}

}
