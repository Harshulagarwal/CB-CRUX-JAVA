package harshul;
import java.util.Scanner;
public class patternb {
	public static void main(String args[])
	{Scanner obj=new Scanner(System.in);
	int n=obj.nextInt();
		for(int k=1;k<=n;k++)
		{for(int i=k;i<n;i++)
			System.out.print("\t");
		for(int j=k;j<=(2*k)-1;j++)
			System.out.print(j+"\t");
		for(int q=(2*k)-2;q>=k ;q--)
			System.out.print(q+"\t");
		System.out.println();

		}
		for(int k=n-1;k>0;k--)
		{for(int i=k;i<n;i++)
			System.out.print("\t"
					+ "");
		for(int j=k;j<=(2*k)-1;j++)
			System.out.print(j+"\t");
		for(int q=(2*k)-2;q>=k ;q--)
			System.out.print(q+"\t");
		System.out.println();

		
	}
}}
