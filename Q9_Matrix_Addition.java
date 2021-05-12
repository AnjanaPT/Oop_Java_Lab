import java.util.*;
class Matrix
{
	int row,column,m[][];
	Matrix(int r,int c)
	{
		row=r;
		column=c;
		m=new int[r][c];
	}
	void read_matrix()
	{
		int i,j;
		Scanner ip=new Scanner(System.in);
		for(i=0;i<row;i++){
			for(j=0;j<column;j++){
				m[i][j]=ip.nextInt();
			}
		}
	}
	void disp_matrix()
	{
		int i,j;
		for(i=0;i<row;i++){
			for(j=0;j<column;j++){
				System.out.print(m[i][j]+"\t");
			}			
			System.out.println("\n");
		}
	}
	void add_matrix(Matrix m1,Matrix m2)
	{
		int i,j;
		for(i=0;i<row;i++){
			for(j=0;j<column;j++){
				m[i][j]=m1.m[i][j]+m2.m[i][j];
			}
		}
	}
}
class Q9_Matrix_Addition
{
	public static void main(String args[]){
		Scanner ip =new Scanner(System.in);
		System.out.println("\nEnter the Number of Rows");
        int r = ip.nextInt();
        System.out.println("\nEnter the Number of Columns");
        int c = ip.nextInt();
		Matrix m1=new Matrix(r,c);
		Matrix m2=new Matrix(r,c);
		Matrix m3=new Matrix(r,c);
		System.out.println("\n---------------------------\nMATRIX 1\n---------------------------\nEnter Matrix Elements");
		m1.read_matrix();
		System.out.println("\n---------------------------\nMATRIX 2\n---------------------------\nEnter Matrix Elements");
		m2.read_matrix();
		m3.add_matrix(m1,m2);
		System.out.println("---------------------------\nMATRIX 1\n---------------------------");
		m1.disp_matrix();
		System.out.println("---------------------------\nMATRIX 2\n---------------------------");
		m2.disp_matrix();
		System.out.println("---------------------------\nADDED MATRIX \n---------------------------");
		m3.disp_matrix();
	}
}