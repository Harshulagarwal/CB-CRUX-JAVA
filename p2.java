package harshul;
import java.util.Scanner;

public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
int q=0;
for(int i=1;i<=n;i++)
{	for(int j=i;j<2*i;j++)
{
	if(j!=i && j!=(2*i)-1)
		{System.out.print("0\t");
		}
	else 
		System.out.print(i+"\t");
	}System.out.println();
}	}

}
