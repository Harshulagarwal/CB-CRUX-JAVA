package l10;

public class oops {

	protected int[] ar;
	protected int tos;
	protected int s;
	public static final int defc = 10;

	public oops() throws Exception {
		this(defc);
	}

	public oops(int c) throws Exception {
		this.s = c;
		ar = new int[s];
		this.tos=-1;
	}
	public int size()
	{int s1=this.tos+1;
	return s1;
		}
	public boolean isempty(){
		if(this.size()==0)
		return true;
		else return false;
	}
public int rettos()
{
	return tos;
}
	public void push(int v) throws Exception {
		if (s-1== this.tos)
			throw new Exception("Overflow");
		this.tos++;
		this.ar[tos] = v;
		
	}

	public int pop() throws Exception {
		if (this.isempty())
			throw new Exception("Underflow");
		int q = this.ar[tos];
		this.ar[this.tos]=0;
		this.tos--;
		return q;
	}

	public void disp() {
	int i=0;	while (i<=tos) {
			System.out.print(this.ar[i]+"   ");
			
			i++;
		}System.out.println();
	}
}
