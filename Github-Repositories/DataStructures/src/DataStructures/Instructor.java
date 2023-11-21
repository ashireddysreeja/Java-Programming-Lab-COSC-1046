/**
 *Author:ASHIREDDYGARI SREEJA 
 *Student ID:239457520
 *Lab1,Part1
 *Any and all work in this file is my own.
 */



package DataStructures;
public class Instructor extends Person {
    private String department;

    public Instructor(int id, String name, String department) {
        super(id, name);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Instructor[id=" + id() + ", name=" + name() + ", department=" + department + "]";
    }
    public static void main(String args[]) {
    	Instructor instructor1 = new Instructor(3456, "Jamie Remstone", "Computer Science");

    	System.out.println(instructor1); // Output: Instructor[id=3456, name=Jamie Remstone, department=Computer Science]

    }
}