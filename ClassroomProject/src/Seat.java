
public class Seat {
	
	//instance vars
	
	int row;
	
	int column;
	
	//there is student, other null
	Student studentInSeat;
	
	
	//constructor
	
	public Seat(int row, int column) {
		this.row = row;
		this.column = column;
	}
	
	//methods
	
	public void putStudentInSeat(Student student) {
		this.studentInSeat = student;
	}
	
	public String toString() {
		return this.row + ", " + this.column + ": " +this.studentInSeat;
	}
	
}
