package pac1;

public class TC_Constructor {

	int a;
	int b;
	
	TC_Constructor(int a1, int b1)
	{
		// "this" is the keyword for constructors or methods
		this.a=a1;
		this.b =b1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TC_Constructor obj=new TC_Constructor(100, 200);
		System.out.println("The Value of a is: "+obj.a);
		System.out.println("The value of b is: " +obj.b);
		
		
	}

}
