import java.util.ArrayList;

public class Classroom {

	// instance vars
	
	String buildingName;
	
	String roomName;
	
	ArrayList<Student> students;
	
	Seat[][] seats;
	
	
	//costructor
	
	public Classroom(String buildingName, String roomName, int rows, int columns) {
		this.buildingName = buildingName;
		this.roomName = roomName;
		this.seats = new Seat[rows][columns];
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				seats[i][j] = new Seat(i, j);
			}
		}
		
		//initialize list of students
		this.students = new ArrayList<Student>();
		
	}
	
	public void addStudent(Student student) {
		this.students.add(student);
	}
	
	public void assignStudentToSeat(Student student) {
		
		int rows = this.seats.length;
		int columns = this.seats[0].length;
		
		for (int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				
				if(this.seats[i][j].studentInSeat == null) {
					this.seats[i][j].putStudentInSeat(student);
					return; //exit the loop
				}
				
			}
		}
		
	}
	
	public void printAllStudent() {
		System.out.println("Student in class: ");
		for(Student student: this.students) {
			System.out.println(student);
		}
	}
	
	public String toString() {
		String s = "\n";
		int rows = this.seats.length;
		int columns = this.seats[0].length;
		
		for (int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				
				s += this.seats[i][j] + "\t";
			}
			s += "\n";
		}
		return s;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Classroom hunstman = new Classroom("HH", "105", 10, 5);
		
		Student finegan = new Student("finegan", "fineganw");
		Student bob = new Student("bob", "roberts");
		
		hunstman.addStudent(finegan);
		hunstman.addStudent(bob);
		
		hunstman.assignStudentToSeat(finegan);
		hunstman.assignStudentToSeat(bob);
		
		hunstman.printAllStudent();
		
		System.out.println(hunstman); //call toString
	}

}
