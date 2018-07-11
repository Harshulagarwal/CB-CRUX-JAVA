package l5;
import java.util.*;

public class diff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		String s=a.nextLine();
		System.out.println(toggle(s));
	}public static String toggle(String s)
	{StringBuilder st=new StringBuilder();
		for(int i=0;i<s.length();i++)	
	{if(i<s.length()-1){
		char ch=(s.charAt(i));
	char ch1=(s.charAt(i+1));
	int d=(int)ch1-(int)ch;
	st.append(ch);
	st.append(d);}
	else if(i==s.length()-1)
		st.append(s.charAt(i));
	}return st.toString();
	}

}
