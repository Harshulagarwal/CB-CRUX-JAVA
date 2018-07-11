package l7hw;

import java.util.Scanner;

public class dup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		 String n=a.next();	

System.out.println(spal(n));
	
	}
	public static String spal(String s)
	{
		int j=0;
if(s.length()<=1)
	return s;
char c=s.charAt(0);
char c1=s.charAt(1);
s=s.substring(1);
if(c=='h'&&c1=='i')
{return "bye"+spal(s.substring(1));
}
else 
	return c+spal(s.substring(0));
}	
	
	}


