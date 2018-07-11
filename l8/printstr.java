package l8;

import java.util.ArrayList;

public class printstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getp(2,2,0,0,"");
	}
public static void getp(int er,int ec,int cr,int cc,String p)
{String s=new String();
	if(cr==er && cc==ec)
	{System.out.println(p);	
	return;
	}
	else if(cr>er || cc>ec)
	{return ;	
	}
else if(cr<=2 && cc<=2)
{
	getp(er,ec,cr,cc+1,p+"H");

getp(er,ec,cr+1,cc,p+"V");

getp(er,ec,cr+1,cc+1,p+"D");



		
	
	
}

}


}
