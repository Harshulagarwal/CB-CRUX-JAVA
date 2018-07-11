package harshul;

import java.util.Scanner;

public class pfab {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int a=0,b=1,c;	
			System.out.println(a);
			for(int i=1;i<n;i++)
				{for(int j=0;j<=i;j++)
			{c=b;
			b=a+b;
			a=c;
			
			System.out.print(c+"\t");
	}
				System.out.println();
}}}
