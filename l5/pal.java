package l5;
import java.util.*;

import java.util.Scanner;

public class pal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		String s=a.nextLine();

	System.out.println(print(s));
		}
	public static boolean print(String s){
	int f=1;for(int i=0, j=s.length()-1;j>i;i++,j--)
	{if(s.charAt(j)!=s.charAt(i))
	{f=0;
	break;
	}}
if(f==1)
return true;
		return false;
			
}}
