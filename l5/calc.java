package l5;
import java.util.Scanner;

public class calc {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		char ch=a.next().charAt(0);// TODO Auto-generated method stub
while(ch!='X'||ch!='x')
	{if(ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='%')
	{int n1=a.nextInt();
	int n2=a.nextInt();
	if(ch=='+')
		System.out.println(n1+n2);
	else if(ch=='-')
		System.out.println(n1-n2);
	else if(ch=='*')
		System.out.println(n1*n2);
	else if(ch=='/')
		System.out.println(n1/n2);
	else if(ch=='%')
		System.out.println(n1%n2);}
	else System.out.println("Invalid operation. Try again.");
 ch=a.next().charAt(0);// TODO Auto-generated method stub
}

}}
