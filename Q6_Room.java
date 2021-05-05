import java.util.Scanner;
class Room
{
	String roomno,roomtype,roomarea;
	Room(){
		roomno="";
		roomtype="";
		roomarea="";
	}
	Room(String n,String t,String a){
		roomno=n;
		roomtype=t;
		roomarea=a;
	}
	void View_Room(){
		System.out.println("\nRoom No	  : "+roomno+"\nRoom Type : "+roomtype+"\nRoom Area : "+roomarea);
	}
}
class Q6_Room
{
	public static void main(String args[]){
		Scanner ip=new Scanner(System.in);
		String rn1,rn2,rt1,rt2,ra1,ra2;
		System.out.println("\n------------------\nENTER DETAILS OF ROOM 1\n------------------");
		System.out.println("\nEnter Room No : ");
		rn1=ip.nextLine();
		System.out.println("\nEnter Room Type : ");
		rt1=ip.nextLine();
		System.out.println("\nEnter Room Area : ");
		ra1=ip.nextLine();
		Room r1=new Room(rn1,rt1,ra1);
		System.out.println("\n------------------\nENTER DETAILS OF ROOM 2\n------------------");
		System.out.println("\nEnter Room No : ");
		rn2=ip.nextLine();
		System.out.println("\nEnter Room Type : ");
		rt2=ip.nextLine();
		System.out.println("\nEnter Room Area : ");
		ra2=ip.nextLine();
		Room r2=new Room(rn2,rt2,ra2);
		System.out.println("\n------------------\nROOM 1\n------------------");
		r1.View_Room();
		System.out.println("\n------------------\nROOM 2\n------------------");
		r2.View_Room();
	}
}