package l7hw;

import java.util.Scanner;

public class strpal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub	 
		Scanner a = new Scanner(System.in);
		 String n=a.next();
spal(n);
	
	}
	public static void spal(String s)
	{int j=0;
	if(s.length()<2)
	{System.out.println("true");
	return;
		}j++;
	char c=s.charAt(0);
	char c1=s.charAt(s.length()-1);
	s=s.substring(1,s.length()-1);	
	if(c==c1)
		{spal(s);}
	else 
	{System.out.println(j+"  "+c+"  "+ c1+"false");
	return;
	}
	}
	
	}

