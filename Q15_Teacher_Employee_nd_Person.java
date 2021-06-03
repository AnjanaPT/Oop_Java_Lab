import java.util.*;
class Person
{
	protected
		int Age;
		String Name,Gender,Address;
	Person(String n,int a,String g,String ad){
		Age=a;
		Gender=g;
		Name=n;
		Address=ad;
	}
	/*void display(){
		System.out.println("\n---------------------------\nName          : "+Name+"\nGender        : "+Gender+"\nAge           : "+Age+"\nAddress       : "+Address);
	}*/
}
class Employee extends Person
{
	protected
		int Empid;
		float Salary;
		String Company_name,Qualification;
	Employee(String n,int a,String g,String ad,int i,float s,String cn,String q){
		super(n,a,g,ad);
		Empid=i;
		Salary=s;
		Company_name=cn;
		Qualification=q;
	}
	/*void display(){
		System.out.println("\nEmployee ID   : "+Empid+"\nSalary        : "+Salary+"\nCompany Name  : "+Company_name+"\nQualification : "+Qualification);
	}*/
}
class Teacher extends Employee
{
	protected
		String Tdepartment, Tsubject; 
		int Tid;
	Teacher(String n,int a,String g,String ad,int i,float s,String cn,String q,int tid,String d,String sb){
		super(n,a,g,ad,i,s,cn,q);
		Tdepartment=d;
		Tsubject=sb;
		Tid=tid;
	}
	void display(){
		/*super.display();
		System.out.println("\n---------------------------\nTeacher ID    : "+Tid+"\nDepartment    : "+Tdepartment+"\nSubject       : "+Tsubject);
		*/
		System.out.println("\n---------------------------\nName          : "+Name+"\nGender        : "+Gender+"\nAge           : "+Age+"\nAddress       : "+Address+"\nEmployee ID   : "+Empid+"\nSalary        : "+Salary+"\nCompany Name  : "+Company_name+"\nQualification : "+Qualification+"\nTeacher ID    : "+Tid+"\nDepartment    : "+Tdepartment+"\nSubject       : "+Tsubject+"\n---------------------------");
	}
}
class Q15_Teacher_Employee_nd_Person
{
	public static void main(String args[]){
		Scanner ip=new Scanner(System.in);
		int eid,tid,age;
		float salary;
		String name,gen,adrs,dept,sub,qlfctn,cname; 
		System.out.print("\n---------------------------\nEnter The Number Of Teachers : ");
		int n=ip.nextInt();
		ip.nextLine();//to avoid taking \n as Name(nextLine)
		Teacher t[]=new Teacher[n];
		System.out.print("\n---------------------------\nENTER DETAILS OF "+n+" TEACHERS");
		for(int i=0;i<n;i++){
			System.out.print("\n---------------------------\nTEACHER "+(i+1)+"\n---------------------------");
			System.out.print("\nEnter The Name : ");
			name=ip.nextLine();
			System.out.print("\nEnter The Age : ");
			age=ip.nextInt();
			ip.nextLine();//to avoid taking \n as Gender(nextLine)
			System.out.print("\nEnter The Gender : ");
			gen=ip.nextLine();
			System.out.print("\nEnter The Address : ");
			adrs=ip.nextLine();
			
			System.out.print("\nEnter Employee Id : ");
			eid=ip.nextInt();
			System.out.print("\nEnter The Salary : ");
			salary=ip.nextFloat();
			ip.nextLine();//to avoid taking \n as Cname(nextLine)
			System.out.print("\nEnter Company Name : ");
			cname=ip.nextLine();
			System.out.print("\nEnter The Qualification : ");
			qlfctn=ip.nextLine();
			
			System.out.print("\nEnter Teacher Id : ");
			tid=ip.nextInt();
			ip.nextLine();//to avoid taking \n as Dept(nextLine)
			System.out.print("\nEnter The Department : ");
			dept=ip.nextLine();
			System.out.print("\nEnter The Subject : ");
			sub=ip.nextLine();
			t[i]=new Teacher(name,age,gen,adrs,eid,salary,cname,qlfctn,tid,dept,sub);
		}
		System.out.print("\n---------------------------\nVIEW DETAILS OF "+n+" TEACHERS\n---------------------------\n");
		for(int i=0;i<n;i++){
			System.out.print("\nTEACHER "+(i+1));
			t[i].display();
		}
	}
}