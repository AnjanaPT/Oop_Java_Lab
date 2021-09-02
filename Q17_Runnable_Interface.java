import java.util.*;
class fib implements Runnable
{
	int nf;
	Scanner ip=new Scanner(System.in);
	public void run()
	{
		System.out.println("Enter The Number Of Terms Of Fibonacci Series : ");
		nf=ip.nextInt();
		//int cf=1;
		System.out.println("\n---------------------------------------------------\nFirst "+nf+" Terms Of Fibonacci Series  Are\n---------------------------------------------------\n");
		for(int i=0;i<nf;i++)
		{
			//System.out.println("Fib "+(cf++)+" : "+rcrsv_fib(i));
			System.out.print(rcrsv_fib(i)+"\t");
		}
	}
	int rcrsv_fib(int a){
		if(a<=1)
			return(a);
		else
			return(rcrsv_fib(a-1)+rcrsv_fib(a-2));
	}
}
class even implements Runnable
{
	int ne;
	Scanner ip=new Scanner(System.in);
	public void run()
	{
		System.out.println("Enter The Limit                               : ");
		ne=ip.nextInt();
		//int ce=1;
		try{Thread.sleep(100);}
		catch(Exception e){}
		System.out.println("\n---------------------------------------------------\nEven Numbers From Zero To "+ne+" Are\n---------------------------------------------------\n");
		for(int i=1;i<=ne;i++){
			if(i%2==0)
				//System.out.println("Even "+(ce++)+" : "+i);
				System.out.print(i+"\t");
		}
		System.out.println("\n---------------------------------------------------");
	}
}
class Q17_Runnable_Interface
{
	public static void main(String args[])
	{
		fib f=new fib();
		even e=new even();
		Thread threadF=new Thread(f);
		Thread threadE=new Thread(e);
		threadF.start();
		threadE.start();
	}
}