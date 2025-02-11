package pac1;

public class L3_ConditionalStatements {
	public static void main(String[] args) {
		int a=2;
		int b=45;
		if(b>a)
		{
			System.out.println("B is Bigger");
		}
		else
		{
			System.out.println("A is Bigger");
		}
		
		for(int i=0; i<=4; i++)
				switch(i) {
			case 0:
				System.out.println("i is zero"); break;
			case 1:
				System.out.println("i is one"); break;
			case 2:
				System.out.println("i is 2"); break;
			case 3:
				System.out.println("i is 3"); break;
			default:
				System.out.println("i is greater than 3"); break;
			}
	
	/*While statement*/
	int n=5;
	while(n>0)
	{System.out.println(n);
	n--;
	}
	
	
	//Do statement
	int m=5;
	{
		System.out.println(m);
		m--;
	}while(m>0);
	
	
	//FOR loop
	for(int j=5; j>0; j--)
	{
		System.out.println("j value:" + j);
	}
	
	
	
}

}
