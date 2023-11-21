/**
 *Author:ASHIREDDYGARI SREEJA 
 *Student ID:239457520
 *Lab1,Part1
 *Any and all work in this file is my own.
 */

package DataStructures;
public class Course  {
    private final int MAX_ENROLLED_STUDENTS = 5;
    private Student[] students;
    private int enrollment;
    private Instructor instructor;
    private String courseCode;
    private String courseName;

    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.students = new Student[MAX_ENROLLED_STUDENTS];
        this.enrollment = 0;
    }

    public boolean enroll(Student student) {
        if (enrollment < MAX_ENROLLED_STUDENTS) {
            students[enrollment] = student;
            enrollment++;
            return true;
        } else {
            return false; // Course is full, cannot enroll the student.
        }
    }

    public boolean unenroll(Student student) {
        if (enrollment > 0) {
            for (int i = 0; i < enrollment; i++) {
                if (students[i] != null && students[i].equals(student)) {
                    students[i] = null;
                    enrollment--;
                    return true;
                }
            }
        }
        return false; // Student not found or course is empty, cannot unenroll.
    }

    public void assignGrade(Student student, double grade) {
        for (int i = 0; i < enrollment; i++) {
            if (students[i] != null && students[i].equals(student)) {
                student.assignGrade(grade);
                return;
            }
        }
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    @Override
    public String toString() {
        return "Course[code=" + courseCode + ", name=" + courseName + ", instructor=" +
                instructor + ", enrolled=" + enrollment;
    }
    public static void main(String args[]) {
    	Instructor instructor = new Instructor(1234, "Jamie Remstone", "Computer Science");
    	Course course = new Course("COSC1234", "COSC course 1");
    	course.setInstructor(instructor);

    	Student student1 = new Student(1, "Alice");
    	Student student2 = new Student(2, "Bob");

    	course.enroll(student1);
    	course.enroll(student2);

    	course.assignGrade(student1, 95.5);
    	course.assignGrade(student2, 88.0);

    	course.unenroll(student1);

    	System.out.println(course); // Output: Course[code=COSC1234, name=COSC course 1, instructor=Instructor[id=1234, name=Jamie Remstone, department=Computer Science], enrolled=1]

    }
}

