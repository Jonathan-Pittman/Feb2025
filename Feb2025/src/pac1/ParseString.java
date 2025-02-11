package pac1;
import java.util.Scanner;

public class ParseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner("1,2,3,4,5,6,7,8").useDelimiter(",");
		while(scan.hasNextInt())
		{
			int num=scan.nextInt();
			if(num%2==0)
			{
				System.out.println(num);
			}
		}
	}

}
