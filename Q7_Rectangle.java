import java.util.Scanner;
class Rectangle{
	double length,width,area;
	String color;
	Rectangle(double l,double w,String c){
		length=l;
		width=w;
		color=c;
	}
	void Find_Area(){
		area=2*(length+width);
		System.out.println("\nlength : "+length+"\nWidth  : "+width+"\nColor  : "+color+"\nArea   : "+area);
	}
}
class Q7_Rectangle{
	public static void main(String args[]){
		Scanner ip=new Scanner(System.in);
		double l1,l2,w1,w2;
		String c1,c2;
		System.out.println("\n----------------------\nENTER DETAILS OF RECTANGLE 1\n----------------------");
		System.out.println("\nEnter Length : ");
		l1=ip.nextDouble();
		System.out.println("\nEnter Width : ");
		w1=ip.nextDouble();ip.nextLine();
		System.out.println("\nEnter Color : ");
		c1=ip.nextLine();
		Rectangle r1=new Rectangle(l1,w1,c1);	
		System.out.println("\n----------------------\nENTER DETAILS OF RECTANGLE 2\n----------------------");
		System.out.println("\nEnter Length : ");
		l2=ip.nextDouble();
		System.out.println("\nEnter Width : ");
		w2=ip.nextDouble();ip.nextLine();
		System.out.println("\nEnter Color : ");
		c2=ip.nextLine();
		Rectangle r2=new Rectangle(l2,w2,c2);
		System.out.println("\n------------------\nRECTANGLE 1\n------------------");
		r1.Find_Area();
		System.out.println("\n------------------\nRECTANGLE 2\n------------------");
		r2.Find_Area();
		if( r1.area == r2.area && (r1.color).equals(r2.color)){
			System.out.println("\n---------------------\nMATCHING RECTANGLES\n---------------------");
		}
		else{
			System.out.println("\n---------------------\nNON MATCHING RECTANGLES\n---------------------");
		}
	}
}
