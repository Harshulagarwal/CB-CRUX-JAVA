package l9;

import java.util.Scanner;

public class merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] a1=new int [x];
		// int[] b1=new int [y];

		Scanner a = new Scanner(System.in);
		int x = a.nextInt();
		int[] a1 = new int[x];
		for (int i = 0; i < x; i++)
			a1[i] = a.nextInt();
		int[] sorted= mergesort(a1,0,a1.length-1);
		for (int q = 0; q < sorted.length; q++)
			System.out.println(sorted[q]);}

	public static int[] mergesort(int[] ar, int low, int high) {
		if (high == low) {
		int[] t=new int[1];
			 t[0]=ar[high];	
		return t;
		}
		int mid = (low + high) / 2;
		int[] fa = mergesort(ar, low, mid);
		int[] la = mergesort(ar, mid + 1, high);
int[] r=merge(fa,la);
return r;
	}

	public static int[] merge(int[] a, int[] b) {
		int i = 0, j = 0, k = 0;
		int[] c = new int[a.length + b.length];
		while (i < a.length && j < b.length) {
			if (a[i] < b[j])
				c[k++] = a[i++];

			else
				c[k++] = b[j++];
		}
		while (i < a.length) {
			c[k++] = a[i++];

		}
		while (i < b.length) {
			c[k++] = b[j++];

		}
	return c;
	}
}
