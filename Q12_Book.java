import java.util.Scanner;
class Q12_Book
{
	float bPrice;
	String ISBN, bTitle, bAuthor, bPublisher;
	Scanner ip=new Scanner(System.in);
	void Read_Book(){
		System.out.print("\nEnter Book Id : ");
		ISBN=ip.nextLine();
		System.out.print("\nEnter Book Title : ");
		bTitle=ip.nextLine();
		System.out.print("\nEnter Author's Name : ");
		bAuthor=ip.nextLine();
		System.out.print("\nEnter Book Publisher : ");
		bPublisher=ip.nextLine();
		System.out.print("\nEnter Price Of The Book : ");
		bPrice=ip.nextFloat();
		ip.nextLine();//to avoid taking \n as ISBN(nextLine)
	}	
	void View_Book(){
		System.out.println("\n---------------------------\nISBN : "+ISBN+"\nTitle   : "+bTitle+"\nAuthor : "+bAuthor+"\nPublisher : "+bPublisher+"\nPricer : "+bPrice+"\n---------------------------");
	}
	public static void main(String args[]){
		Scanner ip=new Scanner(System.in);
		Q12_Book b[]=new Q12_Book[5];
		System.out.println("\n---------------------------\nENTER DETAILS OF 5 BOOKS");
		for(int i=0;i<5;i++)
		{
			System.out.println("\n---------------------------\nBOOK "+(i+1)+"\n---------------------------");
			b[i]=new Q12_Book();
			b[i].Read_Book();
		}
		Q12_Book temp=new Q12_Book();
		for(int i=0;i<5;i++)
		{
			for(int j=i+1;j<5;j++)
			{
					if( (b[j].bTitle).compareTo(b[i].bTitle)<0 ){
						temp = b[i];
						b[i] = b[j];
						b[j] = temp;
					}
			}
		}
		System.out.println("\n---------------------------\nVIEW BOOK DETAILS");
		for(Q12_Book i : b)
		{
			i.View_Book();
		}		
	}
}	