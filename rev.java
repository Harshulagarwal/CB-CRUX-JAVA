package harshul;
import java.util.Scanner;
import java.lang.Math.*;
public class rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int i=obj.nextInt();
		int j=0,q=0,s=0;double c=0;
		
	while(i>0)
	{s=s*10;;
	s=s+i%10;
	i=i/10;
	c--;
	}
	System.out.println(s);
	}
	

}
