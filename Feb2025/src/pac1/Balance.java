package pac1;
//import.AccountBalance;
//^fix import statement

public class Balance {
String name;
double bal;

	public Balance(String n, double b)
	{
		name=n;
		bal=b;
	}
	
	public void show() {
		if(bal>0)
			System.out.println(name + ", Balance is:$ " + bal);
		else
		System.out.println(name + "Balance is ZERO");
	}
}
