package l12;

import l11.oops2;

public class stkbkt {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String s = "((a+b)+(c+d))";
		System.out.println(bkt(s));
	}

	public static boolean bkt(String s) throws Exception {
		oops2 st = new oops2();
		char a = 0;
		for (int i = 0; i < s.length(); i++) {
			a = s.charAt(i);
			if (a == '{' || a == '[' || a == '(') {
				st.push(a);
			}
			// else if(a=='}'|| a==']'||a==')')
			else if (a == '}' && (char) st.rettos() == '{') {
				st.pop();
			} else if (a == ']')
				st.pop();
			else if (a == ')' && (char) st.rettos() == '(')
				st.pop();

		}
	
		if (st.size() == 0) {
			return true;
		}

		else {
			return false;
		}
	}
}
