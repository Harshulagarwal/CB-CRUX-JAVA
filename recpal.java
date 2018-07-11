package recur;

import java.util.Scanner;

public class recpal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		int n=a.nextInt();
		int s[]=new int[n];
		for(int i=0;i<s.length;i++)
			s[i]=a.nextInt();

System.out.println(rpal(n,s,0,n-1));
	}

public static boolean rpal(int n,int[] a,int i,int j)
{boolean q=false;
	if(i>j)
	return false;
	if(i<=j)
	{q=rpal(n,a,i+1,j-1);
if(a[i]==a[j])
return true;
else return false;}

 return q;
}}