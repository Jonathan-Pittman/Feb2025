package pac1;
import Package1.*;
import Package1.Student;
import Package2.Student;
import Package2.*;


public class Sample_pPac {
	public static void main(String[] args) {
		
Student stu1=new Student();
		
		stu1.sum();
		
		Teacher te1=new Teacher();
		te1.mul();
		
		Package2.Student stu2=new Package2.Student();
		
		stu2.sub();
		
		Package2.Course cour=new Package2.Course();
		cour.div();

		
		
	}

}
