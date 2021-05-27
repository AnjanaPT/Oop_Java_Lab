import java.util.*;
class Strings
{
		String sr1,sr2,replace,reverse;
		int n;
		Scanner ip = new Scanner(System.in);
		void Word_Count(String s)
		{
			System.out.print("\n---------------------------\nWORD COUNT\n---------------------------");
			String wc1[]=s.split(" ",0);
			String wc2[]=new String[wc1.length];
			int c=-1,f;
			for(String k : wc1){
				f=0;
				for(int i=0;i<c;i++){
					if(k.equalsIgnoreCase(wc2[i]))f++;
				}
				if(f==0){wc2[++c]=k;}
			}
			for(int k=0;k<c;k++){
				int n=0;
				for(String i : wc1){
					if(wc2[k].equalsIgnoreCase(i))n++;
				}
				System.out.print("\n"+wc2[k]+" Is Found "+n+" Times");
			}
		}
		void Word_Replace(String s)
		{
			System.out.print("\n---------------------------\nWORD REPLACE\n---------------------------");
			System.out.print("\nEnter The Word To Be Replaced : ");
			sr1 = ip.nextLine();
			System.out.print("\nEnter The Word To Replace : ");
			sr2 = ip.nextLine();
			replace="";
			for(String k : (s.split(" ",0))){
				if(k.equalsIgnoreCase(sr1))
					replace+=sr2+" ";
				else
					replace+=k+" ";
			}
			System.out.print("\nOriginal  : "+s+"\nReplaced  : "+replace);
		}
		void Word_Reverse(String s)
		{
			reverse="";
			System.out.print("\n---------------------------\nWORD REVERSE\n---------------------------");
			for(int i=s.length();i>0;i--){
				reverse+= s.charAt(i-1);
			}
			System.out.print("\nOriginal : "+s+"\nReverse  : "+reverse);
		}
}
class Q13_String
{
	public static void main(String args[])
	{
		Scanner ip = new Scanner(System.in);
		Strings st =new Strings();
		int op;
		do
		{
			System.out.print("\n---------------------------\nEnter Your String/Sentence : ");
			String s = ip.nextLine();
			System.out.print("\n---------------------------\n1 : Word Count\n2 : Replace\n3 : Reverse\n4 : EXIT\n---------------------------\nEnter Your Option : ");
			op=ip.nextInt();ip.nextLine();
			switch(op)
			{
				case 1 : st.Word_Count(s);
						 break;
				case 2 : st.Word_Replace(s);
						 break;
				case 3 : st.Word_Reverse(s);
						 break;
				case 4 : System.out.println("\n---------------------------\nEXIT\n---------------------------");
						 break;
				default: System.out.println("\nInvalid Option !!");
						 break;
			}
		}while(op!=4);
	}
}
//array--> arrayname.length;
//string--> stringname.length();