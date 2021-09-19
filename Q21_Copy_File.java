import java.util.*;
import java.io.*;
class Q21_Copy_File
{
	public static void main(String args[])
	{
		String s;
		Scanner ip = new Scanner(System.in);
		try{
			//File f1 = new File("Q21_Original.txt");
			
			//Write to original
			FileWriter fwo = new FileWriter("Q21_Original.txt");
			System.out.println("Enter The Names(Fname+Lname.Enter q to Quit)");
			while(true)
			{
				s = ip.nextLine();
				if(s.equals("q")) break;
				fwo.write(s+"\n");
			}
			fwo.close();
			
			//Read from original and Write to copy
			FileWriter fwc=new FileWriter("Q21_Copy.txt");
			BufferedWriter bwc=new BufferedWriter(fwc);
			FileReader fro=new FileReader("Q21_Original.txt");
			BufferedReader bro=new BufferedReader(fro);
			System.out.println("---------------------------------\nNames In The File Original.txt\n---------------------------------");
			while((s=bro.readLine())!=null)
			{
				bwc.write(s);
				bwc.newLine();
				System.out.println(s);
			}
			bwc.flush();
			bwc.close();
			
			//Read From Copy
			System.out.println("---------------------------------\nNames In The File Copy.txt\n---------------------------------");
			FileReader frc=new FileReader("Q21_Copy.txt");
			BufferedReader brc=new BufferedReader(frc);
			while((s=brc.readLine())!=null)
			{
				System.out.println(s);
			}
			System.out.println("---------------------------------\n");
			frc.close();
			fwc.close();
			fro.close();
		}
		catch(Exception e)
		{
			System.out.println(e);			
		}
	}
}
