package harshul;

import java.util.Scanner;

public class f2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int i=obj.nextInt();
		int a=0,b=1,c=0,n=i-1;	
			while(n>0)
			{c=b;
			b=a+b;
			a=c;
				n--;
			}System.out.println(b);
			
	}

}
