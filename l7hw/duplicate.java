package l7hw;
import java.util.Scanner;

public class duplicate {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				// TODO Auto-generated method stub	 
				Scanner a = new Scanner(System.in);
				 String n=a.next();	

		spal(n);
			
			}
			public static void spal(String s)
			{int j=0;
		if(s.length()==0)
			return;
		char c=s.charAt(0);
		char c1=s.charAt(1);
		s=s.substring(1, s.length()-1);
		System.out.println(c);
		if(c==c1)
		{System.out.println("*");
			
		}
	spal(s);
			}
			}
			
			




}
