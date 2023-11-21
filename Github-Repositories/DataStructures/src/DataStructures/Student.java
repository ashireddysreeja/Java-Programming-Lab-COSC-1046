/**
 *Author:ASHIREDDYGARI SREEJA 
 *Student ID:239457520
 *Lab1,Part1
 *Any and all work in this file is my own.
 */



package DataStructures;

public class Student extends Person {
    private double average;

    public Student(int id, String name) {
        super(id, name);
        this.average = 0.0;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    @Override
    public String toString() {
        return "Student[id=" + id() + ", name=" + name() + ", GPA=" + String.format("%.2f%%", average);
    }
    public static void main(String args[]) {
    	Student student1 = new Student(2345, "Anna Templeton");
    	student1.setAverage(78.85);

    	System.out.println(student1); // Output: Student[id=2345, name=Anna Templeton, GPA=78.85%]

    }

	public void assignGrade(double d) {
		// TODO Auto-generated method stub
		
	}
}

