import java.io.*;
class Symmetric_Matrix 
{
	int row,column,m[][],mt[][];
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	Symmetric_Matrix(int r,int c)
	{
		row=r;
		column=c;
		m=new int[r][c];mt=new int[r][c];
	}
	void read_matrix()throws IOException
	{
		int i,j;
		for(i=0;i<row;i++){
			for(j=0;j<column;j++){
				m[i][j]=mt[j][i]=Integer.parseInt(br.readLine());
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
	void symmetric_matrix()
	{
		int i,j,f=0;
		for(i=0;i<row;i++){
			for(j=0;j<column;j++){
				System.out.print(mt[i][j]+"\t");
				if(m[i][j]!=mt[i][j])
				{
					f=1;
				}
			}			
			System.out.println("\n");
		}
		if(f==0){
			System.out.println("---------------------------\nThe Given Matrix Is SYMMETRIC\n---------------------------");
		}
		else{
			System.out.println("---------------------------\nThe Given Matrix Is NOT SYMMETRIC\n---------------------------");
		}
	}
	
}
class Q10_Symmetric_Matrix
{
	public static void main(String args[]) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nEnter the Number of Rows");
        int r = Integer.parseInt(br.readLine());
        System.out.println("\nEnter the Number of Columns");
        int c = Integer.parseInt(br.readLine());
		while(r!=c)
        {
            System.out.println("Should have equal number of rows and columns");
            System.out.println("\nEnter the Number of Rows");
			r = Integer.parseInt(br.readLine());
			System.out.println("\nEnter the Number of Columns");
			c = Integer.parseInt(br.readLine());	
        }
		Symmetric_Matrix m1=new Symmetric_Matrix(r,c);
		System.out.println("\n---------------------------\nMATRIX 1\n---------------------------\nEnter Matrix Elements One By One");
		m1.read_matrix();
		System.out.println("---------------------------\nMATRIX \n---------------------------");
		m1.disp_matrix();
		System.out.println("---------------------------\nTRANSPOSE\n---------------------------");
		m1.symmetric_matrix();	
	}
}