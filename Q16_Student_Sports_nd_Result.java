import java.util.*;
class Student
{
	String Name;
	float Marks;
	int Rollno;
	Scanner ip=new Scanner(System.in);
	void read_student()
	{
		System.out.print("\n-----------------------------------\n\nEnter Student Name       : ");
		Name=ip.nextLine();
		System.out.print("\nEnter Student RollNumber : ");
		Rollno=ip.nextInt();
		System.out.print("\nMarks Obtained From Exam : ");
		Marks=ip.nextFloat();
	}
	void display()
	{
		System.out.println("\nName           : "+Name+"\nRoll Number    : "+Rollno+"\nAcademic Score : "+Marks);
	}
}
interface Sports
{
	int Smarks=25;
}
class Result extends Student implements Sports
{
	void display(){
		read_student();
		System.out.println("\n-----------------------------------\nRESULT OF "+Name+"\n-----------------------------------");
		super.display();
		System.out.println("Sports Score   : "+Smarks+"\nTotal Score    : "+(Marks+Smarks)+"\n\n-----------------------------------");
	}
}
class Q16_Student_Sports_nd_Result
{
	public static void main(String args[])
	{
		Result r=new Result();
		r.display();
	}
}