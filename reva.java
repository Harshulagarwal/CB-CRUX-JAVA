package harshul;
import java.util.Scanner;

public class reva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ra();
	}
public static void ra()
{Scanner obj=new Scanner(System.in);
int n1=obj.nextInt();
int a[]=new int[n1];
for(int i=0;i<a.length;i++)
	a[i]=obj.nextInt();
int b[]=new int[n1];

	for(int i=(n1-1)/2,j=n1;i>0 && j<(n1+1)/2 ;i--,j--)
{
		b[j]=a[i];
b[q]=a[k];
}
	for(int i=(n1+1)/2,j=0;i<n1&& j<(n1-1)/2;i++,j++)
		b[j]=a[i];
	for(int i=0;i<a.length;i++)
System.out.println(b[i]);
}
}
