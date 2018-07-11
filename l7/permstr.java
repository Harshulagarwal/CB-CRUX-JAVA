package l7;

import java.util.ArrayList;

public class permstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
perm("abc","");
	}
public static void perm(String s,String st)
{	if(s.length()==0)
{System.out.println(st);
return ;
	}
	

	for(int i=0;i<s.length();i++)
	{char c=s.charAt(i);
	//int ch=(int)c;
	String r=s.substring(0,i)+s.substring(i+1);//List1.add(List.get(i));
     perm(r,st+c);     

//	for(int j=0;j<=s.length();j++)
//	{	
//		}
	
	//List1.add(ch+List.get(i));
	}

	}
}