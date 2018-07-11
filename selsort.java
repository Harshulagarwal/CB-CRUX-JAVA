package harshul;

import java.util.Scanner;

public class selsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=takeinput();
		
selsort(arr);
disp(arr);
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

public static void selsort(int[] arr)
{for(int k=0;k<arr.length-1;k++)
{int min=k;
	for(int i=k+1;i<arr.length;i++)
{
	if(arr[i]<arr[min])
		min=i;
	}
int t=0;
t=arr[min];
arr[min]=arr[k];
arr[k]=t;
System.out.println(t);
}

}
	}

