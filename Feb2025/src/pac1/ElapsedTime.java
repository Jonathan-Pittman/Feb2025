package pac1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ElapsedTime {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		long start,end;
		int i=0, sum=0;
		String str=null;
		System.out.println("Timing a for loop from 0 to 1,000,000");
		start=System.currentTimeMillis();
		System.out.println("Start Time is: " +start);
		
		for(int j=0; j<1000000; j++);
		
		end=System.currentTimeMillis();
		
		System.out.println("Elapsed Time: " +(end-start));
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		do
		{
			System.out.println("Enter 0 to Quit");
			str=br.readLine();
			i=Integer.parseInt(str);
			if(i==0) System.exit(0);
			sum +=i;
			System.out.println("Current time is: " +sum);
			
		}while(i!=0);
		
		
	}

}
