package harshul;

import java.util.Scanner;

public class isort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]=takeinput();

isort(a);//disp(a);

	}
	public static int[] takeinput()
	{
		Scanner o=new Scanner (System.in);
		int n=o.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
			arr[i]=o.nextInt();
		return arr;}
	public static void disp(int[] arr)
	{for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);}

public static void isort(int[] a )
{
	for(int i=0;i<a.length-1;i++)
{int t=0;
for(int j=i+1;j>0;j--)
	{if(a[j-1]>a[j])
	{t=a[j];
	a[j]=a[j-1];
	a[j-1]=t;}
}}for(int i=0;i<a.length;i++)
	System.out.println(a[i]);
}}
