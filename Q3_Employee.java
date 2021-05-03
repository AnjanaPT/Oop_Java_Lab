import java.util.Scanner;
class Employee{
	float M_Salary,Y_Salary;
	String Eid,Ename;
	Scanner ip=new Scanner(System.in);
	void Read_Employee(){
		System.out.println("\n-------------------\nEnter Employee Id : ");
		Eid=ip.nextLine();
		System.out.println("\nEnter Employee Name : ");
		Ename=ip.nextLine();
		System.out.println("\nEnter Monthly Salary : ");
		M_Salary=ip.nextFloat();
		ip.nextLine();//to avoid taking \n as Eid(nextLine)
	}	
	void View_Employee(){
		Y_Salary=M_Salary*12;
		System.out.println("\n-------------------\nId : "+Eid+"\nName : "+Ename+"\nMonthly Salary : "+M_Salary);
		System.out.println("\nYEARLY SALARY : "+Y_Salary+"\n-------------------");
	}
	public static void main(String args[]){
		Scanner ip=new Scanner(System.in);
		System.out.println("\n-------------------\nENTER EMPLOYEE DETAILS\n-------------------");
		System.out.println("\nEMPLOYEE 1");
		Employee e1=new Employee();
		e1.Read_Employee();
		System.out.println("\n-------------------\nEMPLOYEE 2");
		Employee e2=new Employee();
		e2.Read_Employee();
		System.out.println("\n-------------------\nVIEW EMPLOYEE DETAILS\n-------------------");
		System.out.println("\nEMPLOYEE 1");
		e1.View_Employee();
		System.out.println("\nEMPLOYEE 2");
		e2.View_Employee();	
	}
}	