package Lab1;

public class PersonMain {
	public static void main(String[] args) {
        // Create an object using parameterized constructor
        Person person = new Person("Divya", "Bharathi", Gender.F, 20, 85.55, "1234567890");
        
        // Display details
        person.displayDetails();
    }

}
