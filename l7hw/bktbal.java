package l7hw;
import java.util.Scanner;

public class bktbal {

	public static void main(String[] args) {
		// TODO Auto-generated method st
			Scanner a = new Scanner(System.in);
			 String n=a.next();
	spal(n);
		
		}
		public static void spal(String s)
		{int j=0,i=0,k=0;
		if(s.length()==0)
		{if(j==0 && k==0 &&i==0)
			System.out.println("true");
		else 
			System.out.println("false");
		return;}
			
		char c=s.charAt(0);
	//	char c1=s.charAt(s.length()-1);
		s=s.substring(1);	
		if(c=='{')
			j++;
		else  if(c=='[')
			i++;
		else if(c=='(')
		k++;
		else if(c=='{')
			j--;
		else  if(c=='[')
			i--;
		else if(c=='(')
		k--;
		spal(s);
		}
		
		}



