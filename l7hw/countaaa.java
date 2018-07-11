package l7hw;

import java.util.Scanner;
public class countaaa {

		public static void main(String[] args) {
			Scanner a = new Scanner(System.in);
			 String n=a.next();	// TODO Auto-generated method stub
	sumd(n,0,1);
	sumaaa(n,0);
		}
	public static void sumd(String s,int c,int i)
	{if(s.length()<3)
	{System.out.println(c);
		return ;
	}	
	char ch=s.charAt(0);
	char ch1=s.charAt(1);
	char ch2=s.charAt(2);
		s=s.substring(i,s.length());	
		//System.out.println(s+"  "+i);
	if(ch=='a'&&ch1=='a'&&ch2=='a')
		{c++;
	}sumd(s,c,i);}
	public static void sumaaa(String sr,int b)
	{if(sr.length()<3)
	{	System.out.println(b);
	return;}
	
	else if(sr.length()>=3)
	{char ch1=sr.charAt(0);
	char ch2=sr.charAt(1);
	char ch3=sr.charAt(2);
	sr=sr.substring(3);
if(ch1=='a'&&ch2=='a'&&ch3=='a')
	{
	b++;
		}
	}
		sumaaa(sr,b);}}


	