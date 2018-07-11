package l8;

import java.util.ArrayList;

public class diagarr {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(getp(2,2,0,0));
	}
public static ArrayList<String> getp(int er,int ec,int cr,int cc)
{
	if(cr==er && cc==ec)
	{	ArrayList<String> st=new ArrayList<>();
    st.add("");	
	return st;
	}
	else if(cr>er || cc>ec)
	{ArrayList<String> st=new ArrayList<>();
    return st;	
	}
//	else if(cr<=2 && cc<=2)
	ArrayList<String> hres=getp(er,ec,cr,cc+1);
	ArrayList<String> vres=getp(er,ec,cr+1,cc);
	ArrayList<String> dres=getp(er,ec,cr+1,cc+1);
 ArrayList<String> myres=new ArrayList();
	for(int i=0;i<hres.size();i++)
		myres.add(hres.get(i)+"h");
	
	for(int i=0;i<vres.size();i++)
		myres.add(vres.get(i)+"v");
	
	for(int i=0;i<dres.size();i++)
		myres.add(dres.get(i)+"d");
	
	return myres;
	
}
}
