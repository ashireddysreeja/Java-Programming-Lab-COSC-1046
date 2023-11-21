/**
 *Author:ASHIREDDYGARI SREEJA 
 *Student ID:239457520
 *Lab1,Part1
 *Any and all work in this file is my own.
 */

package DataStructures;
public class Person {
    private final int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int id() {
        return id;
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Person person = (Person) obj;

        if (id != person.id) {
            return false;
        }

        return name.equals(person.name);
    }

    @Override
    public String toString() {
        return "Person [ id=" + id + ", name=" + name+" ]";
    }
    public static void main(String args[]) {
    	Person person1 = new Person(1234, "John Smythe");
    	Person person2 = new Person(2006, "sathish Reddy");

    	System.out.println(person1); 
    	System.out.println(person2); 

    	person1.setName("Sathish");
    	System.out.println(person1); 

    	System.out.println(person1.equals(person2)); 

    }
}
