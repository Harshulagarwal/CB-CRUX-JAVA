package harshul;

import java.util.Scanner;

public class triplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
trip();
	}
public static void trip()
{Scanner o=new Scanner(System.in);
int n=o.nextInt();
int[] a=new int[n];
for(int i=0;i<n;i++)
	a[i]=o.nextInt();
int t=0;
for(int i=0;i<a.length;i++)

{
	for(int j=0;j<a.length-1-i;j++)

{
if(a[j]>a[j+1])
{t=a[j];
a[j]=a[j+1];
a[j+1]=t;
}
}}
int q=o.nextInt();
	for(int i=0;i<n;i++)
	{for(int j=0;j<n;j++)
	//{for(int k=0;k<n;k++)
	if(a[i]+a[j]==q && a[i]!=a[j] && a[i]<a[j] )
		System.out.println(a[i]+"\tand\t"+a[j]);}
	//}
}
}