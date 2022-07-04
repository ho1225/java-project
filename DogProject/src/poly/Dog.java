package poly;

public class Dog {
	
	//static variables
	
	static String DEFAULT_NAME = "Genericdog";
	
	static double DEFAULT_AGE = .5;
	
	static double DEFAULT_WEIGHT = 1.75;
	
	static String DEFAULT_FOOD = "Generic dog food";
	
	static String DEFAULT_BARK = "Bark!"; 

	static int DEFAULT_NUM_TIMES_BARK = 1;
	
	static final double WEIGHT_GAIN_INCREASE = 0.01;
	
	// instance vars;
	String name;
	
	double age;
	
	String owner;
	
	double weight;
	
	//constructor

	public Dog(String name, double age, String owner, double weight) {
		this.name = name;
		this.age = age;
		this.owner = owner;
		this.weight = weight;
	}
	
	public Dog(String name, double age) {
		//call first constructor with 2 givens values and 2 default values
		this(name, age, null, Dog.DEFAULT_WEIGHT);
	}
	
	public Dog() {
		this(Dog.DEFAULT_NAME, Dog.DEFAULT_AGE);
	}
	
	//methods
	
	public double eat(double amount, String food) {
		System.out.println(this.name + " is eating " + amount + " of " + food);
		
		double weightGained = Dog.WEIGHT_GAIN_INCREASE * amount;
		
		this.weight += weightGained;
		
		return this.weight;
	}
	
	public double eat(double amount) {
		return this.eat(amount, Dog.DEFAULT_FOOD);
	}
	
	public double eat(String amount) {
		
		double returnVal = 0.0;
		
		try {
			double amountAsDouble = Double.parseDouble(amount);
			
			//call second version of eat method
			returnVal = this.eat(amountAsDouble);
		} catch (NumberFormatException e) {
			//print friendly message
			System.out.println(amount + ": can't be parsed as double.");
		}
		
		return returnVal;
	}
	
	public void bark(int numTimes, String barkSound) {
		
		System.out.println(this.name + " says: ");
		
		for(int i = 0; i < numTimes; i++) {
			System.out.println(barkSound);
		}
		
		System.out.println();
	}
	
	public void bark(String barkSound, int numTimes) {
		//call first bark method with given number of times and given bark sound
		this.bark(numTimes, barkSound);
	}
	
	public void bark() {
		this.bark(Dog.DEFAULT_NUM_TIMES_BARK, Dog.DEFAULT_BARK);
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public String toString() {
		return this.name + ", " + this.weight + ", " + this.age+ ", " + this.owner;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog1 = new Dog("Princess", 12.7, "Brandon", 9.3);
		
		Dog dog2 = new Dog("Fido", 5.5);
	
		Dog dog3 = new Dog();
		
		System.out.println(dog1);
		System.out.println(dog2);
		System.out.println(dog3);
		
		System.out.println("\n");
		
		dog3.setName("Samantha");
		System.out.println(dog3);
		
		System.out.println("\n");
		
		//call first eat method
		System.out.println(dog1.eat(2.1, "Beneful"));
		
		//second eat method
		System.out.println(dog2.eat(1.1));
		
		//second method with int (widening)
		System.out.println(dog3.eat(1));
		
		System.out.println(dog3.eat("12.3"));
		
		dog3.eat("twelve");
		
		System.out.println(dog3.getWeight());
		
		//call the first bark method
		
		dog1.bark(2, "Woof!");
		
		dog1.bark("Help me!", 1);
		
		dog1.bark();
	}


	
}
