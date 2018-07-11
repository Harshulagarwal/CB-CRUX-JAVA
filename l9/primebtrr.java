package l9;

public class primebtrr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
prime(50)
	}

	public static void prime(int n, int[] arr) {
		boolean[] ar = new boolean[n + 1];

		for (int i = 0; i < Math.pow(n, 1 / 2); i++) {
			for (int j = i+1; j < arr.length; j++)
				if (j % i    == 0)
					ar[j] = true;

		}
	}
	
}
