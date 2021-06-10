import java.util.*;
interface Compute_Area_Perimter
{
	double pi=3.147;
	void area();
	void perimeter();
}
class Rectangle implements Compute_Area_Perimter
{
	double length,width;
	Rectangle(double l,double w){
		length=l;
		width=w;
	}
	void display(){
		System.out.println("\n-----------------------------------\nR E C T A N G L E\nLength    : "+length+"\nWidth     : "+width);
	}
	public void area(){
		display();
		System.out.print("Area      : "+length*width);
	}
	public void perimeter(){
		display();
		System.out.print("Perimeter : "+2*(length+width));
	}
}
class Circle implements Compute_Area_Perimter
{
	double radius;
	Circle(double r){
		radius=r;
	}
	void display(){
		System.out.println("\n-----------------------------------\nC I R C L E\nRadius    : "+radius);
	}
	public void area(){
		display();
		System.out.print("Area      : "+pi*radius*radius);
	}
	public void perimeter(){
		display();
		System.out.print("Perimeter : "+2*pi*radius);
	}
}
class Q17_Rectangle_Circle_nd_Interface
{
	public static void main(String args[]){
		Scanner ip=new Scanner(System.in);
		double length=0.0,width=0.0,radius=0.0;
		Rectangle r=new Rectangle(length,width);
		Circle c=new Circle(radius);
		int op,ch;
		do{
			System.out.print("\n-----------------------------------\n-----------------------------------\n\n1 : RECTANGLE\n2 : CIRCLE \n3 : EXIT\n\nEnter Your Choice : ");
			ch=ip.nextInt();
			switch(ch){
				case 1 :System.out.print("\n-----------------------------------\n");
						System.out.print("ENTER DETAILS OF THE RECTANGLE\n-----------------------------------");
						System.out.print("\n\nEnter The Length : ");
						length=ip.nextFloat();
						System.out.print("\nEnter The Width  : ");
						width=ip.nextFloat();
						r=new Rectangle(length,width);
						break;
				case 2 :System.out.print("\n-----------------------------------\n");
						System.out.print("ENTER DETAILS OF THE CIRCLE\n-----------------------------------");
						System.out.print("\n\nEnter The Radius : ");
						radius=ip.nextFloat();
						c=new Circle(radius);
						break;
				case 3 :System.out.println("\n-----------------------------------");
						System.out.println("\t\tEXIT\n-----------------------------------");
						break;
				default:System.out.println("\n-----------------------------------\n\nWrong Choice !!");				
				
			}
			if(ch==1 || ch==2)
			{
				do
				{
					System.out.print("\n-----------------------------------\n-----------------------------------\n\n1 : Area \n2 : Perimeter\n3 : EXIT\n\nChoose Your Option : ");
					op=ip.nextInt();
					System.out.print("\n-----------------------------------");
					switch(op){
						case 1 :if(ch==1)
									r.area();
								else
									c.area();
								break;
						case 2 :if(ch==1)
									r.perimeter();
								else
									c.perimeter();
								break;
						case 3 :break;
						default:System.out.println("\n-----------------------------------\n\nInvalid Option !!");				
					}
				}while(op!=3);
			}
		}while(ch!=3);
	}
}