/**
 *Author:ASHIREDDYGARI SREEJA 
 *Student ID:239457520
 *Lab1,Part1
 *Any and all work in this file is my own.
 */



package DataStructures;

public class Test {
    public static void main(String[] args) {
        
        Student student1 = new Student(1, "Sathish Reddy");
        Student student2 = new Student(2, "Dishon");
        Student student3 = new Student(3, "Sreeja");
        Student student4 = new Student(4, "santosh");
        Student student5 = new Student(5, "Sahil");
        Student student6 = new Student(6, "Shiny");
        Student student7 = new Student(7, "sumithra");

       
        System.out.println("Students before assigning averages:");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
        System.out.println(student5);
        System.out.println(student6);
        System.out.println(student7);

       
        student1.assignGrade(Math.random() * 101);
        student2.assignGrade(Math.random() * 101);
        student3.assignGrade(Math.random() * 101);
        student4.assignGrade(Math.random() * 101);
        student5.assignGrade(Math.random() * 101);
        student6.assignGrade(Math.random() * 101);
        student7.assignGrade(Math.random() * 101);

        
        System.out.println("\nStudents after assigning averages:");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
        System.out.println(student5);
        System.out.println(student6);
        System.out.println(student7);

       
        Instructor instructor = new Instructor(101, "sathish","Data Structures");

        
        System.out.println("\nInstructor:");
        System.out.println(instructor);

        
        Course course1 = new Course("2001", "New Course");
        Course course2 = new Course("2002", "Graphic DSSesign");

        
        course1.setInstructor(instructor);
        course2.setInstructor(instructor);

        
        System.out.println("\nCourses with Instructors:");
        System.out.println(course1);
        System.out.println(course2);

        
        course1.enroll(student1);
        course1.enroll(student2);
        course1.enroll(student3);
        course1.enroll(student4);
        course1.enroll(student5);

        course2.enroll(student6);
        course2.enroll(student7);

       
        System.out.println("\nCourses after enrolling students:");
        System.out.println(course1);
        System.out.println(course2);

        
        student1.assignGrade(Math.random() * 101);
        student2.assignGrade(Math.random() * 101);
        student3.assignGrade(Math.random() * 101);
        student4.assignGrade(Math.random() * 101);
        student5.assignGrade(Math.random() * 101);
        student6.assignGrade(Math.random() * 101);
        student7.assignGrade(Math.random() * 101);

   
        System.out.println("\nStudents after assigning grades:");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
        System.out.println(student5);
        System.out.println(student6);
        System.out.println(student7);

        
        course1.unenroll(student1);
        course1.unenroll(student3);

        
        System.out.println("\nCourse 1 after unenrolling students:");
        System.out.println(course1);
    }
}
