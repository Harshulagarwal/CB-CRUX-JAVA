package recur;

import java.util.Scanner;

public class rucbsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner a = new Scanner(System.in);
				int n=a.nextInt();
					int s[]=new int[n];
					for(int i=0;i<s.length;i++)
						s[i]=a.nextInt();
	rbsort(n,s,0,0);}
public static void rbsort(int n,int[] arr,int i,int j)
{if (i>=n)
	return;
	
else if(i<n)
{	if(j==n-1-i){
	System.out.println(arr[j]);
	 j=0; rbsort(n,arr,i+1,j);
}
else if(j<n-1-i)
	{
		if(arr[j]<arr[j+1])
		{
		int	t=arr[j];
	arr[j]=arr[j+1];
	arr[j+1]=t;
	}//System.out.println(arr[j]);
	rbsort(n,arr,i,j+1);
    }
	}
}}
