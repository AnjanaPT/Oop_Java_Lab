import java.util.Scanner;
class Q11_Employee{
	float eSalary;
	int eNo;
	String eName;
	Scanner ip=new Scanner(System.in);
	void Read_Employee(){
		System.out.print("\nEnter Employee Id : ");
		eNo=ip.nextInt();
		ip.nextLine();//to avoid taking \n as eName(nextLine)
		System.out.print("\nEnter Employee Name : ");
		eName=ip.nextLine();
		System.out.print("\nEnter Employee's Salary : ");
		eSalary=ip.nextFloat();
		ip.nextLine();//to avoid taking \n as eNo(nextLine)
	}	
	void Search_Employee(){
		System.out.println("\n---------------------------\nNumber : "+eNo+"\nName   : "+eName+"\nSalary : "+eSalary+"\n---------------------------");
	}
	public static void main(String args[]){
		Scanner ip=new Scanner(System.in);
		System.out.print("\n---------------------------\nEnter Number Of Employees : ");
		int n=ip.nextInt();
		Q11_Employee e[]=new Q11_Employee[n];
		System.out.println("\n---------------------------\nENTER DETAILS OF "+n+" EMPLOYEES");
		for(int i=0;i<n;i++)
		{
			System.out.println("\n---------------------------\nEMPLOYEE "+(i+1)+"\n---------------------------");
			e[i]=new Q11_Employee();
			e[i].Read_Employee();
		}
		System.out.print("\n---------------------------\nEnter Number/Id Of The Employee To Be Searched : ");
		int eno=ip.nextInt();
		int f=0;
		for(Q11_Employee i : e)
		{
			if( i.eNo == eno ){
				f=1;
				System.out.println("\n---------------------------\nVIEW DETAILS EMPLOYEE "+eno);
				i.Search_Employee();
				break;
			}
		}	
		if(f==0)System.out.println("\n---------------------------\nEMPLOYEE NOT FOUND\n---------------------------");
	}
}	