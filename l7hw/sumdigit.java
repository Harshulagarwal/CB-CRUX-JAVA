package l7hw;

import java.util.Scanner;

public class sumdigit {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		 String n=a.next();	// TODO Auto-generated method stub
sumd(n,0);
	}
public static void sumd(String s,int c)
{if(s.length()==0)
{System.out.println(c);
	return ;
}	
char ch=s.charAt(0);
	s=s.substring(1);	
	c=c+(int)ch-48;
	sumd(s,c);}
}
