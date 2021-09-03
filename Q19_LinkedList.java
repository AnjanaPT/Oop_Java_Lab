import java.util.*;
class Q19_LinkedList
{
	public static void main(String args[])
	{
		Scanner ip=new Scanner(System.in);
		LinkedList<Integer> lst= new LinkedList<Integer>();
		LinkedList<Integer> lst2= new LinkedList<Integer>();
		int num,loc,op,ch;
		do{
			System.out.print("\n--------------------------------------------\n1 : Add\n2 : Update\n3 : Remove\n4 : Display\n5 : Clear\n6 : Copy\n7 : EXIT\n--------------------------------------------\nEnter Your Option                 : ");
			op=ip.nextInt();ip.nextLine();
			switch(op)
			{
				case 1 :
				System.out.print("\nEnter The Integer                 : ");
				num=ip.nextInt();
				System.out.print("\n\n1 : Add\n2 : AddFirst\n3 : AddLast\n\nEnter Your Choice                 : ");
				ch=ip.nextInt();
				switch(ch){
					case 1:lst.add(num);
					break;
					case 2:lst.addFirst(num);
					break;
					case 3:lst.addLast(num);
					break;
					default:System.out.println("\n\nInvalid Option !! \n");
					break;
				}
				if(ch==1||ch==2||ch==3)
					System.out.println("\n----------------INTEGER ADDED----------------");
				else 
					System.out.println("\n-------------INSERTION FAILED!!!-------------");
				break;
				
				
				case 2 :
				if(lst.size()>0){
					System.out.print("\nList                              : "+lst);
					System.out.print("\nEnter The Position Of old Integer : ");
					do{
						loc=ip.nextInt();
						if(loc<=0 || loc >=lst.size()+1)
							System.out.println("\n-------------INVALID POSITION!!-------------");
					}while(loc<=0 || loc >=lst.size()+1);
					System.out.print("\nEnter The New Integer             : ");
					num=ip.nextInt();
					lst.set(loc-1,num);
					System.out.println("\n----------------LIST UPDATED----------------");
				}
				else{
					System.out.print("\nInsert Integer First !!!");
				}
				break;
				
				
				case 3 :
				if(lst.size()>0){
				System.out.print("\n\n1 : Remove\n2 : RemoveFirst\n3 : RemoveLast\n\nEnter Your Choice                 : ");
				ch=ip.nextInt();
					switch(ch){
						case 1:
						System.out.print("\nList                              : "+lst);
						System.out.print("\nEnter The Position Of The Integer : ");
						do{
							loc=ip.nextInt();
							if(loc<=0 || loc >=lst.size()+1)
								System.out.println("\n-------------INVALID POSITION!!-------------");
						}while(loc<=0 || loc >=lst.size()+1);
						lst.remove(loc-1);
						break;
						case 2:lst.removeFirst();
						break;
						case 3:lst.removeLast();
						break;
						default:System.out.println("\n\nInvalid Option !! \n");
						break;
					}
					if(ch==1||ch==2||ch==3)
						System.out.println("\n----------------INTEGER REMOVED----------------");
					else 
						System.out.println("\n-------------DELETION FAILED!!!-------------");
				}
				else{
					System.out.print("\nInsert Integer First !!!");
				}
				break;
	
					
				case 4:
				if(lst.size()>0){
					System.out.print("\nSize Of List                      : "+lst.size());
					System.out.print("\nList                              : "+lst);
					System.out.print("\nLast Item In The List             : "+lst.getLast());
					System.out.println("\nList Elements One By One");
					for(int i : lst) {
						System.out.println(i);
					}
				}
				else{
					System.out.print("\nInsert Integer First !!!");
				}
				break;
				
				
				case 5:
				if(lst.size()>0){
					lst.clear();
					System.out.println("\n-------------------------------------------\nList Is Cleared                   : "+lst+"\n-------------------------------------------");
				}
				else{
					System.out.print("\nInsert Integer First !!!");
				}
				break;
				
				
				case 6:
				if(lst.size()>0){
					System.out.print("\nList 1                            : "+lst);
					System.out.print("\nList 2                            : "+lst2);
					lst2.addAll(lst);
					System.out.println("\n-------------------------------------------\nList 1 Is Copied To List 2        : "+lst2+"\n-------------------------------------------");
				}
				else{
					System.out.print("\nInsert Integer First !!!");
				}
				break;
				
				
				case 7:System.out.println("\n-------------------------------------------\nE X I T\n-------------------------------------------");
				break;
				
				default:System.out.println("\n-------------------------------------------\nInvalid Option !! \n-------------------------------------------");
				break;
			}
		}while(op!=7);	
	}
}
