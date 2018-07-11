package l8hw;

import java.util.Scanner;

public class hibye {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		String n = a.next();
		System.out.println(hi(n, 0));
		System.out.println(chi(n));
		System.out.println(crhi(n));
	}

	public static int hi(String s, int co) {
		if (s.length() == 0) {
			return co;
		}

		else if (s.length() > 2) {
			char c = s.charAt(0);
			char c1 = s.charAt(1);
			char c2 = s.charAt(2);

			s = s.substring(1);
			if (c == 'h' && c1 == 'i' && c2 != 't') {
				return hi(s.substring(1), co + 1);
			}

			else
				return hi(s.substring(0), co);
		} else if (s.length() == 2) {
			char c = s.charAt(0);char c1=s.charAt(1);
			if(c=='h' && c1=='i')
				return hi(s.substring(1), co + 1);

			// else return c+hi(s.substring(0),co);

		}
		return co;
	}

public static String chi (String s)
{if(s.length()<=0)
	{
	return s;
	}
if(s.length()>2)
	{char c=s.charAt(0);
char c1=s.charAt(1);
char c2=s.charAt(2);
s=s.substring(1);


if(c=='h'&&c1=='i'&& c2!='t')
{
return chi(s.substring(1));
	}
else return c+chi(s.substring(0));
}
else if(s.length()==2)
{char c=s.charAt(0);char c1=s.charAt(1);if(c=='h' && c1=='i')
	return chi(s.substring(2));}

//else return chi(s.sub)
return s;}

	public static String crhi(String s) {
		if (s.length() <= 0) {
			return s;
		}else if(s.length()>2){
		char c = s.charAt(0);
		char c1 = s.charAt(1);
		char c2 = s.charAt(2);

		s = s.substring(1);

		if (c == 'h' && c1 == 'i' && c2 != 't') {
			return "bye" + crhi(s.substring(1));

		} else
			return c + crhi(s.substring(0));
	}else if(s.length()==2)
	{char c=s.charAt(0);char c1=s.charAt(1);if(c=='h' && c1=='i')
		return chi("bye"+s.substring(2));}
	return s;}
}