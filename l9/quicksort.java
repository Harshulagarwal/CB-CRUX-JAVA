package l9;

public class quicksort {

	public static void main(String[] args) {
		int[] arr = { 5, 7, 2, 18, 10, 20 }; // TODO Auto-generated method stub
		qs(arr, 0, arr.length - 1);
	}

	public static void qs(int[] ar, int l, int h) {
		int mid = (l + h) / 2;
		int p = ar[l + h] / 2;
		int left = l, right = h;
		if (l >= h) {
			for (int i = 0; i < ar.length; i++)
				System.out.println(ar[i]);
			return;
		}
		while (left <= right) {
			{
				while (ar[left] < p)
					left++;
				// qs(ar,l,mid);
			}
			while (ar[right] > p) {
				right--;
				// qs(ar,mid+1,h);
			}
			if (left <= right) {
				int t = ar[left];
				ar[left] = ar[right];
				ar[right] = t;
				left++;
				right--;
			}
			qs(ar, l, mid);
// 			qs(ar,l,mid);
			qs(ar,mid+1,h);

		}
	}
}
