package harshul;
import java.util.Scanner;
public class arrinv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inverse();

			}
		public static void inverse()
		{int j=0;double s=0;
		Scanner obj=new Scanner(System.in);
		int n1=obj.nextInt();
		int a[]=new int[n1];
		for(int i=0;i<a.length;i++)
			a[i]=obj.nextInt();
		
	
		int cb[]=new int[n1];

		for(int k=0;k<n1;k++)
		 cb[a[k]]=k;
		
		for(int k=0;k<n1;k++)
			System.out.println(cb[k]);
			
	}

}
