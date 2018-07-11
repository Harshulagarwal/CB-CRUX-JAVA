package harshul;
import java.util.*;

public class intersec {

	public static void main(String[] args) {
//c();	
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar=c();
Collections.sort(ar);

	System.out.print(ar);
		
}
public static  ArrayList<Integer> c()
{	Integer a1=new Integer(10);
ArrayList<Integer> ar = new ArrayList<Integer>();
Scanner obj=new Scanner(System.in);
int n1=obj.nextInt();
int a[]=new int[n1];
for(int i=0;i<a.length;i++)
	a[i]=obj.nextInt();
int b[]=new int[n1];
for(int i=0;i<b.length;i++)
	b[i]=obj.nextInt();
	
for(int i=0;i<n1;i++)
	{for(int j=0;j<n1;j++)
		{if(a[i]==b[j])
	{b[j]=-1;
	
	ar.add(a[i]);
	break;}
	
}
}
//Collections.sort(ar);
//for(int counter:ar)
//	System.out.println(counter);
return ar;
}}
