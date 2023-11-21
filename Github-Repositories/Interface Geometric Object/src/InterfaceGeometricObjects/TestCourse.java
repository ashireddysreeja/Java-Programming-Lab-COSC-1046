package InterfaceGeometricObjects;
public class TestCourse {
      public static void main(String[] args)
          throws CloneNotSupportedException {

 Course course1 = new Course("Advanced Java -Cosc1047");
 course1.addStudent("Sai");
 course1.addStudent("Vinod");
 course1.addStudent("Vijay");
// Clone course1
Course course2 = course1.clone(); 
course2.addStudent("Hari");
course2.addStudent("Vamshi"); // Display students in course1

System.out.println("Number of students in course-1 are : " 
   + course1.getNumberOfStudents());
String[] students = course1.getStudents();
     for (int i = 0; i < course1.getNumberOfStudents(); i++)
     System.out.print(students[i] + ", ");
     System.out.println();
     
     
     System.out.println("\nNumber of students in course-2 are : " 
          + course2.getNumberOfStudents());
String[] students2 = course2.getStudents();
for (int i = 0; i < course2.getNumberOfStudents(); i++)
System.out.print(students2[i] + ", ");
System.out.println();
}
}