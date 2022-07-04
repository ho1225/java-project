
public class Point {

	//instance vars
	
	int x;
	
	int y;
	
	int sum;
	
	//constructors
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		this.sum = x + y;
	}
	
	public Point() {
		//calls first constructor with default values, 0 and 0
		this(0,0);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point point1 = new Point(2, 4);
		System.out.println(point1.x);
		System.out.println(point1.y);
		System.out.println(point1.sum);
		
		Point point2 = new Point();
		System.out.println(point2.x);
		System.out.println(point2.y);
		System.out.println(point2.sum);
	}

}
