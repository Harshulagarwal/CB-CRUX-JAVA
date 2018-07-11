package recur;
import java.util.Scanner;

public class checksort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
	int n=a.nextInt();
		int s[]=new int[n];
		for(int i=0;i<s.length;i++)
			s[i]=a.nextInt();
	System.out.println(csort(s,0));}
	
public static boolean csort(int[] a,int i){
boolean q=false;
if(i==a.length-1)
	return true;

if(a[i]>a[i+1])
	{	return false;
	         }
q=csort(a,i+1);		return q;}
}

