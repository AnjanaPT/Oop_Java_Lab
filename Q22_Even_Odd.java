import java.util.*;
import java.io.*;
class Q22_Even_Odd
{
	public static void main(String args[])
	{
		Scanner ip=new Scanner(System.in);
		int a;String s;
		try
		{
			FileWriter fwn=new FileWriter("Q22_Number.txt");
			FileWriter fwe=new FileWriter("Q22_Even.txt");
			FileWriter fwo=new FileWriter("Q22_Odd.txt");
			System.out.println("Enter The Numbers( -1 to quit)");
			while(true)
			{
				a=ip.nextInt();
				if(a==-1)break;
				s=Integer.toString(a);
				fwn.write(s+"\n");
			}
			fwn.close();
			FileReader frn=new FileReader("Q22_Number.txt");
			BufferedReader brn=new BufferedReader(frn);
			while((s=brn.readLine())!=null)
			{
				a=Integer.parseInt(s);
				if(a%2==0) fwe.write(s+"\n");
				else fwo.write(s+"\n");
			}
			frn.close();
			fwe.close();
			fwo.close();
			FileReader fre=new FileReader("Q22_Even.txt");
			BufferedReader bre=new BufferedReader(fre);
			System.out.println("---------------------------------\nNumbers In The File Even.txt\n---------------------------------");
			while((s=bre.readLine())!=null)
			{
				System.out.print(s+" ");
			}
			FileReader fro=new FileReader("Q22_Odd.txt");
			BufferedReader bro=new BufferedReader(fro);
			System.out.println("\n---------------------------------\nNumbers In The File Odd.txt\n---------------------------------");
			while((s=bro.readLine())!=null)
			{
				System.out.print(s+" ");
			}
			fro.close();
			fre.close();
			System.out.println("\n---------------------------------");

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
