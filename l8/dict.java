package l8;

import java.util.ArrayList;
import java.util.Scanner;

public class dict {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		String n = a.next();
		// System.out.println(printc(n, "", 0));

		perm(n, "", n);
	}
	//
	// public static ArrayList<String> printc(String s, String st, int co) {
	// if (s.length() == 0) {
	// ArrayList<String> List2 = new ArrayList<String>();
	// List2.add("");
	// return List2;
	// }
	// char c = s.charAt(0);
	// String r=s;
	// s = s.substring(1);
	//
	// ArrayList<String> List = printc(s, st +c, co + 1);
	// ArrayList<String> List1 = new ArrayList<String>();
	//
	// for (int i = 0; i < List.size(); i++) {
	// String rec = List.get(i);
	// for (int j = 0; j <rec.length(); j++) {
	//
	// if ((int) c > (int) r.charAt(j)) {
	// continue;
	// }
	//// else if ((int) c == (int) ch) {
	//// String sr = s.substring(0, j) + s.substring(j + 1);//
	// List1.add(List.get(i));
	//// List1.add(sr);
	//
	// //}
	// else {
	// String sr = s.substring(0, j)+s.substring(1+j);// List1.add(List.get(i));
	// List1.add(sr);
	// }
	// } // System.out.println(List.size());
	//
	// }
	// if (co == 0)
	// System.out.println(List1.size());
	// return List1;
	// }

	public static void perm(String s, String st, String w) {

		if (s.length() == 0) {
			if (!st.equals(w))
				System.out.println(st);

			return;
		}

		char ch = s.charAt(0);
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if ((int) c > (int) ch) {
				continue;
			}
			// if((int)c==(int)ch)
			// {
			// String sr = s.substring(0, i) + s.substring(i + 1);//
			// List1.add(List.get(i));
			// perm(sr, st +c,w);
			// }
			else {

				String sr = s.substring(0, i) + s.substring(i + 1);// List1.add(List.get(i));
				perm(sr, st + c, w);

			}

		}

	}
}