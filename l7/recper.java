package l7;
import java.util.Scanner;

import java.util.ArrayList;

public class recper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		 String n=a.next();
		System.out.print(getasc(n,0));
		System.out.println();
		perm(n,"");

	}
	public static ArrayList<String>getasc(String s,int co)
	{if(s.length()==0)
	{ArrayList<String>List2=new ArrayList<String>();
	List2.add("");
	return List2;
		}
		char c=s.charAt(0);
		//int ch=(int)c;
		s=s.substring(1);
		ArrayList<String>List=getasc(s,co+1);
		ArrayList<String>List1=new ArrayList<String>();
		
		for( int i=0;i<List.size();i++)
		{//List1.add(List.get(i));
		String rec=List.get(i);
		for(int j=0;j<=rec.length();j++)
		{	String m=rec.substring(0,j)+c+rec.substring(j+1);
			List1.add(m);
		}
		
		//List1.add(ch+List.get(i));
		}			//System.out.println(List.size());

		if(co==0)
		System.out.println(List1.size());
return List1;
}
	public static void perm(String s,String st)
	{	if(s.length()==0)
	{System.out.print(st+"  ");
	return ;
		}
		

		for(int i=0;i<s.length();i++)
		{char c=s.charAt(i);
		//int ch=(int)c;
		String r=s.substring(0,i)+s.substring(i+1);//List1.add(List.get(i));
	     perm(r,st+c);     

//		for(int j=0;j<=s.length();j++)
//		{	
//			}
		
		//List1.add(ch+List.get(i));
		}

}}