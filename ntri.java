package recur;

public class ntri {

	public static void main(String[] args) {
	nt(1,4,0);	// TODO Auto-generated method stub

	}public static void nt(int i,int n,int s)
	{
	if(i>n)
		{System.out.println(s);
	return;}
	else 
	nt(i+1,n,s+i);
	
	//return s;

		
	}
}
