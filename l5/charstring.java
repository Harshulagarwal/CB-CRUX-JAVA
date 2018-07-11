package l5;

import java.util.Scanner;

public class charstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		String s=a.nextLine();
print(s);
	}
public static void print(String s){
char ch=s.charAt(0),c=0;int max=0,t=0,p=0;
	for(int i=0;i<s.length();i++)
{int count=0;
		for(int j=0;j<s.length();j++)
{	if(s.charAt(i)==s.charAt(j))
count++;
else continue;
}
if(max<count)
	{t=max;
max=count;
count=t;
p=i;}
}
System.out.println(s.charAt(p));
}}
