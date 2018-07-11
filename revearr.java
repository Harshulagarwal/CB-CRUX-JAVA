package harshul;

import java.util.Scanner;

public class revearr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]=takeinput();
		//System.out.println(takeinput());		// TODO Auto-generated method stub

System.out.println(rev(arr));
disp(arr);}
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
	
public static int[] rev(int[] arr)
{for(int i=0,j=arr.length-1;i<arr.length/2;i++,j--)
{int temp=arr[i];
arr[i]=arr[j];
arr[j]=temp; 
	}
return arr;

	}

}
