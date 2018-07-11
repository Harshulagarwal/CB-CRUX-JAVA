package l5;

public class substr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abba";
		print(s);
			}
		public static void print(String s){
		for(int i=0;i<s.length();i++)
		for(int j=i;j<s.length();j++)
			System.out.println(s.substring(i,j+1));}

	}
