import java.util.Scanner;
class Cal_Area
{
	double Area(double length,double width){
		return(length*width);
	}	
	double Area(double radius){
		return(3.14*radius*radius);
	}	
	float Area(float side){
		return(side*side);
	}	
}
class Q9_Function_Overloading
{
	public static void main(String args[])
	{
		Scanner ip=new Scanner(System.in);
		double l,w,r;
		float s;
		int op;
		Cal_Area a=new Cal_Area();
		do{
			System.out.print("\n----------------------------\n1 : RECTANGLE\n2 : SQUARE\n3 : CIRCLE\n4 : EXIT\n----------------------------\nEnter Your Option : ");
			op=ip.nextInt();
			switch(op)
			{
				case 1 :System.out.println("\n---------------------------\nENTER DETAILS OF THE RECTANGLE\n---------------------------");
				System.out.print("\nEnter Length  : ");
				l=ip.nextDouble();
				System.out.print("\nEnter Width   : ");
				w=ip.nextDouble();
				System.out.println("\n----------------------\nRECTANGLE\n----------------------");
				System.out.println("\nLength  : "+l+"\nWidth   : "+w+"\nArea    : "+a.Area(l,w));			
				break;
				
				case 2 :System.out.println("\n---------------------------\nENTER DETAILS OF THE SQUARE\n---------------------------");
				System.out.print("\nEnter Side    : ");
				s=ip.nextFloat();
				System.out.println("\n----------------------\nSQUARE\n----------------------");
				System.out.println("\nSide    : "+s+"\nArea    : "+a.Area(s));
				break;
				
				case 3:System.out.println("\n---------------------------\nENTER DETAILS OF THE CIRCLE\n---------------------------");
				System.out.print("\nEnter Radius  : ");
				r=ip.nextDouble();
				System.out.println("\n----------------------\nCIRCLE\n----------------------");
				System.out.println("\nRadius   : "+r+"\nArea     : "+a.Area(r));
				break;
				
				case 4:System.out.println("\n---------------------------\nE X I T\n---------------------------");
				break;
				
				default:System.out.println("\n---------------------------\nInvalid Option !! \n---------------------------");
				break;
			}
		}while(op!=4);	
	}
}
