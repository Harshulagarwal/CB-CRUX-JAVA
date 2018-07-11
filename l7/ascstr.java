package l7;

import java.util.ArrayList;

public class ascstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(printc("ab",0));
	
prints("ab","");

	}

public static ArrayList<String>printc(String s,int co)
{if(s.length()==0)
{ArrayList<String>List2=new ArrayList<String>();
List2.add("");
return List2;
	}
	char c=s.charAt(0);
	int ch=(int)c;
	s=s.substring(1);
	ArrayList<String>List=printc(s,co+1);
	ArrayList<String>List1=new ArrayList<String>();
	
	
//	printc(s,co+1);
//	printc(s+c,co+1);	
//	printc(s+ch,co+1);
	
	for( int i=0;i<List.size();i++)
	{List1.add(List.get(i));
		List1.add(c+List.get(i));
	List1.add(ch+List.get(i));
	}			//System.out.println(List.size());

	if(co==0)
	System.out.println(List1.size());
return List1;
}
	public static void printc(String s1,String st,int count)
	{if(s1.length()==0)
	{System.out.println(st.length());
		return;
	//	return count;
	}	
		char c=s1.charAt(0);
		 s1=s1.substring(1);
		int ch=(int)c;
		printc(s1,st,count+1);
		printc(s1,st+c,count+1);	
		printc(s1,st+ch,count+1);
	//return count;
	}

	public static void prints(String s1,String st)
	{if(s1.length()==0)
	{System.out.print(st+" ");
		return;
	}	
		char c=s1.charAt(0);
		 s1=s1.substring(1);
		int ch=(int)c;
		prints(s1,st);
		prints(s1,st+c);	
		prints(s1,st+ch);
		}


}
