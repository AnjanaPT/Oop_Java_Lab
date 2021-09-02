import java.util.*;
import java.lang.*;
class multiplication_table extends Thread
{
	int n;
	Scanner ip=new Scanner(System.in);
	public void run()
	{
		System.out.println("Enter The Number Of Terms Of Multiplication Table : ");
		n=ip.nextInt();
		System.out.println("\n---------------------------------------------------\nFirst "+n+" Terms Of Multiplication Table of 5 Are\n---------------------------------------------------\n");
		for(int i=1;i<=n;i++){
			System.out.println("5 * "+i+" = "+(5*i));
		}
	}
}
class prime extends Thread{
	int n,s,f,j;
	Scanner ip=new Scanner(System.in);
	public void run()
	{
		System.out.println("Enter The Number Of Prime Numbers To Print        : ");
		n=ip.nextInt();
		try{Thread.sleep(100);}
		catch(Exception e){}
		int i=2;
		//pn=1;
		System.out.println("\n---------------------------------------------------\nFirst "+n+" Prime Numbers Are\n---------------------------------------------------\n");
		while(n>0){
			s=(int)Math.sqrt(i);
			j=2;
			f=0;
			while(j<=s){
				if(i%j==0){
					f=1;break;
				}
				j++;
			}
			if(f==0)
			{
				n--;
				//System.out.println("Prime "+(pn++)+" : "+i);
				System.out.print(i+"\t");
			}
			i++;
		}
		System.out.println("\n---------------------------------------------------");
	}
}
class Q16_Extending_Thread
{
	public static void main(String args[])
	{
		prime p=new prime();
		multiplication_table m=new multiplication_table();
		m.start();
		p.start();
	}
}