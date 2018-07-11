package l7hw;
import java.util.Scanner;

public class revtrue {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			// TODO Auto-generated method stub	 
			Scanner a = new Scanner(System.in);
			 String n=a.next();			 
			 String m=a.next();

	spal(n,m);
		
		}
		public static void spal(String s,String s1)
		{int j=0;
		if(s.length()<2)
		{System.out.println("true");
		return;
			}
		char c=s.charAt(0);
		s=s.substring(1,s.length()-1);
		char c2=s1.charAt(s1.length()-1);
		s1=s1.substring(1, s1.length()-1);
		if(c==c2)
			{spal(s,s1);}
		else 
		{System.out.println("false");
		return;
		}
		}
		
		}



