package harshul;
import java .util.Scanner;

public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
sum();
	}
public static void sum()
{Scanner obj=new Scanner(System.in);
int n1=obj.nextInt();
int n2=obj.nextInt();
int a[]=new int[n1];
for(int i=0;i<a.length;i++)
	a[i]=obj.nextInt();
int b[]=new int[n2];
for(int i=0;i<b.length;i++)
	b[i]=obj.nextInt();


if(n1>=n2)
{
if(a[n1-1]+b[n2-1]<10)
{int c[]=new int[n1];
for(int i=n1-1,j=n2-1;i>=0;i--,j--)
	{int k=i-1;
	if(j>=0)
	{
	c[i]=a[i]+b[j];
	if(c[i]>=10)
	{c[i]=c[i]%10;
	 a[k]=a[k]+1;
	}}else c[i]=a[i];
}for(int i=0;i<c.length;i++)
	System.out.print(c[i]+",");
	System.out.print("END");}
else if(a[n1-1]+b[n2-1]==10)
{ int c[]=new int[n1+1];
for(int i=n1-1,j=n2-1;i>=0;i--,j--)
{int k=i-1;
if(j>=0 && k>0)
{
c[i+1]=a[j]+b[i];
if(c[i+1]>=10)
{c[i+1]=c[i+1]%10;
 c[k+1]=b[k]+1;
}}
else if(j<0 && i>0)
{c[i+1]=c[i+1]%10;
 c[k+1]=b[k]+1;}
else if(i<=0)
	{c[i+1]=c[i+1]%10;
	c[0]=1;}
	}
for(int i=0;i<n1+1;i++)
System.out.print(c[i]+",");
System.out.print("END");}}

else if(n2>n1)
{if(a[n1-1]+b[n2-1]<10)
	{int c[]=new int[n2];
for(int i=n1-1,j=n2-1;j>=0;i--,j--)
{int k=j-1;if(i>=0)
{
c[j]=a[i]+b[j];
if(c[j]>=10)
{c[j]=c[j]%10;
 b[k]=b[k]+1;
}}else c[j]=b[j];
if(c[j]>=10)
{c[j]=c[j]%10;
 b[k]=b[k]+1;
}}
for(int i=0;i<n2;i++)
	System.out.print(c[i]+",");
	System.out.print("END");}	
	
	
	
else if(a[n1-1]+b[n2-1]==10)
{
	int c[]=new int[n2+1];

		for(int i=n1-1,j=n2-1;j>=0;i--,j--)
			{int k=j-1;
			if(i>=0 && k>0)
			{
			c[j+1]=a[i]+b[j];
			if(c[j+1]>=10)
			{c[j+1]=c[j+1]%10;
			 c[k+1]=b[k]+1;
			}}
			else if(i<0 && j>0)
			{c[j+1]=c[j+1]%10;
			 c[k+1]=b[k]+1;}
			else if(j<=0)
				{c[j+1]=c[j+1]%10;
				c[0]=1;}}
		for(int i=0;i<n2+1;i++)
		System.out.print(c[i]+",");
		System.out.print("END");}}


}}
