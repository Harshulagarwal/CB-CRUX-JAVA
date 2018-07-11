package harshul;
import java.util.Scanner;
public class pascl {
public static void main(String args[])
{Scanner ob=new Scanner(System.in);
	int n=ob.nextInt();
	for(int i=0;i<n;i++)
 {int v=1;
 for(int j=0;j<=i;j++)
 {System.out.print(v+"\t");
 v=v*(i-j)/(j+1);}
 System.out.println();}}


}
