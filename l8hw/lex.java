package l8hw;
import java.util.Scanner;
public class lex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a=new Scanner(System.in);
		int n=a.nextInt();	System.out.println("0");
Test(n,1);
	}
	public static void Test(int N, int k) 
	{ 
	if (k > N) {return;} 

	for(int i = 0; i<10; i++) 
	{ 
	if (k <= N) 
	{ 
	System.out.println(k); 

	k *= 10; 
	Test(N, k); 
	k /= 10; 
	k++;  
	if (k%10 == 0) return; 

	} 
	} 
	} 
}
