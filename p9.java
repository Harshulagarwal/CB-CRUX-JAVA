package harshul;
import java.util.Scanner;
public class p9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
for(int i=1;i<=n;i++)
	{for(int j=1;j<=i;j++)
		System.out.print(j+"\t");
for(int k=(2*n)-1;k>2*i;k--)
	System.out.print("\t");
for(int j=i;j>0;j--)
{if(j==n)
	{j--;
	System.out.print(j+"\t");
	}
else
		System.out.print(j+"\t");
}

	System.out.println();
}}	}
