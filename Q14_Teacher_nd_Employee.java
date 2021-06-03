import java.util.*;
class Employee
{
	protected
		int Empid;
		float Esalary;
		String Ename,Eaddress;
	Employee(int i,float s,String n,String a){
		Empid=i;
		Esalary=s;
		Ename=n;
		Eaddress=a;
	}
	/*void display(){
		System.out.println("\n---------------------------\nID         : "+Empid+"\nName       : "+Ename+"\nAddress    : "+Eaddress+"\nSalary     : "+Esalary);
	}*/
}
class Teacher extends Employee
{
	protected
		String Tdepartment, Tsubject; 
	Teacher(int i,float s,String n,String a,String d,String sb){
		super(i,s,n,a);
		Tdepartment=d;
		Tsubject=sb;
	}
	void display(){
		/*super.display();
		System.out.println("Department : "+Tdepartment+"\nSubject    : "+Tsubject+"\n---------------------------");
		*/
		System.out.println("\n---------------------------\nID         : "+Empid+"\nName       : "+Ename+"\nAddress    : "+Eaddress+"\nSalary     : "+Esalary+"\nDepartment : "+Tdepartment+"\nSubject    : "+Tsubject+"\n---------------------------");
	}
}
class Q14_Teacher_nd_Employee
{
	public static void main(String args[]){
		Scanner ip=new Scanner(System.in);
		int id;
		float salary;
		String name,address,department,subject; 
		System.out.print("\n---------------------------\nEnter The Number Of Teachers : ");
		int n=ip.nextInt();
		Teacher t[]=new Teacher[n];
		System.out.print("\n---------------------------\nENTER DETAILS OF "+n+" TEACHERS");
		for(int i=0;i<n;i++){
			System.out.print("\n---------------------------\nEMPLOYEE "+(i+1)+"\n---------------------------\n");
			System.out.print("\nEnter Employee Id : ");
			id=ip.nextInt();
			ip.nextLine();//to avoid taking \n as Ename(nextLine)
			System.out.print("\nEnter Employee Name : ");
			name=ip.nextLine();
			System.out.print("\nEnter Employee's Salary : ");
			salary=ip.nextFloat();
			ip.nextLine();//to avoid taking \n as Eaddress(nextLine)
			System.out.print("\nEnter Employee's Address : ");
			address=ip.nextLine();
			System.out.print("\nEnter Employee's Department : ");
			department=ip.nextLine();
			System.out.print("\nEnter Employee's Subject : ");
			subject=ip.nextLine();
			t[i]=new Teacher(id,salary,name,address,department,subject);
		}
		System.out.print("\n---------------------------\nVIEW DETAILS OF "+n+" TEACHERS\n---------------------------\n");
		for(int i=0;i<n;i++){
			System.out.print("\nTEACHER "+(i+1));
			t[i].display();
		}
	}
}