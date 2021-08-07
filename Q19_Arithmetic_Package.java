import java.util.Scanner;
import Q19_Arithmetic.*;
class Q19_Arithmetic_Package
{
	public static void main(String args[])
	{
		Scanner ip=new Scanner(System.in);
		float a,b;
		System.out.print("\n----------------------------------\nEnter One Integer     : ");
		a=ip.nextFloat();
		System.out.print("\nEnter Another Integer : ");
		b=ip.nextFloat();
		
		Arithmetic package_object=new Arithmetic();
		
		System.out.println("\n----------------------------------\nADDITION\n----------------------------------");
		System.out.println("\na                     : "+a+"\nb                     : "+b+"\nSum("+a+"+"+b+")          : "+package_object.Add(a,b));
		System.out.println("\n----------------------------------\nSUBTRACTION\n----------------------------------");
		System.out.println("\na                     : "+a+"\nb                     : "+b+"\nDifference("+a+"-"+b+")   : "+package_object.Subtract(a,b));
		System.out.println("\n----------------------------------\nMULTIPLICATION\n----------------------------------");
		System.out.println("\na                     : "+a+"\nb                     : "+b+"\nProduct("+a+"*"+b+")      : "+package_object.Multiply(a,b));
		System.out.println("\n----------------------------------\nDIVISION\n----------------------------------");
		System.out.println("\na                     : "+a+"\nb                     : "+b+"\nQuotient("+a+"/"+b+")     : "+package_object.Divide(a,b));
		System.out.println("\n----------------------------------\nMODULO\n----------------------------------");
		System.out.println("\na                     : "+a+"\nb                     : "+b+"\nReminder("+a+"/"+b+")     : "+package_object.Modulo(a,b)+"\n----------------------------------");
		
	}
}
