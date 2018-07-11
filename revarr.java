package recur;

import java.util.Scanner;

public class revarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		int n=a.nextInt();
			int s[]=new int[n];
			for(int i=0;i<s.length;i++)
				s[i]=a.nextInt();
		
reva(n,s,0,0);
	}
public static void reva(int n,int[] arr,int i,int c)
{int[] b=new int[c];
if(i>=n)
	return ;

else 
reva(n,arr,i+1,c+1);
System.out.println(arr[i]); 	

}}
