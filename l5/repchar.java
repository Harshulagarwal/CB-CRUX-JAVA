package l5;

import java.util.Scanner;

public class repchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner a = new Scanner(System.in);
		String s=a.nextLine();System.out.println(toggle(s));
	}public static String toggle(String s)
	{StringBuilder st=new StringBuilder();char c=0;int f=0;
		int count;
		for(int i=0;i<s.length();i=i+count)	
		{	count=1;
		c=s.charAt(i);
		for(int j=0;j<s.length();j++)
		{	if(s.charAt(i)==s.charAt(j))
		{f=1;count++;}
		else break;
		}
		//if(count>1)	
		//{
		st.append(count);
st.append(c);
		}		return st.toString();	//}
		//	else if(count==1)
		//{st.append(c);}}
	//	for(int j=i;j<s.length();j++)
		//if(s.charAt(i)==s.charAt(j))
			//i++;
		
//		int i1=0;
//		for( i1=0;i1<st.length()-1;i1=i1+2)
//			{int max=st.charAt(0);
//			if(max<st.charAt(i1))
//			max=st.charAt(i1);
//			}return st.toString();
}}
