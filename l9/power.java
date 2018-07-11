package l9;

public class power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(pow(3,4));
	}
public static int pow(int x,int n)
{if(n==0)
	return 1;
	if(n%2==0)
 return pow(x,n/2)*pow(x,n/2);
	else
		return pow(x,n/2)*pow(x,n/2)*x;

	}

}
