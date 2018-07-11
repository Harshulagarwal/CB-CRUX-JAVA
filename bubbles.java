package harshul;

import java.util.Scanner;

public class bubbles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=takeinput();
	
System.out.println(bsort(arr));
disp(arr);
	}public static int[] takeinput()
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

	
	public static int[] bsort(int[] arr)
{int t=0;
	for(int i=0;i<arr.length;i++)

{for(int j=0;j<arr.length-1-i;j++)

if(arr[j]>arr[j+1])
	{t=arr[j];
arr[j]=arr[j+1];
arr[j+1]=t;
}
}return arr;}
}