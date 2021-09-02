import java.util.*;
class Q18_ArrayList
{
	public static void main(String args[])
	{
		Scanner ip=new Scanner(System.in);
		ArrayList<String> str= new ArrayList<String>();
		String s;
		int loc;
		int op;
		do{
			System.out.print("\n--------------------------------------------\n1 : Add\n2 : Update\n3 : Remove\n4 : Display\n5 : EXIT\n--------------------------------------------\nEnter Your Option                : ");
			op=ip.nextInt();ip.nextLine();
			switch(op)
			{
				case 1 :
				System.out.print("\nEnter The String                 : ");
				s=ip.nextLine();
				str.add(s);
				System.out.println("\n----------------STRING ADDED----------------");
				break;
				
				
				case 2 :
				if(str.size()>0){
					System.out.print("\nEnter The Position Of old String : ");
					loc=ip.nextInt();ip.nextLine();
					System.out.print("\nEnter The New String             : ");
					s=ip.nextLine();
					str.set(loc-1,s);
					System.out.println("\n----------------STRING UPDATED----------------");
				}
				else{
					System.out.print("\nInsert String First !!!");
				}
				break;
				
				
				case 3 :
				if(str.size()>0){
					System.out.print("\nEnter The String To Be Removed   : ");
					s=ip.nextLine();
					str.remove(s);
					System.out.println("\n----------------STRING REMOVED----------------");
				}
				else{
					System.out.print("\nInsert String First !!!");
				}
				break;
					
					
				case 4:
				if(str.size()>0){
					System.out.print("\nSize Of Array                    : "+str.size());
					System.out.print("\nArray                            : "+str);
					System.out.println("\nArray Elements One By One");
					for(String i : str) {
						System.out.println(i);
					}
				}
				else{
					System.out.print("\nInsert String First !!!");
				}
				break;
				
				
				case 5:System.out.println("\n-------------------------------------------\nE X I T\n-------------------------------------------");
				break;
				
				default:System.out.println("\n-------------------------------------------\nInvalid Option !! \n-------------------------------------------");
				break;
			}
		}while(op!=5);	
	}
}
