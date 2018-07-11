package recur;

public class power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
p(2,5);
	}
public static int p(int n,int x)
{ if(x==0)
	return 1;
	int po=p(n,x-1);
	po=n*x;
			return po;}
}
