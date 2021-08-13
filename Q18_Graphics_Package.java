import java.util.Scanner;
import Q18_Graphics.*;
class Q18_Graphics_Package
{
	public static void main(String args[])
	{
		Scanner ip=new Scanner(System.in);
		double l,w,b,h,s,r;
		int op;
		do{
			System.out.print("\n----------------------------\n1 : RECTANGLE\n2 : SQUARE\n3 : CIRCLE\n4 : TRIANGLE\n5 : EXIT\n----------------------------\nEnter Your Option : ");
			op=ip.nextInt();
			switch(op)
			{
				case 1 :System.out.println("\n---------------------------\nENTER DETAILS OF THE RECTANGLE\n---------------------------");
				System.out.print("\nEnter Length  : ");
				l=ip.nextDouble();
				System.out.print("\nEnter Width   : ");
				w=ip.nextDouble();
				Rectangle_ rect_package_object=new Rectangle_();
				System.out.println("\n----------------------\nRECTANGLE\n----------------------");
				System.out.println("\nLength  : "+l+"\nWidth   : "+w+"\nArea    : "+rect_package_object.recArea(l,w));			
				break;
				
				case 2 :System.out.println("\n---------------------------\nENTER DETAILS OF THE SQUARE\n---------------------------");
				System.out.print("\nEnter Side    : ");
				s=ip.nextDouble();
				Square sqr_package_object=new Square();
				System.out.println("\n----------------------\nSQUARE\n----------------------");
				System.out.println("\nSide    : "+s+"\nArea    : "+sqr_package_object.sqrArea(s));
				break;
				
				case 3:System.out.println("\n---------------------------\nENTER DETAILS OF THE CIRCLE\n---------------------------");
				System.out.print("\nEnter Radius  : ");
				r=ip.nextDouble();
				Circle_ cir_package_object = new Circle_();
				System.out.println("\n----------------------\nCIRCLE\n----------------------");
				System.out.println("\nRadius   : "+r+"\nArea     : "+cir_package_object.circArea(r));
				break;
				
				case 4:System.out.println("\n---------------------------\nENTER DETAILS OF THE TRIANGLE\n---------------------------");
				System.out.print("\nEnter Breadth : ");
				b=ip.nextDouble();
				System.out.print("\nEnter Height  : ");
				h=ip.nextDouble();
				Triangle tri_package_object=new Triangle();
				System.out.println("\n----------------------\nTRIANGLE\n----------------------");
				System.out.println("\nBreadth  : "+b+"\nHeight   : "+h+"\nArea     : "+tri_package_object.triArea(b,h));
				break;
				
				case 5:System.out.println("\n---------------------------\nE X I T\n---------------------------");
				break;
				
				default:System.out.println("\n---------------------------\nInvalid Option !! \n---------------------------");
				break;
			}
		}while(op!=5);	
	}
}
