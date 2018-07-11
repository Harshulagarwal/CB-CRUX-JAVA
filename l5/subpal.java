package l5;

import java.util.*;

public class subpal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner a = new Scanner(System.in);
		String s = a.nextLine();
		System.out.println(print(s));
	}

	public static int print(String s) {
		int f = 0, c = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				String st = s.substring(i, j + 1);
				//System.out.println(s.substring(i, j + 1));
				for (int i1 = 0, j1 = st.length() - 1; j1 >=i1; i1++, j1--) {
					if (st.charAt(j1) != st.charAt(i1))
						{f=0;
						break;}
					else
						{f = 1;
						//System.out.println(s.substring(i, j + 1));
						//c++;
						}
				}
			
			if (f == 1) {
	
				c++;
			}
		}}
		return c;
	}
}
