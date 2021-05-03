import java.util.Scanner;
class Student{
	String S_name;
	int S_rollno;
	float m1,m2,m3,tot;
	Scanner ip=new Scanner(System.in);
	void Read_Student(){
		System.out.println("\n-------------------\nEnter Student Name : ");
		S_name=ip.nextLine();
		System.out.println("\nEnter Student RollNumber : ");
		S_rollno=ip.nextInt();
		System.out.println("\nEnter Marks Of Subject 1 : ");
		m1=ip.nextFloat();
		System.out.println("\nEnter Marks Of Subject 2 : ");
		m2=ip.nextFloat();
		System.out.println("\nEnter Marks Of Subject 3 : ");
		m3=ip.nextFloat();
		ip.nextLine();//to avoid taking \n as S_name(nextLine)
		tot=m1+m2+m3;
		System.out.println("\n-------------------");
	}
	void View_Student(){
		System.out.println("\n-------------------\nName : "+S_name+"\nRoll Number : "+S_rollno+"\nMark 1 : "+m1+"\nMark 2 : "+m2+"\nMark 3 : "+m3+"\nTotal Marks : "+tot+"\n-------------------");
	}
	public static void main(String args[]){
		System.out.println("\n-------------------\nENTER STUDENT DETAILS\n-------------------");
		System.out.println("\nSTUDENT 1");
		Student st1=new Student();
		st1.Read_Student();
		System.out.println("\nSTUDENT 2");
		Student st2=new Student();
		st2.Read_Student();
		System.out.println("\nSTUDENT 3");
		Student st3=new Student();
		st3.Read_Student();
		System.out.println("\nVIEW STUDENT DETAILS\n-------------------");
		System.out.println("\nSTUDENT 1");
		st1.View_Student();
		System.out.println("\nSTUDENT 2");
		st2.View_Student();
		System.out.println("\nSTUDENT 3");
		st3.View_Student();	
		String h;float t;
		if(st1.tot > st2.tot && st1.tot > st3.tot)
			{h=st1.S_name;t=st1.tot;}
		else if(st2.tot > st3.tot)
			{h=st2.S_name;t=st2.tot;}
		else
			{h=st3.S_name;t=st3.tot;}
		System.out.println("\nName Of Student With Highest Marks("+t+") Is : "+h+"\n-------------------\n");
	
	}
}