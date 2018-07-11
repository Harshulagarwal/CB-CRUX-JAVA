package l8;

public class l81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(cmazepath(2,2,0,0));
	}
public static int cmazepath(int er,int ec,int cr,int cc)
{
	if(cr==2 && cc==2)
	{	
		return 1;
	}
	else if(cr>er || cc>ec)
		return 0;
	else if(cr<=2 && cc<=2)
	{
	
	return cmazepath(er,ec,cr+1,cc)+cmazepath(er,ec,cr,cc+1);
	}
	else return 1;
}}
