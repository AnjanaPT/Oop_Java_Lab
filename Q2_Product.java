import java.util.Scanner;
class Product{
	float price;
	String pcode,pname;
	Product(String c,String n,float p){
		price=p;
		pcode=c;
		pname=n;
	}
	void View_Product(){
		System.out.println("\n-------------------\nCode : "+pcode+"\nName : "+pname+"\nPrice : "+price);
	}
	public static void main(String args[]){
		Scanner ip=new Scanner(System.in);
		Product p[]=new Product[3];
		String pc,pn;float pr;
		System.out.println("\n-------------------\nENTER PRODUCT DETAILS");
		for(int i=0;i<3;i++){
			int c=i+1;
			System.out.println("\n-------------------\nPRODUCT "+c+" \n-------------------");
			System.out.println("\nEnter Product Code : ");
			pc=ip.nextLine();
			System.out.println("\nEnter Product Name : ");
			pn=ip.nextLine();
			System.out.println("\nEnter Product Price : ");
			pr=ip.nextFloat();
			ip.nextLine();//to avoid taking \n as product_code(nextLine)
			p[i]=new Product(pc,pn,pr);
		}
		System.out.println("\n-------------------\nVIEW PRODUCT DETAILS");
		for(int i=0;i<3;i++){
			int c=i+1;
			System.out.println("\n-------------------\nPRODUCT "+c);
			p[i].View_Product();
		}
		String l;float prc;
		if(p[0].price < p[1].price && p[0].price < p[2].price)
			{l=p[0].pcode;prc=p[0].price;}
		else if(p[1].price < p[2].price)
			{l=p[1].pcode;prc=p[1].price;}
		else
			{l=p[2].pcode;prc=p[2].price;}
		System.out.println("\n-------------------\nCode Of Product With Lowest Price("+prc+") Is : "+l);
	}
}	