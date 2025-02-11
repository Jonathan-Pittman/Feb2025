package pac1;

public class TC_UseStatic {
	static int num1 = 3;
	static int num2;
	//Cannot change name later in code since it is FINAL string here!
	static final String name = "Jonathan";
	static
	{
		System.out.println("Static block initialized");
		num2=num1*3;
	}
	
	static void mymethod(int num3)
	{
		System.out.println("Num1 Value: " +num1);
		System.out.println("Num2 Value: " +num2);
		System.out.println("Num3 Value: " +num3);
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mymethod(300);	
	}

}

/*package pac1;

public class TC_UseStatic {
	
	static int num1 = 3;
	static int num2; 
	
	static
	{
		System.out.println("Static block initialized.");
		num2 = num1*3;
	}
	
	static void mymethod(int num3)
	{
		System.out.println("Num1 value: "+num1);
		System.out.println("Num1 value: "+num2);
		System.out.println("Num1 value: "+num3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mymethod(300);
	}

}
*/
