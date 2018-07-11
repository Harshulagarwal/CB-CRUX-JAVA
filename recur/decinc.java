package recur;

public class decinc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pdi(5);
	}

	public static void pdi(int n) {
		if (n <= 0) {
			return;	
		}//pdi(n + 1);
			//System.out.println(n);
							
		if(n%2!=0)
		{System.out.println(n);
		}pdi(n -1);
		if(n%2==0) 
		System.out.println(n);}
}
