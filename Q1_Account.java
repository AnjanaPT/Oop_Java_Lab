import java.util.Scanner;
class Account{
	int ac_no;
	float amnt,ac_bal=0;
	String ac_name,ac_type;
	Account(int no,float bal,String name,String type){
		ac_no=no;
		ac_bal=bal;
		ac_name=name;
		ac_type=type;
	}
	void View_Account(){
		System.out.println("\n-------------------\nAccount Number : "+ac_no+"\nAccount Name: "+ac_name+"\nAccount Type : "+ac_type);
	}
	void View_Balance(){
		System.out.println("\n-------------------\nAccount Balance: "+ac_bal);
	}
	void Credict(float amnt){
		ac_bal+=amnt;
	}
	void Debit(float amnt){
		ac_bal-=amnt;
	}
}
class Q1_Account{
	public static void main(String args[])
	{
		Scanner ip=new Scanner(System.in);
		Account a[]=new Account[3];
		int acn; float bl; String nm,ty;
		System.out.println("\n-------------------\nENTER ACCOUNT DETAILS\n-------------------");
		for(int i=0;i<2;i++)
		{	
			int c=i+1;
			System.out.println("\nCUSTOMER "+c+" \n-------------------");
			System.out.println("\nEnter Account_Number : ");
			acn=ip.nextInt();
			System.out.println("\nEnter Account_Name : ");
			ip.nextLine();//to avoid taking \n as account_type(nextLine)
			nm=ip.nextLine();
			System.out.println("\nEnter Account_Type : ");
			ty=ip.nextLine();
			System.out.println("\nEnter Account_Balance : ");
			bl=ip.nextFloat();
			while(bl<1000)
			{
				System.out.println("\nEnter Atleast 1000 !!!\nEnter Account_Balance Again : ");
				bl=ip.nextFloat();
			}
			a[i]=new Account(acn,bl,nm,ty);
		}
		int cust=0;
		while(cust!=3){
			System.out.println("\n-------------------\n1 : CUSTOMER 1\n2 : CUSTOMER 2\n3 : EXIT\n-------------------\nSelect A Customer : ");
			cust=ip.nextInt();
			int op=0;
			switch(cust){
			case 1:a[2]=a[0];
				   break;
			case 2:a[2]=a[1];
				   break;
			case 3:System.out.println("\n----------EXIT----------");op=6;
				   break;
			default:System.out.println("\nSelect A Valid Customer");op=6;
				   break;
			}
			while(op!=5 && op!=6){
				System.out.println("\n-------------------\n1 : View Account\n2 : View Balance\n3 : Debit\n4 : Credict\n5 : EXIT\n-------------------\nEnter Your Option : ");
				op=ip.nextInt();
				float m;
				switch(op){
				case 1:a[2].View_Account();
						break;
				case 2:a[2].View_Balance();
						break;
				case 3:if(a[2].ac_bal<=0){
							System.out.println("\nNothing To Withdraw : ");
						}
						else{
							System.out.println("\nEnter The Amount You Want To Withdraw : ");
							m=ip.nextFloat();
							float amnt=a[2].ac_bal-m;
							if(m>a[2].ac_bal){System.out.println("\nNo Sufficient Balance In Your Account ");}
							else if(amnt<1000){System.out.println("\nKeep A Balance Of Atleast 1000."+m+" Rs Cannot Be Withdrawn ");}
							else{
								a[2].Debit(m);a[2].View_Balance();
							}
						}
						break;
				case 4:System.out.println("\nEnter The Amount You Want To Deposit : ");
					    m=ip.nextFloat();
						a[2].Credict(m);a[2].View_Balance();
						break;
				case 5:break;
				default:System.out.println("\nSelect A Valid Option");
				        break;
				}
			}
		}
	}
}