package harshul;

import java.util.Scanner;

public class max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(max());
	}
	public static int max()
	{Scanner o=new Scanner (System.in);
	int n=o.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<arr.length;i++)
		arr[i]=o.nextInt();
	int max=0;
		for(int i=0;i<arr.length;i++)
		{
	if(arr[i]>arr[max])
		max=i;
	}
		return arr[max];

}}
