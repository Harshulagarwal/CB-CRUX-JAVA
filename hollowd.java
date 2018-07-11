package harshul;

import java.util.Scanner;

public class hollowd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
			for(int k=1;k<=(n+1)/2;k++)
			{for(int j=k;j<=(n+1)/2;j++)
				System.out.print("*\t");
			for(int i=1;i<=(2*k)-1;i++)
				System.out.print("\t");
		for(int q=k;q<=(n+1)/2;q++)
				System.out.print("*\t");
			System.out.println();

			}
			for(int k=(n-1)/2;k>0;k--)
			{for(int j=k;j<(n+3)/2;j++)
				System.out.print("*\t");
				for(int i=k;i<(3*k)-1;i++)
				System.out.print("\t");
			for(int q=k;q<(n+3)/2;q++)
				System.out.print("*\t");
			System.out.println();

			}
	}

}
