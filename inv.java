package harshul;
import java.util.Scanner;

public class inv {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
        int n1=obj.nextInt();
		// TODO Auto-generated method stub
//System.out.println(inverse(n1));
        inverse(n1);
	}
public static void inverse(int p)
{int i=1,j=0;double s=0;int n=p;
while(n!=0)
	{j=n%10;
	s=s+java.lang.Math.pow(10,j-1)*i;
	n=n/10;
	i++;}
System.out.println((int)s);

	}

}
