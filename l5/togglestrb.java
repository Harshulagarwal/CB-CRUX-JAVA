package l5;
import java.util.*;

public class togglestrb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
String s=a.nextLine();
System.out.println(toggle(s));
	}public static String toggle(String s)
	{StringBuilder st=new StringBuilder();
		for(int i=0;i<s.length();i++)
		
	if(s.charAt(i)>=65 && s.charAt(i)<=91)
	{char ch=(char)(s.charAt(i)+32);
	st.append(ch);
	}
	else if(s.charAt(i)>=97 && s.charAt(i)<=122)
		{char ch=(char)(s.charAt(i)-32);
		st.append(ch);
		}return st.toString();
}}
