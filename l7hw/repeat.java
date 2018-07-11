package l7hw;import java.util.Scanner;


public class repeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	 
		Scanner a = new Scanner(System.in);
		 String n=a.next();
s2i(n,0);
	}
public static void s2i(String s,int i)
{	if(s.length()-2==0)
{System.out.println(i);
return ;
	}
char c=s.charAt(0);
char c1=s.charAt(2);
s=s.substring(1);
if(c!=c1)
	s2i(s,i);  
else 
s2i(s,i+1);  
	}

	
}



