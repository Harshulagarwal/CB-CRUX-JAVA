package l7;

import java.util.ArrayList;

public class printSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
prints("abc","");
	}
public static void prints(String s1,String st)
{if(s1.length()==0)
{System.out.println(st);
	return;
}	
	char c=s1.charAt(0);
	s1=s1.substring(1);
	//String s2=new String();
	
	prints(s1,st);
	prints(s1,st+c);	
	}

	}

