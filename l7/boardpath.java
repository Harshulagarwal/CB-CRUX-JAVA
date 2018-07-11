package l7;

import java.util.ArrayList;

public class boardpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
public static ArrayList<String>gbp(int e,int c){
//	if()
//	{ArrayList<String>List2=new ArrayList<String>();
//	List2.add("");
//	return List2;
//		}
		//char c=s.charAt(0);
		//int ch=(int)c;
		//String r=s.substring(1);
		ArrayList<String>List=gbp(e,c);
		ArrayList<String>List1=new ArrayList<String>();
		
		for(int i=0;i<List.size();i++)
		{//List1.add(List.get(i));
		List1.add(c+List.get(i));
		List1.add(List.get(i)+c);
		
		
		//List1.add(ch+List.get(i));
		}return List1;
}

}
}

