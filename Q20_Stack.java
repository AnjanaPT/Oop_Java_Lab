import java.util.*;
class Q20_Stack
{
	public static void main(String args[])
	{
		Scanner ip=new Scanner(System.in);
		Stack<Integer> stck= new Stack<Integer>();
		Stack<Integer> stck2= new Stack<Integer>();
		int num,loc,op,ch;
		do{
			System.out.print("\n--------------------------------------------\n1 : Push\n2 : Update\n3 : Pop\n4 : Display\n5 : Clear\n6 : Copy\n7 : Search\n8 : EXIT\n--------------------------------------------\nEnter Your Option                 : ");
			op=ip.nextInt();ip.nextLine();
			switch(op)
			{
				case 1 :
				System.out.print("\nEnter The Integer                 : ");
				num=ip.nextInt();
				stck.push(num);
				System.out.println("\n----------------INTEGER ADDED----------------");
				break;
				
				
				case 2 :
				if(!stck.empty()){
					System.out.print("\nStack                             : "+stck);
					System.out.print("\nEnter The Position Of old Integer : ");
					do{
						loc=ip.nextInt();
						if(loc<=0 || loc >=stck.size()+1)
							System.out.println("\n-------------INVALID POSITION!!-------------");
					}while(loc<=0 || loc >=stck.size()+1);
					System.out.print("\nEnter The New Integer             : ");
					num=ip.nextInt();
					stck.set(loc-1,num);
					System.out.println("\n---------------STACK UPDATED----------------");
				}
				else{
					System.out.print("\nInsert Integer First !!!");
				}
				break;
				
				
				case 3 :
				if(stck.empty()){
					System.out.print("\nInsert Integer First !!!");
				}
				else{
					stck.pop();
					System.out.println("\n----------------INTEGER REMOVED----------------");
				}
				break;
	
					
				case 4:
				if(!stck.empty()){
					System.out.print("\nSize Of stack                     : "+stck.size());
					System.out.print("\nStack                             : "+stck);
					System.out.print("\nLast Item In The stack            : "+stck.peek());
					System.out.println("\nStack Elements One By One");
					for(int i : stck) {
						System.out.println(i);
					}
				}
				else{
					System.out.print("\nInsert Integer First !!!");
				}
				break;
				
				
				case 5:
				if(!stck.empty()){
					stck.clear();
					System.out.println("\n-------------------------------------------\nstck Is Cleared                  : "+stck+"\n-------------------------------------------");
				}
				else{
					System.out.print("\nInsert Integer First !!!");
				}
				break;
				
				
				case 6:
				if(!stck.empty()){
					System.out.print("\nStack 1                           : "+stck);
					System.out.print("\nStack 2                           : "+stck2);
					stck2.addAll(stck);
					System.out.println("\n-------------------------------------------\nStack 1 Is Copied To Stack 2      : "+stck2+"\n-------------------------------------------");
				}
				else{
					System.out.print("\nInsert Integer First !!!");
				}
				break;
				
				
				case 7:
				if(stck.empty()){
					System.out.print("\nInsert Integer First !!!");
				}
				else{
					System.out.print("\nEnter The Integer                 : ");
					num=ip.nextInt();
					if(stck.search(num)==1){
						System.out.println("\n-------------------------------------------\n"+num+" Is Found \n-------------------------------------------");
					}
					else{
						System.out.println("\n-------------------------------------------\n"+num+" Is Not Found \n-------------------------------------------");					}
				}
				break;
				
				
				case 8:System.out.println("\n-------------------------------------------\nE X I T\n-------------------------------------------");
				break;
				
				default:System.out.println("\n-------------------------------------------\nInvalid Option !! \n-------------------------------------------");
				break;
			}
		}while(op!=8);	
	}
}
