import java.util.Scanner;
class Complex{
	float real,img;
	Complex(){
		real=0;img=0;
	}
	Complex(float r,float i){
			real=r;img=i;
	}
	void add(Complex c1,Complex c2){
		real=c1.real+c2.real;
		img=c1.img+c2.img;
		System.out.println(c1.real+" + i"+c1.img+"  +  "+"\n"+c2.real+" + i"+c2.img);
	}
	void display(){
		System.out.println("-------------\n"+real+" + i"+img);
	}
	public static void main(String args[]){
		Scanner ip=new Scanner(System.in);
		float r1,r2,im1,im2;
		System.out.println("\n----------------------------------------------------------");
		System.out.println("\nEnter Real Part Of The First Complex Number");
        r1=ip.nextFloat();
        System.out.println("\nEnter Imaginary Part Of The First Complex Number");
        im1=ip.nextFloat();
        System.out.println("\nEnter Real Part Of The Second Complex Number");
        r2=ip.nextFloat();
        System.out.println("\nEnter Imaginary Part Of The Second Complex Number");
        im2=ip.nextFloat();
        System.out.println("\n----------------------------------------------------------");
        Complex c1=new Complex(r1,im1);
        Complex c2=new Complex(r2,im2);
        Complex c3=new Complex();
		c3.add(c1,c2);
		c3.display();
	}
}