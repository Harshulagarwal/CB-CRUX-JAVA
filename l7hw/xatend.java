package l7hw;

import java.util.Scanner;

public class xatend {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		 String n=a.next();// TODO Auto-generated method stub
Xatend(n,0);
	}
public static void Xatend(String s,int i)
{
if(s.length()==0)
{for(int q=0;q<i;q++)
	System.out.print('x');
return ;
}
char c=s.charAt(0);
s=s.substring(1);	
if(c!='x')
{//st.append(c);
		System.out.print(c);
}
else if(c=='x')
	i++;
Xatend(s,i);
	
	}
}
