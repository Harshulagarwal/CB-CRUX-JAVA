package recur;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(6));
	}

	public static int fact(int n) {
		int m=0;
		if (n == 0)
			return 1;
		else if (n > 0) {
			  m=n*fact(n - 1);
			
		}
		return m;
	}
}
