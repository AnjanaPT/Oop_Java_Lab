class CPU
{
	double price;
	CPU(double p){
		price=p;
	}
	class PROCESSOR
	{
		int no_of_cores;
		String manufacturer;
		PROCESSOR(int n,String m){
			no_of_cores=n;
			manufacturer=m;
		}
		void display()
		{ 
			System.out.println("\nNumber Of Cores : "+no_of_cores+"\nManufacturer    : "+manufacturer);
		}
	}
	static class RAM
	{
		String memory,manufacturer;
		RAM(String me,String m){
			memory=me;
			manufacturer=m;
		}
		void display()
		{
			System.out.println("\nMemory          : "+memory+"\nManufacturer    : "+manufacturer);
		}
	}
	void display()
	{
		System.out.println("\nPrice           : "+price);
	}
}
class Q8_Inner
{
	public static void main(String args[])
	{
		System.out.println("\nEnter CPU price");
		double price=Double.parseDouble(System.console().readLine());
		System.out.println("\nEnter Number Of Cores Of Processor");
		int  no=Integer.parseInt(System.console().readLine());
		System.out.println("\nEnter Manufacturer Of Processor");
		String mp=System.console().readLine();
		System.out.println("\nEnter RAM Memory");
		String mem=System.console().readLine();
		System.out.println("\nEnter Manufacturer Of RAM");
		String mr=System.console().readLine();
	
		CPU c = new CPU(price);
		CPU.PROCESSOR p= c.new PROCESSOR(no,mp);
		CPU.RAM r= new CPU.RAM(mem,mr);
		c.display();
		p.display();
		r.display();
	}
}