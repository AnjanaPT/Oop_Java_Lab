package Q18_Graphics;
interface GraphicsInterface
{
	public double cirArea(double radius);
	public double triArea(double breadth, double height);
	public double sqrArea(double side);
	public double recArea(double length, double width);
}
public class Graphics implements GraphicsInterface
{
	public double cirArea(double radius){
		return(3.14*radius*radius);
	}
	public double sqrArea(double side){
		return(side*side);
	}
	public double triArea(double breadth, double height){
		return(0.5*breadth*height);
	}
	public double recArea(double length, double width){
		return(length*width);
	}	
}
