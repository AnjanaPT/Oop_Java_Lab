package Q19_Arithmetic;
interface ArithmeticInterface
{
	public float Add(float a, float b);
	public float Subtract(float a, float b);
	public float Multiply(float a, float b);
	public float Divide(float a, float b);
	public float Modulo(float a, float b);
}
public class Arithmetic implements ArithmeticInterface
{
	public float Add(float a, float b){
		return(a+b);
	}
	public float Subtract(float a, float b){
		return(a-b);
	}
	public float Multiply(float a, float b){
		return(a*b);
	}
	public float Divide(float a, float b){
		return(a/b);
	}
	public float Modulo(float a, float b){
		return(a%b);
	}	
}
