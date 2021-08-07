import java.util.Scanner;
import Q18_Graphics.*;
class Q18_Graphics_Package
{
	public static void main(String args[])
	{
		Scanner ip=new Scanner(System.in);
		double l,w,b,h,s,r;
		System.out.println("\n--------------------------\nENTER DETAILS OF THE RECTANGLE\n--------------------------");
		System.out.print("\nEnter Length  : ");
		l=ip.nextDouble();
		System.out.print("\nEnter Width   : ");
		w=ip.nextDouble();
		System.out.println("\n--------------------------\nENTER DETAILS OF THE SQUARE\n--------------------------");
		System.out.print("\nEnter Side    : ");
		s=ip.nextDouble();
		System.out.println("\n--------------------------\nENTER DETAILS OF THE CIRCLE\n--------------------------");
		System.out.print("\nEnter Radius  : ");
		r=ip.nextDouble();
		System.out.println("\n--------------------------\nENTER DETAILS OF THE TRIANGLE\n--------------------------");
		System.out.print("\nEnter Breadth : ");
		b=ip.nextDouble();
		System.out.print("\nEnter Height  : ");
		h=ip.nextDouble();
		
		Graphics package_object=new Graphics();
		
		System.out.println("\n----------------------\nRECTANGLE\n----------------------");
		System.out.println("\nLength  : "+l+"\nWidth   : "+w+"\nArea    : "+package_object.recArea(l,w));
		System.out.println("\n----------------------\nSQUARE\n----------------------");
		System.out.println("\nSide    : "+s+"\nArea    : "+package_object.sqrArea(s));
		System.out.println("\n----------------------\nTRIANGLE\n----------------------");
		System.out.println("\nBreadth  : "+b+"\nHeight   : "+h+"\nArea     : "+package_object.triArea(b,h));
		System.out.println("\n----------------------\nCIRCLE\n----------------------");
		System.out.println("\nRadius   : "+r+"\nArea     : "+package_object.cirArea(r));
		
	}
}
