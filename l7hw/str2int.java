package l7hw;

import java.util.Scanner;

public class str2int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		 String n=a.next();
s2i(n,0,0);
	}
public static void s2i(String s,int i1,int i)
{	if(s.length()==0)
{System.out.println(i1);
return ;
	}
	
char c=s.charAt(s.length()-1);
int c1=c;
s=s.substring(0,s.length()-1);
	i1=i1+(int)(java.lang.Math.pow(10,i)*(c1-48));
	//System.out.println(c +"   "+java.lang.Math.pow(10,i)+"   "+java.lang.Math.pow(10,i)*c +"   "+(c1-48)*2);
	s2i(s,i1,i+1);  
	}

	
}
