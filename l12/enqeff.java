package l12;

import l10.oops;

public class enqeff {
	protected int[] ar;
	protected int tos;
	protected int s;
	public static final int defc = 10;

	// public enqeff() throws Exception {
	// pri=new
	// }

	
	public enqeff(int c) throws Exception {
		this.s = c;
		ar = new int[s];
		this.tos=-1;
	}

	oops pri;
	oops sec;

	enqeff() throws Exception {
		pri = new oops();
		sec = new oops();
	}

	public int size() {
		return this.tos+1;
	}

	public boolean isempty() {
		if (this.size() == 0)
			return true;
		else
			return false;
	}

	public void enqueue(int it) throws Exception {
pri.push(it);
	}
	
	public int dequeue() throws Exception {
		//System.out.println(pri.size());

		if (pri.size()==0)
			throw new Exception("Underf");

		while (!(pri.size() == 1)) {
			this.sec.push(this.pri.pop());
		}
	
int r=this.pri.pop();
//System.out.println(sec.size());
while(!(this.sec.isempty()))
{	pri.push(sec.pop());
}

return r;

	}
	public void disp() {
		this.pri.disp();
//		int i=0;	while (i<tos) {
//				System.out.print(this.ar[i]+"   ");
//				
//				i++;
//			}System.out.println();
	}

}
