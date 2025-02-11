//Includes questions 6, 7, 8, 

package Lab1;
enum Gender{
	M, F
}
public class Person {
     String firstName;
     String lastName;
     Gender gender;
     int age;
     double weight;
     String phoneNumber;

    // Default constructor
    public Person() {
        initializeDefaultValues();
    }

    // Method to initialize default values
    private void initializeDefaultValues() {
        this.firstName = "Divya";
        this.lastName = "Bharathi";
        this.gender = Gender.F;
        this.age = 20;
        this.weight = 85.55;
        this.phoneNumber = "Unknown";
    }

    // Parameterized constructor
    public Person(String firstName, String lastName, Gender gender, int age, double weight, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.phoneNumber = phoneNumber;
    }

    // Getter methods
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Method to display person details
    public void displayDetails() {
        System.out.println("Person Details:");
        System.out.println("__________________");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Phone Number: "+phoneNumber);
    }
}






/*package Lab1;

public class Person {
	String firstname;
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	String lastname;
	char gender;

	Person(String fname, String lname, char g)
	{
		this.firstname=fname;
		this.lastname=lname;
		this.gender=g;
		
	}
	
	public static void main(String[] args) {
	Person obj= new Person("Jonathan", "Pittman", "M");
	System.out.println("Person Details");
	System.out.println("_______________");
	System.out.println("First Name:"+obj.firstname);
	System.out.println("Lastname:"+obj.lastname);
	System.out.println("Gender:"+obj.gender);
	
	
	
	
		
	}

}*/
/*
//Troubleshoot output
package Lab1;

public class Person {
	String firstname;
	String lastname;
	char gender;
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	Person(String fname,String lname,char g)
	{
		this.firstname=fname;
		this.lastname=lname;
		this.gender=g;
		
		
	}
	
	
	public Person(String fname, String lname, String string) {
		// TODO Auto-generated constructor stub
	}

	public void displaydetails() {		
	System.out.println("Person Details");
	System.out.println("__________________");
	System.out.println("First Name:"+firstname);
	System.out.println("Last Name:"+lastname);
	
	
System.out.println("Last Name:"+gender);
	}


	public static void main(String[] args) {
		Person obj=new Person("Jonathan", "Pittman", "M");
		obj.displaydetails();
		
	}
	
}
*/



/*package Lab1;

public class Person {
	String firstname;
	String lastname;
	char gender;
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	Person(String fname,String lname,char g)
	{
		this.firstname=fname;
		this.lastname=lname;
		this.gender=g;
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Person obj=new Person("Saritha","Ramadurai",'F');
	System.out.println("Person Details");
	System.out.println("__________________");
	System.out.println("First Name:"+obj.firstname);
	System.out.println("Last Name:"+obj.lastname);
	
	System.out.println("Last Name:"+obj.gender);

	}

}
*/