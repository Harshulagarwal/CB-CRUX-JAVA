package l7hw;

import java.util.Scanner;

public class btwbkt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		 String n=a.next();
spal(n,n.indexOf('('),n.indexOf(')'));
	}
	public static void spal(String s,int i,int j)
	{int k=0;
	if(i==j-1)
{
	return;//return st.toString();
	}
		
	char c=s.charAt(0);
//	char c1=s.charAt(s.length()-1);
	//s=s.substring(1);	
char c3;
//char c1=s.charAt(i);
//char c2=s.charAt(j);
	c3=s.charAt(i+1);
	//st.append(c3);
	System.out.print(c3);
spal(s,i+1,j);

}
	
	}


