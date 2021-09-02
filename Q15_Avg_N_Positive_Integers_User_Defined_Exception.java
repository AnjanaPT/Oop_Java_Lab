import java.util.Scanner;
class MyException extends Exception
{
	MyException(String s){
		super(s);
	}
}

class Q15_Avg_N_Positive_Integers_User_Defined_Exception
{
	public static void main(String args[])
	{
		Scanner ip=new Scanner(System.in);
		int n,c,a;
		float sum=0;
		System.out.print("\n----------------------------------------\nEnter Number Of Integers     : ");
		c=n=ip.nextInt();
		System.out.println("\nEnter "+n+" Integers One By One\n----------------------------------------");
		for(int i=0;i<n;i++){
			a=ip.nextInt();
			try{
				if(a<0){
					n++;
					throw new MyException("-ve Numbers Aren't Allowed !!\nContinue Entering Numbers");
				}
				else{
					sum+=a;
				}
			}
			catch(MyException e){
				System.out.println(e.getMessage());
			}
		}		
		System.out.print("\n----------------------------------------\nAverage Of Given Numbers Is  : "+(sum/c)+"\n----------------------------------------");
	}
}

